package hw5_18001119;


public class LinkedBinaryTree <T,E> implements BinaryTreeInterface<E>{

	private int n=0;
	private Node<T> root;
	protected static class Node<T>{
		private T element;
		private Node<T> p;
		private Node<T> left;
		private Node<T> right;
		
		public Node(T element, Node<T> p, Node<T> left, Node<T> right) {
			super();
			this.element = element;
			this.p = p;
			this.left = left;
			this.right = right;
		}
		public T getElement() {
			return element;
		}
		public void setElement(T element) {
			this.element = element;
		}
		public Node<T> getP() {
			return p;
		}
		public void setP(Node<T> p) {
			this.p = p;
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
	public Node<T> addRoot(T element) {
		if(size()==0) {
			Node<T> newNode= new Node<T>(element,null,null,null);
			root=newNode;
			n++;
		}
		return  root;
		
	}
	
		
	public Node<T> addLeft(Node<T> p,T element) {
		Node<T> newNode= new Node<T>(element,null,null,null);

		if(p== null|| !isEmpty()) {
			return null;
		}
		if(p.getLeft()== null) {
			p.setLeft(newNode);
			newNode.p=p;
			n++;
		}
		else set(p.getLeft(),element); 
		return p.getLeft();
		
	}
	
	
	
	public Node<T> addRight(Node<T> p,T element) {
		Node<T> newNode= new Node<T>(element,null,null,null);

		if(p== null|| !isEmpty()) {
			return null;
		}
		if(p.getRight()== null) {
			p.setRight(newNode);
			newNode.p=p;

			n++;
		}
		else set(p.getRight(),element); 
		return  p.getRight();
	}
	public void set(Node <T> p, T element) {
		if(p== null|| isEmpty()) {
			return;
		}
		p.setElement(element);
	}
	
	@Override
	public E root() {
		// TODO Auto-generated method stub
		if(size()<=0) {
			return null;
		}
		else return (E) root.element;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		if(n<0 ) {
	 		return -1;
		} 
		else return n;
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
		if(isEmpty()) {
			System.out.println("No");
		}
		else System.out.println("Yes");

	}
	
	@Override
	public int numChildren(E p) {
		// TODO Auto-generated method stub
		if(!(p instanceof Node)) {
			return -1;
		}
		int count=0;
		Node<T> newNode=(Node<T>) p;
		
		if(newNode== null) 		return -1;
		
		if(newNode.left!= null) {
			count++;
		}
		if(newNode.right!= null) {
			count++;
		}
		return count;
	}
	// 
	@Override
	public E parent(E p) {
		// TODO Auto-generated method stub
		if(!(p instanceof Node)) {
			return null;
		}
		Node<T> newNode= (Node<T >) p;
		if(!isEmpty() || newNode== null) {
			return  null;
		}
		return   (E) newNode.p.element;
	}

	@Override
	public E left(E p) {
		// TODO Auto-generated method stub
		if(!(p instanceof Node)) {
			return null;
		}
		Node<T> newNode= (Node<T >) p;
		if(!isEmpty() || newNode== null) {
			return  null;
		}
		if(newNode.left!= null) {
			return (E) newNode.left.element;
		}
		else return null;
	}

	@Override
	public E right(E p) {
		// TODO Auto-generated method stub
		if(!(p instanceof Node)) {
			return null;
		}
		Node<T> newNode= (Node<T >) p;
		if(!isEmpty() || newNode== null) {
			return  null;
		}
		if(newNode.right!= null) {
			return (E) newNode.right.element;
		}
		else return null;	
		}
	
	public void output(Node<T> newNode, int count) {
		if(newNode ==null) return ;

		output(newNode.right,count+1);
		for(int i=0;i<count;i++) {
			System.out.print("\t");
		}

		System.out.println(newNode.element);
		output(newNode.left,count+1);
	}
	
	@Override
	public E sibling(E p) {
		// TODO Auto-generated method stub
		if(!(p instanceof Node)) {
			return null;
		}
		Node<T> newNode= (Node <T >) p;
		if(!isEmpty() || newNode== null) {
			return  null;
		}
		if(newNode== newNode.p.left) {
			return (E) newNode.p.right.element;
		}
		else return (E) newNode.p.left.element;	
		}
	
	
}
  