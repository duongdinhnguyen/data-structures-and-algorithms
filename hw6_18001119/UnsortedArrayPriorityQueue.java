package hw6_18001119;

public class UnsortedArrayPriorityQueue<K extends Comparable<K>, E> implements PriorityQueueInterface <K,E>{

	protected static class ArrEntry <K,E>implements Entry<K, E> {
		K key;
		E element;

		public ArrEntry(K k, E e) {
			this.key=k;
			this.element=e;
		}
		
		
		@Override
		public String toString() {
			return "(" + key + " ; " + element+")" ;
		}


		@Override
		public K getKey() {
			// TODO Auto-generated method stub
			return this.key;
		}

		@Override
		public E getValue() {
			// TODO Auto-generated method stub
			return this.element;
		}
	}

	int n = 0;
	int defaultsize = 1000;
	ArrEntry<K,E>[] array;
	
	
	
	
	
	public UnsortedArrayPriorityQueue() {
		array=  new ArrEntry[defaultsize];
	}
	
	public void output() {
		for(int i=0;i<n;i++) {
			System.out.print(array[i].toString()+" ");
		}
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return n;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(n>0) {
			return true;
		}
		else return false;
	}
	@Override
	public void insert(K k, E e) {
		// TODO Auto-generated method stub
		n++;
		array[n-1]=  new ArrEntry<K,E>(k,e);
	}
	
	
	
	public void move(int k) {
		
		for(int i=k;i<n-1;i++) {
				array[i]= array[i+1];			
		}
	}
	
	@Override
	public Entry<K, E> removeMin() {
		// TODO Auto-generated method stub
		int k=0;
		for(int i=0;i<n;i++) {
			if(((Comparable<E>) array[i].getValue()).compareTo(array[k].getValue())<0) {
				k=i;
			}
		}
		ArrEntry temp= array[k];
		move(k);
		n--;
		return  temp;
	}
	@Override
	public Entry<K, E> min() {
		// TODO Auto-generated method stub
		int k=0;
		for(int i=0;i<n;i++) {
			if( ((Comparable<K>) array[i].getKey()).compareTo(array[k].getKey())<0) {
				k=i;
			}
		}
		
		return array[k];
	}
	@Override
	public void insert(Entry<K, E> entry) {
		// TODO Auto-generated method stub
		n++;
		array[n-1]=(ArrEntry<K, E>) entry;
	} 
}