import java.util.ArrayList;

public class Computerspieler extends Spieler {
	
	public Computerspieler(String Name,Hand Hand ,int Einsatz,int Konto) {
		super(Name, Hand ,Einsatz, Konto);
		}
	
	 public void BotPlay() {
		
		 int CompSumme=getHandSumme();
		 
	        if (CompSumme >= 9 && CompSumme <= 11) {
	        	doublt();
	        	System.out.println("Computer waehlt doublt");
	        
	        }
	        
	        if (CompSumme > 8) {
	        	hit();
	        	System.out.println("Computer waehlt Hit ");

	        }
	        
	        if (CompSumme < 16) {
	            split();
	            System.out.println("Computer waehlt split ");

	        }

	        else {
	        	stand();
	            System.out.println("Computer waehlt Stand ");

	        }
	    }

}