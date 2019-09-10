import java.util.Scanner;
public class EXP {
public static void main( String[] args) {
long basis ;
long exp ;
Scanner sc = new Scanner (System.in);
System.out.print("Geben Sie die Basis ein : ");
basis=sc.nextLong();
System.out.print("Geben Sie den Exponent ein :" );
exp=sc.nextLong();
sc.close();

double res;
res = Math.pow(basis, exp);
System.out.print(res);
}
}
