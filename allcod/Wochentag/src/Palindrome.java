public class Palindrome {
	   public static boolean isPalindrome(char[] a) {
			
		     
	       return isPalindrome(a,0,a.length-1);
	    }

	
   public static boolean isPalindrome(char[] a,int i, int j) {  
	  
     if(i >= j)
     	{

         return true;
         }
     
     
     else if(a[i]!=a[j] && a[i]!=Character.toUpperCase(a[j]) && a[i]!=Character.toLowerCase(a[j])){
         return false;
     }
     else{
                return isPalindrome(a,++i,--j);
         }
}
}