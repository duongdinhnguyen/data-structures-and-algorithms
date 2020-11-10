package hw3_18001119;

import java.util.Scanner;
import java.util.Iterator;
import java.util.Random;

public class SimpleLinkedList<T> {
	class Node {
		T data;
		Node next;

		public Node(T data, Node next) {
			super();
			this.data = data;
			this.next = next;

		}
	}

	private Scanner sc = new Scanner(System.in);
	private Random rd = new Random();
	private Node top = null;
	private Node bot = null;
	private int n;

	public void input() {
		System.out.println("Nhap so phtu :");
		n = Integer.parseInt(sc.nextLine());
		if (n <= 0) {
			System.out.println("rong");
		}

		System.out.print("Random :");
		for (int i = 0; i < n; i++) {
			T data3 = (T) new Integer(rd.nextInt(100));
			Node tmp = new Node(data3, null);
			Node index = top;
			// truong hop phtu dau tien null gia tri
			if (index == null) {
				top = tmp;
				index=top;
				System.out.print(index.data+" ");

				
			} else {

				while (index.next != null) {
					index = index.next;
				}

				index.next = tmp;
				System.out.print(tmp.data+" ");


			}

		}
		System.out.println();


		/*
		 * if (n > 0) { while (n > 0) { T data3 = (T) new Integer(rd.nextInt(20)); tmp =
		 * new Node(data3, null); System.out.print(top.data);
		 * 
		 * 
		 * tmp = tmp.next; n--; } } else { tmp = null; }
		 */
	}

	public void output() {
		System.out.println("List : ");
		Node tmp= top;
		for(int i=0;i<n;i++) {
			
			System.out.print(tmp.data+" ");
			tmp=tmp.next;
		}
		System.out.println();
	}

	public void add(T data) {

		if (n == 0) {
			top = bot = new Node(data, null);
			n++;
		} else if (n < 0) {
			return;
		} else {
			// Tao phtu dau tro toi top
			// cho top = phtu do
			//tang n
			Node tmp = new Node(data, null);
			tmp.next = top;
			top = tmp;
			n++;
		}

	}

	public void addBot(T data) {
		Node tmp = new Node(data, null);
		if (n == 0) {
			top = bot = tmp;
			n++;
		} else if (n < 0) {
			return;
		} else {
			n++;
			// Khoi tao mot Node = top (Vi tri dau tien)
			// de khi dem khong lam mat gia tri cua linkedlist
			Node index = top;
			while (index.next != null) {
				index = index.next;
			}
			// sau buoc nay ta dang dung o mat xich cuoi no se chi toi null
			// chi viec chi no toi mot node moi co gia tri la data va cung chi toi null
			// node cuoi co gia tri data
			index.next = tmp;

		}
	}

	public T get(int i) {

		if (i < 0 || i > n) {
			return null;
		}

		Node tmp = top;
		while (i > 1) {
			tmp = tmp.next;
			i--;
		}
		return tmp.data;

	}

	public void set(int i, T data) {
		if (i < 0 || i > n) {
			return;
		}

		Node tmp = top;
		while (i > 1) {
			tmp = tmp.next;
			i--;
		}
		tmp.data = data;

	}

	public boolean isContain(T data) {
		Node tmp = top;
		for(int i=0;i<n;i++) {
			if(tmp.data.equals(data)) {
				return true;
			}
			tmp= tmp.next;
		}
		return false;
	}

	public int size() {
		return n;
	}

	public boolean isEmpty() {
		if (n > 0) {
			return true;
		} else
			return false;
	}

	public T removeTop() {
		if (top == null) {
			return null;

		} else {
			Node tmp = top;
			top = top.next;
			n--;
			return tmp.data;
		}
	}

	public T removeBot() {
		if(top== null) {
			return null;
		}
		else {
			n--;
			Node tmp= top;
			
			while(tmp.next.next!= null) {
				tmp=tmp.next;
				
			}
			Node end= tmp.next;
			tmp.next= tmp.next.next;
			return end.data;
		}
	}

	public void remove(T data) {
		if (n <= 0) {
			return;
		} else {
			Node tmp= top;

			for(int i=0;i<n;i++) {

				if(tmp.data.equals(data)) {
					top=top.next;
					tmp=top;
					n--;
				}
				if(tmp.next.data.equals(data)) {
					tmp.next=tmp.next.next;
					n--;
				}
			}
		}
	}

}
