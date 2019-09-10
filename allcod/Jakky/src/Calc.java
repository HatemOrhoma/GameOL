	import java.util.Scanner;

	public class Calc {
	public static void main(String args []) { 
	double stunden;
	double minuten;
	double sekunden;
	Scanner sc = new Scanner (System.in);
	System.out.println("Geben Sie den Wert in Stunden ein ");
	stunden=sc.nextDouble();
	
double res;
System.out.println("In minuten umgerechnet regibt das :"+ stunden*60);
System.out.println("In sekunden umgerechnet ergibt das : " + stunden*3600);
}
}