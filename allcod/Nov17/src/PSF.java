class PSF{

  public static void main (String[] arg) {
    SortedList test = new SortedList();
 
    System.out.println("Die Array am Anfang: ");
    test.print()  ;
  System.out.println();
    
    test.delete(11);
    System.out.println("Die Array nach dem Löschen 11: ");
    test.print();
    System.out.println();
    
    
    test.delete(11);
    System.out.println("Die Array nach dem Versuch, das Element 11 noch einmal zu löschen: ");
    test.print();
    System.out.println();
    
    
    test.insert(1);
    System.out.println("Die Array nach dem Einfügen 1: ");
    test.print() ;
    System.out.println();
    
    test.insert(1);
    System.out.println("Die Array nach dem Versuch, das Element 1 noch einmal einzufüen: ");
    test.print() ;
    System.out.println();
    
    test.insert(7);
    System.out.println("Die Array nach dem Einfügen 7: ");
    test.print() ;
    System.out.println();
       
    System.out.println("Versuch: Noch ein Element, einzufügen: ");
    test.insert(11);
    System.out.println();
    
    System.out.println
("Welche Position hat das Element 7? ");
    System.out.println(test.search(7));
    
    System.out.print("Welche Position hat das Element 99? ");
    System.out.print(test.search(99));
    System.out.println();
    
  }
}
  
class SortedList  {
  int a[] =   {3,4,5,9,11,12,13,14,15};
  int length = a.length;
  boolean overflow = false;
  
  public void insert (int x ) {
    
    if (!overflow) {
      if (search (x) == -1) {
        int i = 0;
        int b[] = new int[length+1];
        while (i!= length) {
          
          if (x>a[length-1]) {
            
            b[length] = x;
            b [i] = a[i];
          
          
          }else if (x<a[0]){
            
            b[0] = x;
            b [i+1] = a[i];
              
          }else{
            
            if (x> a[i] && x< a[i+1] ) {
              
              b[i+1] = x;
              b [i] = a[i];  
            }else if ( x>a[i]){
              b [i] = a[i];
            } else if (x<a[i]){
              b [i+1] = a[i];
            }
            
          } 
          i++;
        }
        
        a = b;
        length = a.length;
        System.out.println ("Das Element " + x + " wurde erfolgreich in die Liste eingefügt!");
        if (length == 10) {overflow=true;}
        
      } else {System.out.println ("Error: Das Element " + x + " steht schon in der Liste!");}
      
    } else {System.out.println ("Error: Die Array hat schon die maximale Größe von 10 Elementen erreicht!");}
    
  } 
    
        

      
  public void print(){
    int i=0;
    System.out.print ("{");
    
    while (i != length) { 
      
      if (i == length-1) {
    	  System.out.print(a[i]);
      }else{
    	  System.out.print(a[i]+" , ");   
      } 
      
      i++;
    }
    System.out.println ("}"); 
  }
  
  public void delete (int x ) {
    if (search(x) != -1) {
      int i = 0;
      int b[] = new int[length-1];
      
      while (i != length-1) { 
        if ( i<search(x)){
          b [i] = a[i];
        } else {
          b [i] = a[i+1];
        } 
        i++;
      } 
      
      a = b;
      length = a.length;
      System.out.println ("Das Element " + x + " wurde erfolgreich gelöscht!");
    } else {
    	System.out.println ("Error: Das Element " + x + " steht überhaupt nicht in der Liste!");           
    } 
    
  }
  
  public int search (int x ) {
    int i=0;
    int Position=-1;
    while (i!=length) { 
      if (x ==a[i]) {
        Position= i;
      } 
      i++;
    }
    return Position;  
  }    
}
      
      
      
      
      