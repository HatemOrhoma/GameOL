   public void push(E e) 
   {
       Node new_node = new Node(e);
       new_node.next = head; 
       head = new_node; 
   } 

   
 /* 
//Einfuegen am Anfang der Liste in O(1)
  public boolean insert(E e)
 {
	   if (isEmpty()) 
	   {
		      head = tail = new Node <E>(e);
	   }
	   else 
	   {
		     current1=head;
		     while(current1.next!=null)
		     {
		    	 current1=current1.next;
		     }
		     current1.next= new Node(e);
	   }
	return true;
 }
  
  */
   
   
   while(!(q.isEmpty()))
   {
 	  E curr=q.getFirst();
 	  insert(curr);
 	  remove(curr);
   }
   
   

private void remove(E curr) {
	
}








mport java.util.Comparator;


public class SingleLinkedList<E> implements PriorityQueue<E> {
	private Knoten <E> erster; // wir initialisieren den Knoten erster
	private Knoten <E> letzter; // wir initialisieren den Knoten letzter
	Comparator <E> vergleich; // um die Knoten zu vergleichen
	
	public SingleLinkedList(Comparator <E> vergleich) {
		this.vergleich = vergleich;
	}
	public boolean insert (E e) { //fügt ein Element in die Priorityqueue ein
		
		//testen, ob der erste Knoten = 0?:
		if (erster == null) { 
			//falls ja, neuen Knoten erstellen:
			Knoten <E> k = new Knoten<E>(e); 
			erster = k; //<-- der Knoten != 0
			//setzten den naechsten Knoten, uebergeben 0 an setNaechster:
			erster.setNaechster(null); 
			// Knoten erster hinten reinstellen um Reihenfolge aufrecht halten zu können:
			letzter = erster; 
			
		} else { // wenn der erste Knoten nicht leer ist:
			Knoten k = new Knoten<E> (e); //<-- erstellen den Hilfsknoten k
			//setzten in den letzten Knoten den Knoten k ein:
			letzter.setNaechster(k);
			letzter = k; //somit halten wir wieder die Reihenfolge aufrecht
		}
		return true; 
	}
@Override
	public void merge(PriorityQueue<E> q) { // fügt alle Elemente aus einer anderen Priority-Queue q ein
		//SingleLinkedList<E> r = (SingleLinkedList<E>) q;
		if (q instanceof SingleLinkedList && !isEmpty()) { //q wird geprueft, ob es SingleLinkedlist && !Empty
		}
		
	} 
	
	public E getMin() { // liefert das kleinste Element in der Priority-Queue
		
		//1. Fall: 
		//um zu prüfen, ob der erste Knoten das kleinste Element beinhaltet:
		Knoten <E> min = erster; // für den Knoten des kleinsten Elements liegen wir den Wert des ersten Knotens fest
		//pointer - zeigt and wo wir uns in der Liste befinden
		Knoten <E> pointer = min.getNaechster(); // wir gehen zum nächsten Knoten
		
		//2.Fall: der pointer/zeiger ist nicht beim ersten Knoten
		while (pointer != null) { 
			
			// vergleich, ob das erste element < ist als das element auf das der pointer zeigt
			if (vergleich.compare(min.getElement(), pointer.getElement()) == 1) {
				// ==1 -> das Objekt ist groesser als das uebergebene Objekt (javatricks.de)
			
				
				min = pointer; // der pointer zeigt auf das kleinste element
				
			}
			//testen dann, ob der naechste Knoten das kleinste Element hat
			pointer = pointer.getNaechster(); 
		}
		return min.getElement();
		
	}
	
	@Override
	public E deleteMin() { //entfernt das kleinste Element
		
		//holen das kleinste Element:
		E min = getMin(); 
		Knoten hilfe = erster; // Hilfsknoten um einen Zwischenwert zu speichern (für den 2. Fall)
		Knoten bevor = null; // wenn hilfe .getInhalt != getMin
		
		
		//1. Fall:
		if (hilfe != null && hilfe.getElement() == getMin()) { 
			//weil erster = min, wird erster mit hilfe von getNaechster ueberschrieben:
			erster = hilfe.getNaechster(); 
			return min; //geben das minimum weiter
			
		}// 2.Fall:
		while (hilfe != null && hilfe.getElement() != getMin()) {
			bevor = hilfe; //bevor - 2. Hilfsknoten
			//wir nehmen den naechsten Knoten:
			hilfe = hilfe.getNaechster(); 
			
		}
		return min;
	}
	
	public boolean isEmpty() { //prüft, ob die Priority-Queue leer ist
		return erster == null;
	}
	
	
}