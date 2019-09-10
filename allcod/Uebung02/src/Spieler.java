import java.util.ArrayList;
public class Spieler {
	private final String Name;
	Hand Hand; 
	public  int Einsatz;
	private int Konto;

	 public Spieler(String Name,Hand Hand, int Einsatz, int Konto) 
	 {
	        this.Name = Name;
	        this.Hand =	Hand;
	        this.Einsatz = Einsatz;
	        this.Konto=Konto;
	 }
	 
	 	public Hand getHand ()
	 	{
	 		return this.Hand;
	 	}
	 	public int getKonto()
	 	{
	 		return this.Konto;
	 	}
	 	public int getHandSumme()
	 	{
	 		return this.Hand.getSummeDerKartenwerte();
	 		
	 	}
	 	public void setKonto(int Bouns)
	 	{
		 this.Konto = Konto+Bouns;  // Bouns kann auch negativ sein.
	 	}
	
	 	public void hit()
		{
	 		if(Kartenstapel.StapelSize()!=0)
	 		{
	 		Karte karte =Kartenstapel.KarteZiehen();
	 		Hand.addKarte(karte);
	 		}
	 	}

	 	public String stand()
		{
			String stand="Stand";
			return stand;
		}

		public void split() 
		{
			Hand.splitIt();
		}
		
		
		public void doublt()
		{
		this.Einsatz=this.Einsatz+this.Einsatz;
		hit();
		}
		
		 public static void main (String []args)
		 {
			 
			 
		 }
	}		


