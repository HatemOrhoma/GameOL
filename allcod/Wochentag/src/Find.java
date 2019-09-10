public class BeatTheNeighbours {
	 public static void main (String[] args) 
	    {
	        int boxes[] ={7, 9, 13, 17, 16, 14, 13, 8, 5, 1};
	        System.out.println(findPeak(boxes)); 
	    }
	 
static int strategy(int arr[], int low, int high, int n) 
    { 
        // Find index of middle element 
        int mid = (high+low)/2;  /* (low + high)/2 */
  
        // Compare middle element with its neighbours (if neighbours 
        // exist) 
        if ((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || arr[mid+1] <= arr[mid])) 
            return mid; 
  
        // If middle element is not peak and its left neighbor is 
        // greater than it,then left half must have a peak element 
        else if (mid > 0 && arr[mid-1] > arr[mid]) 
            return strategy(arr, low, (mid -1), n); 
  
        // If middle element is not peak and its right neighbor 
        // is greater than it, then right half must have a peak 
        // element 
        else return strategy(arr, (mid + 1), high, n); 
    } 
  
    // A wrapper over recursive function findPeakUtil() 
    static int findPeak(int arr[]) 
    { 
    	int n = arr.length;
        return strategy(arr, 0, n-1, n); 
    }
}