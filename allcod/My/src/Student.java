
public class Student {
	Studierende a = new Studierende(Hatem, 16519115,1999 , 21.10);
}
	 class Studierende
	 {

	 String studname;
	 int matrikelnummer;
     int geburtsjahr;
	
	 // --- Konstruktor(en) ---
	 Studierende(String name, int nummer, int jahr, int Datum){
	 studname = name;
	 matrikelnummer = nummer;
	 geburtsjahr = jahr;
	 }
	
	 // --- Methoden ---
	 String gibStudname(){
	 return studname;
	 }
	
	 void setzeStudname(String name){
	 studname = name;
	 }
		 int gibMatrikelnummer(){
	 return matrikelnummer;
	 }
	
	 void setzeMatrikelnummer(int nummer){
	 matrikelnummer = nummer;
	 }
	
	 int gibGeburtsjahr(){
	 return geburtsjahr;
	 }
	
	 void setzeGeburtsjahr(int jahr){
	 geburtsjahr = jahr;
	 }
	
	 int gibAlter(){
	 int aktJahr = Datum.gibJahreszahl();
	return aktJahr-geburtsjahr;
	 }
	 }

