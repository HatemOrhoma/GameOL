public class Prog{

	public static void main (String[] args) {
		 Ampel eineAmpel = new Ampel();

		 for (int i = 0; i < 20; i++) {
		 if (i % 2 == 0) {
		 eineAmpel.schalteGruen(false);
		 eineAmpel.schalteRot(true);
		 } else {
		 eineAmpel.schalteGruen(true);
		 eineAmpel.schalteRot(false);
		 }
		 System.out.println(i + "-ter Zustand:");
		 eineAmpel.druckeZustand();
		 }
		
	}		 
	
}
 public class Ampel {

 boolean roteLampe;
 boolean grueneLampe;

 public Ampel() {
 this.roteLampe = false;
 this.grueneLampe = false;
 }

 public void schalteRot(boolean b) {
 this.roteLampe = b;
 }

 public void schalteGruen(boolean b) {
 this.grueneLampe = b;
 }

 public void druckeZustand() {
 String statusRot;
 String statusGruen;

 if(this.roteLampe) {
 statusRot = "an";
 } else {
 statusRot = "aus";
 }

 if(this.grueneLampe) {
 statusGruen = "an";
 } else {
 statusGruen = "aus";
 }

 System.out.println("Die Rote Lampe ist " + statusRot + ".");
 System.out.println("Die Gruene Lampe ist " + statusGruen + "");
}
 }