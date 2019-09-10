public  class Palindromelll  {

public static boolean isPalindrome (char a[])
{
if (a.length<=1) 
{
	return true;
}
else 
	for (int i =0; i<=a.length/2;i++)
	{
		if (a[i]!=a[a.length-i-1] && a[i]!=Character.toUpperCase(a[a.length-i-1]) && a[i]!=Character.toLowerCase(a[a.length-i-1]))
		{
		
			return false;
					
		}
		if (i == a.length/2)
		{
			return true;
		}
	}
return false;
}
}
