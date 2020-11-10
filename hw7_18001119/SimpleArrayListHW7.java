package hw7_18001119;
import java.util.Iterator;

public class SimpleArrayListHW7<T>{
	private T[] list;
	private int n = 0;
	private int defautSize = 100;

	public SimpleArrayListHW7() {
		list = (T[]) new Object[defautSize];
	}

	
	public void swap(int i,int j) {
		T temp = list[i];
		list[i]= list[j];
		list[j]= temp;
	}
	
	public void Searching(T newT) {
		for(int i=0;i<n;i++) {
			if(list[i]==newT) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
		
	}
	
	public void Sort() {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(((Comparable) list[i]).compareTo(list[j])>0) {
					swap(i,j); 
				}
			}
		}
	}

	
 	public void add(T data) {
		// TODO Auto-generated method stub
		
		if(n>=0) {
			n++;
			list[n-1]= data;
		}
		else return;

	}

	
	public T get(int i) {
		// TODO Auto-generated method stub
		if (i > n && i < 0) {
			return null;
		}
		return list[i - 1];
	}

	
	public int size() {
		// TODO Auto-generated method stub
		return n;
	}

	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return n==0;
	}

	
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		Iterator<T> iterator = new Iterator<T>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return list[index] != null && index < n;
			}

			@Override
			public T next() {
				// TODO Auto-generated method stub
				if (hasNext()) {
					return list[index++];
				}
				return null;
			}
		};

		return iterator;
	}
	
	public void Out() {
		Iterator<T> iter= iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
	}
	
	
	
	public void set(int i, T data) {
		// TODO Auto-generated method stub
		if (i <= n && i > 0) {
			 list[i - 1] = data;
		}
		else return;
	}

	
	public void remove(T data) {
		// TODO Auto-generated method stub
		if (n <= 0) {
			System.out.println("List rong");
		} else if (n == 1) {
			if (list[n - 1].equals(data)) {
				System.out.println("List rong");

			}
		}
		for (int i = 0; i < n; i++) {
			
			
				if (list[i].equals(data)) {
					for (int j = i; j < n - 1; j++) {
						list[j] = list[j + 1];
					}
					n--;
					i--;
				
			}
		}

	}

	
	public boolean isContain(T data) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			if(list[i].equals(data)) {
				return true;
			}
		}
		return false;
	}


	
}