package miniproj1;

import java.util.Comparator;

public  class SingleLinkedList<E>  implements PriorityQueue<E>{
	private Node<E> head;
    private Node<E> tail;
    public java.util.Comparator comparator;
    private Node <E> current1;
    private Node <E> current2;
    
     SingleLinkedList(Comparator comparator)
    {
    	head = new Node(null);
    	tail = new Node(null);
    	head.next=tail;
    }
    

   public boolean insert(E e) 
   {
       Node new_node = new Node(e);
       new_node.next = head; 
       head = new_node;
	return true; 
   } 


   
   
 
public void merge(PriorityQueue<E> q)
{
  if (!(q instanceof SingleLinkedList))
  {
      System.out.println("not of the same instance");
  }
  else 
  {
	  SingleLinkedList li=(SingleLinkedList) q;
	  li.getLast().setNext(this.getFirst());  
	  
  }
  
  
}

private Node<E> getLast() {
    return (Node<E>)tail;

}


public E getMin() 
{
	Node <E> current = head;
	E min =  current.value;
    
	if (!isEmpty()) 
    {
    	while (current != null)
    		{
    		if (comparator.compare(current,min)<0)		
    			{
    		    min = (E) current;
    			}
    		current = current.next;
    		}
    }
    else 
    {
        System.out.println("empty list");
    }
    return (E) min;
}
 
public E deleteMin()
{
      E minimun =getMin();    

      while (current1.next != null && current1.value!=minimun)
      {
    	  current1 = current1.next;
      }
      if(current1.value==minimun)
      {
    	  	while (current2.next!=current1)
    	  	{
    	  		current2=current2.next;
    	  	}
      }   
return minimun;
}


public boolean isEmpty()
{
    return head==null;
}



public E getFirst() 
{
    return (E) head;
}


@Override
public E getlast() {
	
	return (E)tail;
}

}
class Node<E>
{
	E value;
	Node next;
	public Node(E value) 
	{
        this.value= value;
    }
	
	public void setNext(E e) 
	{
	    this.next = (Node) e;
	}

}


