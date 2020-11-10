package hw4_18001119;


public interface QueueInterface <E> extends Iterable<E>{
	void enqueue(E element);
	E dequeue();
	boolean isEmpty();
}
