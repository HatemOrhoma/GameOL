public class Caesar {
         
	
	public static void main(String[] args) {
		 
		String text=args[0];
		int key = Integer.valueOf(args[1]);
		
		String  X ;
		int  shift;
		char[] arrayText ;
		char[] arrayAlphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		text =text.toLowerCase(); 
		arrayText= text.toCharArray(); 
        X = ""; 
             for(int i = 0 ; i < arrayText.length;i++)  
             {
            	 for(int j = 0 ; j< arrayAlphabet.length;j++) 
            	 {
            		 if(arrayText[i]==arrayAlphabet[j]) 
            		 {
            			 shift =j+key;                
            			 
            			 
            			 if(shift >=26)
            				 
            			 {
            				 shift=key%26;   
            				 if((shift+j) >26 && key+j>26)
            				 {
            					 X += arrayAlphabet[(shift +j)-26]; 
            					
            				 }
            				 else
            				 {
            					 if((shift +j)== 26) 
            					 {
            						 X +=arrayAlphabet[0]; 
            					 }else 
            					 {
            					 X += arrayAlphabet[j+shift];
            					 }
            					 
            				 }
            			 }
            			 
            			 else 
            			 {
            				 X += arrayAlphabet[j+key];
            			 }
            		 }
            	 }
             }
             System.out.println(X);
             
	}

}
