import java.util.ArrayList;

//public class Trash {
	boolean MenschWins=false;
	boolean ComputerWins=false;
	boolean Gleich=false;
	 public void WerGewinnt(Spieler s1,Spieler s2) {
	        int SummeComputer = s1.getHandSumme();
	        int SummeMensch = s2.getHandSumme();
	
	        if(SummeComputer>21)
	        {
	        	if (SummeMensch>21)
	        	{
	        		Gleich=true;
		        	System.out.println("GAME IS SPLIT");

	        	}
	        	else 
	        	{
	        		MenschWins=true;
		        	System.out.println("MENSCH WINS");
		            
	        	}
	        
	        }
	        
	        if(SummeMensch>21)
	        {
	        	if (SummeComputer>21)
	        	{
	        		Gleich=true;
		        	System.out.println("GAME IS SPLIT");

	        	}
	        	else 
	        	{
	        		ComputerWins=true;
		        	System.out.println("COMPUTER WINS");
		            
	        	}
	        
	        }
	        
	        
	        
	        
	        
	        if (SummeComputer > SummeMensch) {
	        	ComputerWins=true;
	        	System.out.println("COMPUTER WINS");
	        	
	        } else if (SummeComputer < SummeMensch) {
	        	MenschWins=true;
	        	System.out.println("MENSCH WINS");
	            
	        } else {
	        	Gleich=true;
	        	System.out.println("GAME IS SPLIT");

	        }
	 
	 }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

public static int getSummeDerKartenwert(ArrayList <Karte>  inHand) 
{
       int Summe = 0;
       for (Karte karte : inHand)
       {	
       	Kartenwert ab = karte.kartenwert;
       	int a = ab.getPunktewert();
       	Summe=a+Summe;
       }
       return Summe;


public Hand split() {
    if (!isSplittable()) {
        return null;
    } else {
        Hand split = new Hand("split");
        split.addCard(cards.remove(1));
        value = cards.get(0).getValue();
        isSplitted = true;
        return split;
    }
}
