
public class Hanoi {
	
		  public static void main(String[] args) {
		    bewegeScheibe (3, "A", "B", "C"); 
		  }
		  public static void bewegeScheibe (int Scheiben, String von, String hilfsstab, String  nach){
		    if (Scheiben>0) {
		      bewegeScheibe (Scheiben-1, von, hilfsstab, nach); 
		      System.out.println (Scheiben + ".te Scheibe von " + von + " nach " + nach);
		      bewegeScheibe (Scheiben-1, hilfsstab, nach, von);
		    } 
		  }
		}
