package hw3_18001119;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class SimpleArrayList<T> implements ListInterface<T> {
	private T[] list;
	private Scanner sc = new Scanner(System.in);
	private Random rd = new Random();
	private int n = 0;
	private int defautSize = 100;

	public SimpleArrayList() {
		list = (T[]) new Object[defautSize];
	}

	
	
	public void input() {
		System.out.println("Nhap so phtu : ");
		
		n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			list[i] = (T) new Integer(rd.nextInt(20));
		}
	}

	@Override
	public void add(T data) {
		// TODO Auto-generated method stub
		n++;
		list[n - 1] = data;
		//System.out.println(list[n-1]);

	}

	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
		if (i > n && i < 0) {
			return null;
		}
		return list[i - 1];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return n;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (list.length > 0)
			return true;
		else
			return false;
	}

	@Override
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

	@Override
	public void set(int i, T data) {
		// TODO Auto-generated method stub
		if (i <= n && i > 0) {
			T temp = list[i - 1];
			 list[i - 1] = data;
		}
	}

	@Override
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

	@Override
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