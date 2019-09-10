import java.util.Arrays;
import java.util.Scanner;

public class MenschlicherSpieler extends Spieler {
	        
		public MenschlicherSpieler(String Name,Hand Hand ,int Einsatz,int Konto) {
		super(Name, Hand ,Einsatz, Konto);
		
		}
		public  void EnterEntscheidung (String eingabe){
			// Die Eingabe wird mit dem Scanner in Partie gelesen
			switch (eingabe)
			{
			
			case "Ziehen" : hit();
			break;
			case "Double" : doublt();
			break;
			case "Stand" : stand();
			break;
			case "Split" : split();
			default: 
	             throw new IllegalArgumentException("Invalid " + eingabe);

			}
			
			}
}
