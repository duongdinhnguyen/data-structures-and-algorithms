package hw6_18001119;

 
public class SortedArrayPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface {

	protected static class ArrEntry<K, E> implements Entry<K, E> {
		K key;
		E element;

		public ArrEntry(K k, E e) {
			this.key = k;
			this.element = e;
		}

		@Override
		public String toString() {
			return "(" + key + " ; " + element + ")";
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
	ArrEntry<K, E>[] array;

	public SortedArrayPriorityQueue() {
		array = new ArrEntry[defaultsize];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return n;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (n > 0) {
			return true;
		} else
			return false;
	}

	@Override
	public void insert(Entry entry) {
		// TODO Auto-generated method stub
		ArrEntry newArr= (ArrEntry) entry;
		
		if(n==0) {
			n++;
			array[n - 1] = newArr;

		}
		else if(n>0) {
			n++;
			for(int i=0;i<n-1;i++) {
				if(((Comparable) newArr.key).compareTo(array[i].key)<0) {
					move(i);
					array[i]= newArr;
					return;
				}
				
			}
			array[n-1]= newArr;


		}
				
	}

	@Override
	public void insert(Object k, Object e) {
		// TODO Auto-generated method stub
		ArrEntry newArr= new ArrEntry(k,e);
		if(n==0) {
			n++;
			array[n - 1] = newArr;

		}
		else if(n>0) {
			n++;
			for(int i=0;i<n-1;i++) {
				if(((Comparable) newArr.key).compareTo(array[i].key)<0) {
					move(i);
					array[i]= newArr;
					return;
				}
				
			}
			array[n - 1] = newArr;

		}
		
		
	}
	public void move(int k) {
		
		for(int i=n-1;i>k;i--) {
				array[i]= array[i-1];			
		}
	}

	public void Move() {
		for(int i=0;i<n;i++) {
			array[i]=array[i+1];
		}
	}
	
	@Override
	public Entry removeMin() {
		// TODO Auto-generated method stub
		ArrEntry temp= array[0];
		Move();
		array[n-1]=null;
		n--;
		return  temp;
	}

	@Override
	public Entry min() {
		// TODO Auto-generated method stub
		int k=0;
		for(int i=0;i<n;i++) {
			if( ((Comparable<K>) array[i].getKey()).compareTo(array[k].getKey())<0) {
				k=i;
			}
		}
		
		return array[k];
		 
	}

	public void move(int i, int j) {
		ArrEntry temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public void SortK() {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i].key.compareTo(array[j].key)>0) {
					move(i,j);
				}
			}
		}
	}
	
	public void output() {
		for (int i = 0; i < n; i++) {
			System.out.print(array[i].toString() + " ");
		}
		System.out.println();
		
	}
}