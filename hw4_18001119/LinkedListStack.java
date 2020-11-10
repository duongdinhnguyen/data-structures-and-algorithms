package hw4_18001119;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class LinkedListStack<E> implements StackInterface<E> {
	
	
	class Node{
		E data;
		Node next;
		public Node(E data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
		
	}
	private Scanner sc= new Scanner(System.in);
	private Random random= new Random();
	private int n;
	Node top=null;
	Node stack= null;
	public void input() {
		System.out.println("Scan N : ");
		 n= Integer.parseInt(sc.nextLine());
		if(n<=0) {
			 System.out.println("Rong");
		}
		else {
			// stack : first element
			System.out.println("Random : ");
			Node tmp= stack;
			for(int i=0;i<n;i++) {
				E DATA= (E) new Integer(random.nextInt(20));
				Node newNode= new Node(DATA,null);
				if(tmp== null) {
					stack= newNode;
					tmp=stack;
					top=stack;
					System.out.print(tmp.data+" ");
				}
				else {
					while(tmp.next!= null) {
						tmp=tmp.next;
					}
					tmp.next=newNode;
					stack=tmp.next;
					System.out.print(stack.data+" ");

				}
			}
			
			System.out.println();
			stack();
		}
	}
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		Iterator<E> iterator= new Iterator<E>() {
			Node tmp= top;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return tmp!= null;
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				if(hasNext()) {
					E dataStack=tmp.data;
					tmp=tmp.next;
					return dataStack;
				}
				return null;
				
			}
			
		};
		return iterator;
	}
	public void output() {
		//System.out.println("Linked : ");
		Iterator<E> iterator= iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}
	public void stack() {
		System.out.println("Stack : "+stack.data);
	}
	@Override
	// Add 1 phtu
	public void push(E element) {
		// TODO Auto-generated method stub
		
		Node tmp= stack;
		Node newNode= new Node(element,null);
		if(tmp==null) {
			n++;
			top=newNode;
			stack=top;
			tmp=stack;
		}
		else {
			n++;
			tmp.next=newNode;
			stack=tmp.next;
		}
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if(n==1) {
			n--;
			E element= top.data;
			top=null;
			stack=null;
			return element;
		}
		else if(n>1){
			Node tmp= top;
			while(tmp.next.next!= null) {
				tmp=tmp.next;
			}
			n--;
			Node newNode= tmp.next;
			stack=tmp;

			tmp.next=tmp.next.next;
			return newNode.data;
		}
		else return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(n<=0) {
			return false;
		}
		return true;
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		if(n<=0) {
			return null;
		}
		else {
			return top.data;
		}
	}
	

}
