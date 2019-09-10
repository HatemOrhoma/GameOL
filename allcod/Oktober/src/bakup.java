// Name : Hatim Mahmoud 
// Kurs : T1 
// HA_INF_SortedList



public class Sortedlist {

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
    
    
    
    
    static int insert(int e[], int n, int wert, int overflow)
    {
       
	    overflow = e.length;

        if (n > overflow)
           System.out.println("fehler");
        int i;
        for (i=n-1; (e[i] > wert && i >= 0); i--)
           e[i+1] = e[i];
      
        e[i+1] = wert;
      
        return (n+1);
    }

  


    void print() {
        System.out.print("Elemente der array: ");
        for (int i = 0; i < length; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public Sortedlist(int... array) {
        this.a = array.clone();
        this.length = array.length;
    }

    
    
public static void main (String []args){
Sortedlist arr = new Sortedlist(1,2,5,6);

arr.print();

// Beispiel 1: Es wird nach der Zahl 5 gesucht
int suche = arr.search(5);
System.out.println("//Beispiel 1: Es wird nach der Zahl 5 gesucht");
if (suche < 0) {
    System.out.println("Element nicht gefunden "+ suche);
} else {
    System.out.println("Element gefunden in der position " + suche);
}
System.out.println("// Beispiel 2 : Die Zahl 2 wird gelöscht");



// Beispiel 2 : Die Zahl 2 wird gelöscht
//if (!arr.delete(2)) {
    System.out.println("Element nicht gefunden");
//} 
//arr.print();
// Beispeil 3 :  array wird angezeigt
System.out.println("// Beispeil 3 :  array wird angezeigt");

arr.print();
System.out.println("// Beispeil 4 : Die Zahl 4 wird eingefügt");


// Beispeil 4 : Die Zahl 4 wird eingefügt







int e[] = new int[10];
e[0] = 1;
e[1]=  5;
e[2] = 6;
int overflow = e.length;
int n = 3;
System.out.print("vor dem Einfuegen : ");
for (int i=0; i<n; i++)
System.out.print(e[i] + " ");
System.out.println();
n = insert(e, 3, 4, overflow);
System.out.print("nach dem Einfuegen: ");
for (int i=0; i<n; i++)
System.out.print(e[i] + " ");
}    
}