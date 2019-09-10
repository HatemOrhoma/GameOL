public class BeatTheNeighbours {
	public static int strategy(int boxes[]) 
	    { 
	    	int n = boxes.length;
	        return search(boxes, 0, n-1, n); 
	    }
	
static int search(int box[], int l, int u, int n) 
    { 
        int m = (u+l)/2;
        if ((m == n-1 || box[m+1] <= box[m]) && (m == 0 || box[m-1] <= box[m])) 
            return m; 
        else if ((m > 0) && (box[m-1] > box[m])) 
        		return search(box, l, (m -1), n); 
        	else return search(box, (m + 1), u, n); 
    } 
}