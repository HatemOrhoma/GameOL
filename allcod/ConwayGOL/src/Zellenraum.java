
public class Zellraum {
        private int zeilen , spalten;
          private int[][] zelle ;
   
          public Zellraum(int zeilen , int spalten) {
		     
        	  this.zeilen=zeilen;
        	  this.spalten=spalten;
      
        	
	}
         public int[][] getZellen()
         {
        	 
        	 int [][] result = new int[zeilen][spalten];
        	 for(int i = 0 ; i < zeilen;i++) {
        		 for ( int j = 0 ; j<spalten;j++) {
        			 result[i][j] = zelle[i][j];
        			
        		 }
         }
        	 
			return result;
        	 
        
         }
         public void setZellen(int [][] neueZellen) 
         {
        	 int [][] result = new int[zeilen][spalten];
        	 for(int i = 0 ; i < zeilen;i++) {
        		 for ( int j = 0 ; j<spalten;j++) {
        			 result[i][j] = zelle[i][j];
        		 }	 
        	 }
         }
			
   }
