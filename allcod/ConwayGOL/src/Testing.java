import java.util.Arrays;

public class Testing  
{
public static void main (String []args){
	int small[][]=new int[][]{{0,1,0,1,0,0},{0,1,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0},{0,0,0,11,0,0},{11,0,0,0,0,0}};
	int Big [][]= new int [small.length+2][small.length+2];

		int [][]bc=Arrays.copyOf(Big, 3);
		System.arraycopy( small, 0, Big, 1, 2 );
	//System.arraycopy( small,0, Big, 1, small.length );
	int []a={1,2,3,4,4,5};
     int []b=new int[4];
     
     
     for(int i=0;i<Big.length;i++){
    	 System.arraycopy(b, 0, a, 1, 4);
    	 
     }
    System.out.println(Big[1].length);
	
for (int i = 0; i < small.length; i++) 
	{
		String bcc = Arrays.toString(small[i]);
		System.out.println(bcc);
	}
	//System.out.println(Arrays.toString(bc));
	}


}
