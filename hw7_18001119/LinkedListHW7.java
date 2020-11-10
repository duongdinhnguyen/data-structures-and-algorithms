package hw7_18001119;

public class LinkedListHW7<T extends Comparable> {
	public static class Node<T> {
		T data;
		Node<T> next;

		public Node(T data, Node<T> next) {
			super();
			this.data = data;
			this.next = next;

		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

	}

	private Node<T> top = null;
	private Node<T> bot = null;
	private int n;

	public void output() {
		System.out.println("List : ");
		Node<T> tmp = top;
		for (int i = 0; i < n; i++) {

			System.out.print(tmp.data + " ");
			tmp = tmp.next;
		}
		System.out.println();
	}

	

	public void addTop(T data) {
		Node<T> tmp = new Node<T>(data, null);

		if (n == 0) {
			top = tmp;
			bot = tmp;
			n++;
		} else if (n < 0) {
			return;
		} else {
			tmp.next = top;
			top = tmp;
			n++;
		}

	}

	public void add(T data) {
		Node<T> tmp = new Node<T>(data, null);
		if (n == 0) {
			top = bot = tmp;
			n++;
		} else if (n < 0) {
			return;
		} else {
			n++;
			Node<T> index = top;
			while (index.next != null) {
				index = index.next;
			}
			index.next = tmp;
			bot = index.next;

		}
	}

	public Node<T> InsertSorted(T data) {
		Node<T> newNode = new Node<T>(data, null);
		Node <T> node=top;
		n++;
		if (node == null) {
			top = newNode;
			return node;
		}
		if (data.compareTo(node.data) < 0) {
			newNode.next = node;
			top = newNode;
			return top;
		}
		while (node.next != null) {
			if (data.compareTo(node.next.data) < 0) {
				newNode.next = node.next;
				node .next= newNode;
				return node;
			}
			node=node.next;
			
			
		}
		node.next=newNode;
		return node;
	}

	public void Search(T element) {
		if (Searching(element)) {
			System.out.println("Yes");
		} else
			System.out.println("No");
	}

	public boolean Searching(T element) {
		Node<T> newNode = top;
		if (newNode.data == element) {
			return true;
		}
		while (newNode.next != null) {

			newNode = newNode.next;
			if (newNode.data == element) {
				return true;
			}
		}
		return false;
	}

	public boolean isEmpty() {
		return n == 0;
	}

}
