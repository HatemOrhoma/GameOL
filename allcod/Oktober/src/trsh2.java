
public class trsh2 {
	public static void main (String [] args){
	  int[] array1 = new int[]{1, 2, 3, 4, 6, 7, 8};
	    int[] printArray = insert(array1, 5);
	    
	    
	}
	
	    public static int[] insert(int[] a, int k) {
	        int[] s = new int[a.length + 1];
	        for(int i = 0; i < a.length; i++) {
	            if(k < a[i]) {
	                s[i] = k;
	                for(int j = i + 1; j < s.length; j++) {
	                    s[j] = a[i];
	                    i++;
	                }
	                return s;
	            } else {
	                s[i] = a[i];
	            }
	        }
	        return s;
	    } 
}
