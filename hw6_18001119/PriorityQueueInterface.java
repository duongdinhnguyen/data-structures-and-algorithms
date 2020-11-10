package hw6_18001119;

public interface PriorityQueueInterface<K,E> {
	public int size();
	public boolean isEmpty();
	public void insert(Entry<K, E> entry); //thêm một entry vào PQ

	public void insert(K k, E e); //thêm phẩn tử có key k và giá trị e vào PQ
	public Entry<K, E> removeMin(); 
	public Entry<K, E> min();
}
