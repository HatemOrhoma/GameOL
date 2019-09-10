
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
}}