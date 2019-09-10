public class zzz {
    	
        public static void main(String args[]) {
		int r=0;
        System.out.println("\nDivided by 3: ");		
	
		for (int i=1; i<36; i++) {
		    	
			if (i%30==0) 
			r++;
			System.out.print(r +", ");			
		}			
				
		System.out.println("\n\nDivided by 5: ");
		for (int i=1; i<10; i++) {
			if (i%5==0) System.out.print(i +", ");			
		}
				
		System.out.println("\n\nDivided by 3 & 5: ");			
		for (int i=1; i<10; i++) {
			if (i%3==0 && i%5==0) System.out.print(i +", ");			
		}
		System.out.println("\n");
        }}	