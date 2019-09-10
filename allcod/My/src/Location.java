public class Location {
	
	public String name;
	public double latitude;
	public double longitude;
	
	public Location(String name, double latitude, double longitude) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}
}

public class Route {
	
	public Location[] waypoints;
	
	public Route(Location... waypoints) {
		this.waypoints = waypoints;
	}
}

public class GeoHelper {

	public static final double EARTH_RADIUS_IN_KM = 6.371;

	public static double calcGeoDistanceInKm(double lat1, double lat2, double lon1, double lon2){
		double dlat = Math.abs(lat1-lat2);
		double dlon = Math.abs(lon1-lon2);
		double a = Math.pow((Math.sin(dlat/2)), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow((Math.sin(dlon/2)),2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		return EARTH_RADIUS_IN_KM * c;
	}

	public static double calcGeoDistanceInKm(Location location1, Location location2){
		return calcGeoDistanceInKm(location1.latitude, location2.latitude, location1.longitude, location2.longitude);
	}

	public static double calcAngleBetweenGeoLocationsInRadians(double lat1, double lat2, double lon1, double lon2) {
		double dlat = lat2-lat1;
		double dlon = lon2-lon1;
		double angle = (Math.atan2(dlat,dlon) * 180) / Math.PI;
		return Math.toRadians(angle);
	}

	public static double calcAngleBetweenGeoLocationsInRadians(Location location1, Location location2) {
		return calcAngleBetweenGeoLocationsInRadians(location1.latitude, location2.latitude, location1.longitude, location2.longitude);
	}

}

public class GPSsimulator {

	public static final double initialLatitude = 48.138083;
	public static final double initialLongitude = 11.561102;
	public static final double SIMULATOR_MOVEMENT_SPEED = 0.000015; // ~0.05m - 0.1m per step
	public static final double ARRIVAL_RADIUS_IN_KM = 0.05 / 1000;  // 0.05m

	public Location currentLocation = new Location("currentLocation", initialLatitude, initialLongitude);
    
    public int waypointCounter = 0;
	
    public Route simulatedRoute = new Route(
    		new Location("Waypoint 1", 48.137413, 11.561020),
			new Location("Waypoint 2", 48.137370, 11.564539),
			new Location("Waypoint 3", 48.137449, 11.565000),
			new Location("Waypoint 4", 48.137578, 11.565311));
    
	public void move(){
    	Location nextWaypoint = simulatedRoute.waypoints[waypointCounter];
    	if (GeoHelper.calcGeoDistanceInKm(currentLocation, nextWaypoint) < ARRIVAL_RADIUS_IN_KM) {
    		waypointCounter++;
    		if (waypointCounter > simulatedRoute.waypoints.length-1) {
    			currentLocation = new Location("currentLocation", initialLatitude, initialLongitude);
    			waypointCounter = 0;
    		}
    		nextWaypoint = simulatedRoute.waypoints[waypointCounter];
    	}
    	System.out.println("Moving to " + nextWaypoint.name + ". Distance = " + GeoHelper.calcGeoDistanceInKm(currentLocation, nextWaypoint) * 1000 + "m");
    	double angle = GeoHelper.calcAngleBetweenGeoLocationsInRadians(currentLocation, nextWaypoint);
    	double newLat = currentLocation.latitude + Math.sin(angle) * SIMULATOR_MOVEMENT_SPEED;
    	double newLon = currentLocation.longitude + Math.cos(angle) * SIMULATOR_MOVEMENT_SPEED;
    	currentLocation = new Location("currentLocation", newLat, newLon);
    }
    
    public static void main(String[] args) {
    	GPSsimulator gpsSimulator = new GPSsimulator();
    	for (int i = 0; i < 500; i++) { // testing 500 steps of the simulator
    		gpsSimulator.move();
		}
	}
	
}