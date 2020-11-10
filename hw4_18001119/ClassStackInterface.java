package hw4_18001119;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ClassStackInterface<E> implements StackInterface<E> {
	protected E []list;
	protected int n;
	private int defaultSize=10000;
	private Random rd= new Random();
	private Scanner sc= new Scanner(System.in);
	
	public ClassStackInterface(int capacity) {
		n= capacity;
		list= (E[]) new Object[capacity];
	}
	public ClassStackInterface() {
		n=defaultSize; 
		list= (E[]) new Object[defaultSize];
	}
	
	
	public void input() {
		System.out.println("Scan n : ");
		n= Integer.parseInt(sc.nextLine());
		
		if(n>0) {
			//
			for(int i=0;i<n;i++) {
				list[i]= (E) new Integer(rd.nextInt(20));
			}
		}
		else return;
		
	}
	
	
	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		Iterator<E> iterator= new Iterator<E>() {
			private int index= 0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				// if list[index]!= null && index< n
				// return true
				return list[index]!= null && index < n;
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				if(hasNext()) {
					return list[index++];
				}
				return null;
			}
			
		};
		return iterator;
	}

	@Override
	public void push(E element) {
		// TODO Auto-generated method stub
		if(n<0) {
			return;
		}
		else {
		n++;
		list[n-1]= element;
		}
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if(n<=0) {
			return null;
		}
		else {
			E tmp= list[n-1];
			n--;
		return tmp;
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(n>0) {
			return true;
		}
		return false;
	}
	public void ReturnIsEmpty() {
		if(isEmpty()) {
			System.out.println("No");
		}
		else System.out.println("Yes");
	}
	@Override
	public E top() {
		// TODO Auto-generated method stub
		if(n>0) {
			n--;
			return list[n-n];
		}
		else return null;
	}
	public void SystemTop() {
		System.out.println("TopData : "+top());

	}
	
	public void output() {
		Iterator<E> iterator= iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}

}
