package hw7_18001119;

public class BinarySearchTree <T extends Comparable>{
	private int n=0;
	//private Node<T> root;
	public static class Node<T>{
		T element;
		Node <T> left;
		Node<T> right;
		public Node(T element, Node<T> left, Node<T> right) {
			super();
			this.element = element;
			this.left = left;
			this.right = right;
		}
		
		public Node() {
			super();
		}

		public T getElement() {
			return element;
		}
		public void setElement(T element) {
			this.element = element;
		}
		public Node<T> getLeft() {
			return left;
		}
		public void setLeft(Node<T> left) {
			this.left = left;
		}
		public Node<T> getRight() {
			return right;
		}
		public void setRight(Node<T> right) {
			this.right = right;
		}
		
		
		
		
		
		
	}
	public T FindMind(Node <T> node) {
		if(node==null) {
			return null;
		}
		else if(node.left==null) {
			return node.element;
		}
		while(node.left!= null) {
			node=node.left;
		}
		return node.element;
	}
	public boolean isEmpty() {
		return n==0;
	}
	public Node<T> Insert(T element, Node<T> node) {
		
		if(node== null) {
			n++;
			node= new Node<T>(element , null,null);
		}
		else if(element.compareTo(node.element)<0) {
			node.left=Insert(element,node.left);
		}
		else if(element.compareTo(node.element)>0) {
			node.right=Insert(element,node.right);
		}
		else {
			return node;
		}
		return node;
	}
	
	public void Out(Node<T> node, int lv) {
		if(node==null)  return;
		Out(node.left,lv+1);
		for(int i=0;i<lv;i++) {
			System.out.print("\t");
		}
		System.out.println(node.element);
		Out(node.right,lv+1);
	}
	public void Search(T element, Node <T> node) {
		if(Searching(element,node)) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}
	
	public boolean Searching(T element, Node<T> node) {
		while(node != null) {
			if(node.element==element) {
				return true;
			}
			else if(element.compareTo(node.element)<0) {
				node= node.left;
			}
			else if(element.compareTo(node.element)>0) {
				node= node.right;
			}
		}
		return false;
	}
	
	public void Delete(T element , Node<T> node) {
		if(node.element==element) {
			if(node.left== null && node.right== null) {
				node.element=null;

			}
			else if(node.left==null && node.right!= null) {
				
			}
		}
		
	}
}
