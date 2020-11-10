package hw5_18001119;

public class ExpressionTree <E,T> extends LinkedBinaryTree<E,T>{
		public void preorderPrint(Node<E> p) {
		//pre-order traversal of tree with root p
			if(p== null) return ;
			System.out.print(p.getElement()+" ");


			preorderPrint(p.getLeft());
			
			preorderPrint(p.getRight());
		}
		public void postorderPrint(Node<E> p) {
		//post-order traversal of tree with root p
			if(p== null) return ;
			postorderPrint(p.getLeft());
			System.out.print(p.getElement()+" ");
			postorderPrint(p.getRight());
			

		}
		public void inorderPrint(Node<E> p) {
		//in-order traversal of tree with root p
			if(p== null) return ;

			inorderPrint(p.getLeft());
			inorderPrint(p.getRight());
			System.out.print(p.getElement()+" ");

			
		}
		
}
