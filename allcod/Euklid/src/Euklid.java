
public class Euklid {
		  public static void main(String []args){
		    int x=28; int y=20;
		    int rest=x%y;
		    System.out.print("ggT("+x+","+y+")=");
		    while (rest>0) { 
		      x=y;
		      y=rest;
		      rest=x%y;      
		      //Invarante: ggT teilt x, y und rest
		    } // end of while
		    System.out.print(y);
		  }
} 
