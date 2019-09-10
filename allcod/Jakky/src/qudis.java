public class qudis {
	     public static void main(String[] args) {
	         int m = 5; 
	         int k = 0;
	     while (k<=m){
	        System.out.println(fib(k));
	        k++;}
	     }
	 static int fib(int n) {
	     if (n==0||n==1)return 1; 
	     else return fib (n-2)+fib(n-1);
	 }
}