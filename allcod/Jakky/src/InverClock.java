import java.util.Scanner;
public class InverClock {
public static void main (String [] args) { 
Scanner sc = new Scanner(System.in);
int x;
System.out.println("Geben Sie den Wert in Sekunden ein");
x =sc.nextInt();
int b = x%3600; 
int c = b%60;
System.out.println(x/3600+":"+ b/60+":"+c);
System.out.println("Thanks for testing");
}
}