
public class Clever {
public static int summe(int n){
if (n <1)
	
return n; 

while ( n>=2){
	
	return (n) + summe(n-1);
}
return n;
}
public static void main(String[] args) {
	int n = 5;
	System.out.println(summe(n));
	
}
}