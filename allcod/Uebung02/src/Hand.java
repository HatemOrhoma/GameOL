import java.util.ArrayList;

public class Hand {
	
	
	
    private boolean isSplitted = false;
    private ArrayList<Karte> karten;

    public Hand() {
        this.karten = new ArrayList<Karte>();
    }

    public Hand(ArrayList<Karte> karten) {
        this.karten = karten;
    }

    public ArrayList<Karte> ZeigeKarten()
    {
    	
        return this.karten;
    	
    }
           
    public void addKarte(Karte karte) {
    	
    		this.karten.add(karte);
    
    	
    }
    public int size() {
		return this.karten.size();
	}

	public Karte get(int i) {
		return this.karten.get(i);
	}
	public int getWert(int i)
	{
		Karte z = this.karten.get(i);	
		Kartenwert ab = z.kartenwert;
       	int a = ab.getPunktewert();
       	return a;
	}
    
    public int getSummeDerKartenwerte() {
        int Summe = 0;

        for (Karte karte: karten) {
        	Kartenwert ab = karte.kartenwert;
           	int a = ab.getPunktewert();
        	Summe=a+Summe;
        }
        return Summe;
    }
    public boolean isSplittable() {
    	int Wert1= getWert(0);
    	int Wert2 =getWert(1);
        return ((karten.size() == 2) && ( ( Wert1==  Wert2)) && !this.isSplitted);
    }
    
    public Hand splitIt() {
        if (!isSplittable()) 
        {
            return null;
        } 
        else 
        {
            Hand Hand2 = new Hand();
        
           Hand2.addKarte(karten.remove(1));
         
            isSplitted = true;
            return Hand2;
        }
    }
    
    
    
    
    
    @Override
    public String toString() {
        return String.valueOf(karten);
    }


}