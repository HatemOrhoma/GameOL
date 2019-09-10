
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Stack;

	public class Kartenstapel {
	

		static Stack<Karte> Karten = new Stack<Karte>();
		
		public static void KartenstapelPeoplicat()
		{ 
			List<Farbwert> Farb = Arrays.asList(Farbwert.class.getEnumConstants());
			List<Kartenwert> KartenwertList = Arrays.asList(Kartenwert.class.getEnumConstants());

			for(Farbwert  f : Farb)
			 {
			    for(Kartenwert k : KartenwertList )
			    {
			    	Karten.push(new Karte(f,k));
			    }
			 }
		}
		
		private static void mischen()
		{
			Collections.shuffle(Karten);
		}
		public static int StapelSize()
		{
			
			return Karten.size();
			
			
		}
		public static Karte KarteZiehen()
		{
			if (Karten.size()<10)
			{
				KartenstapelPeoplicat();
				mischen();
			}
			
			Karte k = Karten.pop();
			return k;
		}
		
		public static void main (String [] args )
		{
			KartenstapelPeoplicat();
			while (!Karten.isEmpty())
			{
				mischen();
				System.out.println();
				KarteZiehen ();
				System.out.println(Karten);
				mischen();
				System.out.println(Karten);
			}
			
		}
		
	}		
	

