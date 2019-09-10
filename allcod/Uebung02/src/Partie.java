import java.util.Scanner;

public class Partie {
	
	static boolean MenschWins=false;
	static boolean ComputerWins=false;
	static boolean Gleich=false;
	 public static void WerGewinnt(Spieler s1,Spieler s2) {
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
	        if (!ComputerWins &&!Gleich &&!MenschWins )
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

	        
	        
	 
public static void main (String [] args ) 
{
	
System.out.println("Spiel Beginnt :\n============================ ");
int ComputerKonto=5000;
int Computereing=500;
Computerspieler ComputerSp = new Computerspieler  ("Computer",new Hand() ,Computereing,ComputerKonto);
System.out.println("gewaehlter Einsatz vom Computer => "+Computereing);



System.out.println("Geben Sie Ihren Einsatz in postiven Zahlen ein := "); 
Scanner sc = new Scanner(System.in);
int eing = sc.nextInt();


int MenschEinsz=eing;
System.out.println("gewaehlte Einsatz vom Mensch => "+MenschEinsz);
System.out.println();


System.out.println("Einsatz");
System.out.println("=======================");
System.out.println(" Computer " + "|| "+ " Mensch" );
System.out.println("=======================");
System.out.println("   "+MenschEinsz+"    ||  "+Computereing+"   ");
System.out.println("=======================");
System.out.println();


int MenschKonto=4500;
MenschlicherSpieler MenschSp= new MenschlicherSpieler("Mensch",new Hand(),eing,MenschKonto);

System.out.println("Konto");
System.out.println("=======================");
System.out.println(" Computer " + "|| "+ " Mensch" );
System.out.println("=======================");
System.out.println("   "+MenschKonto+"    ||  "+ComputerKonto+"   ");
System.out.println("=======================");
System.out.println();



System.out.println("Computer Karte 1 : ");

Karte a = Kartenstapel.KarteZiehen();
ComputerSp.getHand().addKarte(a);
System.out.println(ComputerSp.getHand().ZeigeKarten());

System.out.print("Summe von Karten => ");
System.out.println( ComputerSp.getHandSumme());





System.out.println("Computer Karte 2 : ");
Karte b = Kartenstapel.KarteZiehen();
ComputerSp.getHand().addKarte(b);
System.out.println(ComputerSp.getHand().ZeigeKarten());

System.out.print("Summe von Karten => ");
System.out.println( ComputerSp.getHandSumme());
System.out.println();


System.out.println("Spieler 2 Karte 1 : ");
Karte c = Kartenstapel.KarteZiehen();
MenschSp.getHand().addKarte(c);
System.out.println(MenschSp.getHand().ZeigeKarten());

System.out.print("Summe von Karten => ");
System.out.println(MenschSp.getHandSumme());


System.out.println("Spieler 2 Karte 2 : ");
Karte d = Kartenstapel.KarteZiehen();
MenschSp.getHand().addKarte(d);
System.out.println(MenschSp.getHand().ZeigeKarten());

System.out.print("Summe von Karten => ");
System.out.println( MenschSp.getHandSumme());
System.out.println();




System.out.println("Computer Entscheidung Eingebe: ");
System.out.println();

System.out.println("Computer Entscheidet . . . ");
ComputerSp.BotPlay();

System.out.println(ComputerSp.getHand().ZeigeKarten());




System.out.println("Spieler 2:  Entscheidung Eingebe: ");
System.out.println("Spieler 2:  (Auswahl) Entscheidung als Wort : \nZiehen\nDouble\nStand\nSplit");
System.out.println("Geben Sie Ihre Entscheidung => "); 
Scanner sca = new Scanner(System.in);
String EntScheidungEingabe = sca.nextLine();

MenschSp.EnterEntscheidung(EntScheidungEingabe);

System.out.println(ComputerSp.getHand().ZeigeKarten());
System.out.println(MenschSp.getHandSumme());
WerGewinnt(ComputerSp,MenschSp);



if(MenschWins)
{
	MenschSp.setKonto(MenschSp.getKonto()+MenschEinsz+Computereing);
}
if(ComputerWins)
{
	ComputerSp.setKonto(ComputerSp.getKonto()+MenschEinsz+Computereing);
}

System.out.println("Konto nach dem Spiel" );
System.out.println("Konto");
System.out.println("=======================");
System.out.println("  Mensch " + "|| "+ " ComputerSp" );
System.out.println("=======================");
System.out.println("   "+MenschSp.getKonto()+"    ||  "+ComputerSp.getKonto()+"   ");
System.out.println("=======================");
System.out.println();





}
}
