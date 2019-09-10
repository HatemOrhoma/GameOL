
	// Name : Hatim Mahmoud
	// Kurs : T1 
	// HA_INF_SortedList

	public class Sortedlist1 {

	    public  int[] a;
	    public int length;
	    public boolean overflow;

		
	    int search(int wert ) {
	        for (int i = 0; i < length; i++) {
	            if (a[i] == wert) {
	                return i;
	            }
	        }
	        return wert-1;
	    }
	    
	    
	    boolean delete(int wert) {
	        for (int i = 0; i < length; i++) {
	            if (a[i] == wert) {
	                --length;
	                for (; i < length; ++i) {
	                    a[i] = a[i + 1];
	                }
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    
	    
	    static int insert(int a[], int n, int wert, int overflow)
	    {
	       
		    overflow = a.length;

	        if (n > overflow)
	           System.out.println("fehler: Maximale laenge ! ");
	        int i;
	        for (i=n-1; (a[i] > wert && i >= 0); i--)
	           a[i+1] = a[i];
	      
	        a[i+1] = wert;
	      
	        return (n+1);
	    }

	 


	    void print() {
	        System.out.print("Elemente der array: ");
	        for (int i = 0; i < length; ++i) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println();
	    }
	    
	    public Sortedlist1(int... array) {
	        this.a = array.clone();
	        this.length = array.length;
	    }

	
	    
	public static void main (String []args){
	Sortedlist arr = new Sortedlist(1,2,5,6,7,8,9,10);

	arr.print();

	// Beispiel 1: Es wird nach der Zahl 5 gesucht
	int suche = arr.search(5);
	System.out.println("//Beispiel 1: Es wird nach der Zahl 5 gesucht");
	if (suche < 0) {
	    System.out.println("Element nicht gefunden "+ suche);
	} else {
	    System.out.println("Element gefunden in der position " + suche);
	}
	System.out.println("// Beispiel 2 : Die Zahl 2 wird geloescht");



	// Beispiel 2 : Die Zahl 2 wird gelöscht
	if (!arr.delete(2)) {
	    System.out.println("Element nicht gefunden");
	} 
	// Beispeil 3 :  array wird angezeigt
	System.out.println("// Beispeil 3 : Array wird nun wieder angezeigt");

	arr.print();
	System.out.println("// Beispeil 4 : Die Zahl 4 wird eingefuegt");


	// Beispeil 4 : Die Zahl 4 wird eingefügt

	int neu[] = new int[arr.length+1];
	neu[0] =1;
	neu[1]= 5;
	neu[2] =6;
	neu[3]= 7;
	neu[4]= 8;
	neu[5]= 9;
	neu[6]= 10;


	int overflow = neu.length;
	int n = arr.length;

	System.out.print("vor dem Einfuegen : ");
	for (int i=0; i<n; i++)
			System.out.print(neu[i] + " ");
				System.out.println();
				
	n = insert(neu,  arr.length, 4, overflow);
		System.out.print("nach dem Einfuegen: ");
			for (int i=0; i<n; i++)
					System.out.print(neu[i] + " ");
	}    
	}



