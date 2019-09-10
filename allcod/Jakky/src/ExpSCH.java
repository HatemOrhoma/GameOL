import java.util.Scanner;

public class ExpSCH {
public static double exp(long basis,long expo)
{
if (expo==0)
	return 1;
	if (expo%2==0)	
	return exp(basis,expo/2)*(exp(basis,expo/2));
else return basis*exp(basis,--expo);
}	
public static void main (String []args ){
Scanner sc = new Scanner (System.in);
	System.out.println("Geben Sie die Basis ein" );
	long basis = sc.nextLong();	
	System.out.println("Geben Sie den Exponent ein ");
Scanner sb = new Scanner (System.in);
	long expo =sb.nextLong() ;
	System.out.println();
System.out.println(basis+"^"+expo+" = "+exp(basis,expo));
}
}
//ich habe den "Scanner" benutzt , da die In -und Out klassen bei Java-Editor nicht funktionieren 
