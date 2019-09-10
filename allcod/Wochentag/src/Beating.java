public class Beating {
	public static void main (String [] args)
	{
		int a =  strategy(new int[]{1, 2,
				43, 4, 5});
		System.out.print(a-1);
		
	}

	public static int strategy(int[] boxes)
	{
	return search ((boxes.length+1)/2,(boxes.length+1)/2+1,boxes);
	}
		public static int search (int l, int u, int [] boxes )
		{
			if(l==u) return u ; 
			else 
			{
			int m = (l+u)/2;	
			if (boxes[m] <= boxes [m+1]) 
				{
				return search (m+1,u,boxes);
				}
			else 
				{
				return search(l	,m,boxes);
				}
				
			}
			
		}
	}
	


