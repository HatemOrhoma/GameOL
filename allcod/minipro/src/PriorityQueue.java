import java.util.Comparator;

public interface PriorityQueue<E> {

    boolean insert(E e);
    void merge(PriorityQueue<E> q);
    E getMin();
    boolean isEmpty();
    E deleteMin();
	E getFirst();
	E getlast();

}
