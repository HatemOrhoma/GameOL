
public class kKartenwertPunkt {
	public enum Kartenwert 
	{
	Zwei(2),Drei(3),Vier(4),Fuenf(5),Sechs(6),Sieben(7),Acht(8),Neun(9),Zehn(10),Dame(10),Koenig(10),Ass(11),Bube(11);
		  	int wert;
		    Kartenwert(int wert) {
		        this.wert = wert;
		    }
		    public int getPunktewert() {
		        return wert;
		    }
		}


}
public enum tKartenwert 
{
Zwei,Drei,Vier,Fuenf,Sechs,Sieben,Acht,Neun,Zehn,Dame,Koenig,Ass,Bube;

public static int getPunktewert() {
	// TODO Auto-generated method stub
	return 0;
}
}