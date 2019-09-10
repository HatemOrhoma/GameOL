
public class SSS {
public static  void print(int n ){
if (n>10){

print(n/10);
System.out.println(n%10);

}
else{ 
	System.out.println(n);
}
}
public static void main (String []args ){
	int n = 123;
print (n);
}
}