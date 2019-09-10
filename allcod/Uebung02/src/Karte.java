public class Karte
{
	Farbwert farbwert;
	 Kartenwert kartenwert;
	
	public Karte(Farbwert farbwert, Kartenwert kartenwert) 
	{
        this.farbwert = farbwert;
        this.kartenwert = kartenwert;
    }
    public Farbwert getFarb() 
    {
        return farbwert;
    }
    public  Kartenwert getKartenwert() {
        return kartenwert;
    }
	public String toString() 
	{
		return farbwert + "-" + kartenwert ;
	}
	
	
}