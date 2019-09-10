
public class fri {
	public static void main (String[]args ){
	  int[] x = {1,2,5,7 };
	    //Declare an int array with length = x.length+1;
	    int[] bigger = new int[x.length+1];
	    int add = 3;
	    /** Define a variable to indicate that if a property location is found.*/
	    boolean found = false;
	    /** Define a variable to store an index for insert*/
	    int indexToInsert = 0;

	    for (int i = 1; i < x.length+1; i++){
	         if ( !found && add <= x[i]){
	             found = true;
	             indexToInsert = i;
	             bigger[indexToInsert] = add;
	             i--;
	         }
	         else{
	             if(found)
	             {
	                 bigger[i+1] = x[i]; 
	             }else
	             {
	                 bigger[i] = x[i];
	             }

	         }
	 		System.out.print(bigger[i]+" ");

	    }

	    /*
	     * If a property index is not found. Then put the value at last. 
	     */
	    if(!found)
	    {
	        indexToInsert = x.length;//
	        bigger[indexToInsert] = add;
	    }

	}
	}

