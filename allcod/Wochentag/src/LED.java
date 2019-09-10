import java.util.Arrays;

public class LED {
static int[][][] digits = new int[][][]{
{
{1, 1, 1},
{1, 0, 1},
{1, 0, 1},
{1, 0, 1},
{1, 1, 1}
},
{
{0, 0, 1},
{0, 0, 1},
{0, 0, 1},
{0, 0, 1},
{0, 0, 1}
},
{
{1, 1, 1},
{0, 0, 1},
{1, 1, 1},
{1, 0, 0},
{1, 1, 1}
},
{
{1, 1, 1},
{0, 0, 1},
{1, 1, 1},
{0, 0, 1},
{1, 1, 1}
},
{
{1, 0, 0},
{1, 0, 0},
{1, 1, 1},
{0, 1, 0},
{0, 1, 0}
},
{
{1, 1, 1},
{1, 0, 0},
{1, 1, 1},
{0, 0, 1},
{1, 1, 1}
},
{
{1, 0, 0},
{1, 0, 0},
{1, 1, 1},
{1, 0, 1},
{1, 1, 1}
},
{
{1, 1, 1},
{0, 0, 1},
{0, 0, 1},
{0, 0, 1},
{0, 0, 1}
},
{
{1, 1, 1},
{1, 0, 1},
{1, 1, 1},
{1, 0, 1},
{1, 1, 1}
},
{
{1, 1, 1},
{1, 0, 1},
{1, 1, 1},
{0, 0, 1},
{0, 0, 1}
}
};
public static void put(int character [][],int display[][],int offsetx,int offsety ) 
{
	for (int i  = 0 ; i<3 ; i++)
	{
		for (int j = 0 ; j < 5;j++)
		{
			display[i+offsetx][j]=character[j][i];
		}
	}
	
}

public static void main(String [] args) {
	int spalten = 3; 
	int display[][] = new int [spalten*3][5];
	
	int input = 123 ; 
	for (int postion = spalten - 1 ; postion >=0 ;postion--)
	{
	int digit = input %10; 
	put(digits[digit],display,postion*3,0);
	input = input / 10 ;
	}
	
	for (int i = 0 ; i <5; i++ )
	{
		for (int j = 0 ; j < 9 ; j++)
		{
			System.out.print(display[j][i]);
		}
		System.out.println();
	}
}
}