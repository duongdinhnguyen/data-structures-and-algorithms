package hw4_18001119;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class LinkedListQueue<E> implements QueueInterface<E> {
	
	Node top=null;
	Node bot=null;
	private int n;
	private Scanner sc= new Scanner(System.in);
	private Random rd= new Random();
	class Node {
		E data;
		Node next;
		public Node(E data, LinkedListQueue<E>.Node next) {
			super();
			this.data = data;
			this.next = next;
		}
		
	}

	
	
	public void input() {
		System.out.println("Scan n : ");
		n=Integer.parseInt(sc.nextLine());
		if(n<=0) {
			System.out.println("Rong");
		}
		else {
			System.out.println("Random : ");
			
			Node tmp=top;
			for(int i=0;i<n;i++) {
				E data= (E) new Integer(rd.nextInt(20));
				Node newNode= new Node(data,null);
				if(tmp==null) {
					
					top=newNode;
					tmp=top;
					System.out.print(tmp.data+" ");
				}
				else {
					while(tmp.next!= null) {
						tmp=tmp.next;
					}
					tmp.next=newNode;
					bot=tmp.next;
					System.out.print(bot.data+" ");
				}
			}
			System.out.println();
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
				
				return tmp != null;
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				if(hasNext()) {
					E data= tmp.data;
					tmp=tmp.next;
					return data;
					
				}
				return null;
			}
			
		};
		return iterator;
	}
	
	
	public void output() {
		System.out.println("LinkedQueue : ");
		Iterator<E> iterator= iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		System.out.println("*********************************");
	}
	
	
	public void outputTopBot() {
		System.out.println(top.data);
		System.out.println(bot.data);
	}
	
	
	
	@Override
	public void enqueue(E element) {
		// TODO Auto-generated method stub
		Node newNode= new Node(element,null);
		if(n==0) {
			n++;
			top= newNode;
			bot=top;
		}
		else if(n>0){
			
			bot.next=newNode;
			bot=newNode;
		}
		else System.out.println("No");
		
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if(n>0) {
			E tmp=top.data;
			top=top.next;
			return tmp;
			
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
	
	
	public void ReturnIsEmpty() {
		System.out.println("LinkedQueue co rong hay khong ?");
		if(isEmpty()) {
			System.out.println("No");
		}
		else System.out.println("Yes");
	}

}
