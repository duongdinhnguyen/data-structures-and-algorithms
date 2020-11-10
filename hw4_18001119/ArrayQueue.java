package hw4_18001119;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ArrayQueue<E> implements QueueInterface<E> {
	private E list[];
	private int n=0;								// So luong phan tu co giatri
	private int topIndex=0; 						// chi so pt dau
	private int botIndex;							//	chi so pt cuoi
	private int defaultSize=10000;
	private Scanner sc= new Scanner(System.in);
	private Random rd= new Random();
	
	public ArrayQueue() {
		list= (E[]) new Object[defaultSize];
	}
	public ArrayQueue(int ArrayIndex) {
		n= ArrayIndex;
		list=(E[]) new Object[ArrayIndex];
	}
	
	
	public void input() {
		System.out.println("Scan N :");
		n= Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<n;i++) {
			list[i]= (E) new Integer(sc.nextLine());
		}
		botIndex=n-1;
	}
	
	
	
	public void output() {
		size();
		System.out.println("List :");
		Iterator<E> iterator= iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		System.out.println("*****************");

	}
	
	// khi xoa 1 pt thi dich nen 
	public void swap(E[] list, int index) {
		for(int i=index;i<n-1;i++) {
				list[i]=list[i+1];
			
		}
	}
	
	public void size() {
		System.out.println("Size : "+n);
	}
	
	
	@Override
	public void enqueue(E element) {
		// TODO Auto-generated method stub
		if(n<0 ) {									// n < 0 thoat
			return ;
		}
		
		else if(n>=list.length) {
			System.out.println("Full");
			 
		}
		else {
			n++;
			list[n-1]=element;
			botIndex=n-1;
		}
		
		
	}
	
	
	
	
	
	@Override 
	public E dequeue() {
		// TODO Auto-generated method stub
		System.out.println("DeQueue : ");
		if(n==1) {
				n--;
				E element= list[topIndex];
				list[topIndex]=null;
				return element;

			
		}
		else if(n>1){
				
				E element= list[topIndex];
				swap(list,topIndex);
				n--;
				return element;

			
		}
		else return null;
		
	}
	
	
	
	
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(n>0) {
			return true;
		}
		else return false;
	
	}
	public void outputisEmpty() {
		if(isEmpty()) {
			System.out.println("No");
		}
		else System.out.println("Yes");
	}
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		Iterator<E> iterator= new Iterator<E>() {
			int index= topIndex;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return list[index]!= null && index<n;
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
	

}
