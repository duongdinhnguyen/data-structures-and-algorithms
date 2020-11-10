package hw5_18001119;


public class Tester<T,E> extends LinkedBinaryTree<T,E> {
	
	public void inorderPrint2_3(Node<T> p) {
		//in-order traversal of tree with root p
			if(p== null) return ;
			if(p.getElement() instanceof String) {
				inorderPrint2_3(p.getLeft());
				inorderPrint2_3(p.getRight());
				if(p.getElement().equals("+") ) {
					double a= Double.parseDouble( (String) p.getLeft().getElement());
					double b= Double.parseDouble( (String) p.getRight().getElement());
					 String c = (String) Double.toString(a+b);
					p.setElement((T) c);
				}
				else if(p.getElement().equals("-")) {
					Double a= Double.parseDouble( (String) p.getLeft().getElement());
					Double b= Double.parseDouble( (String) p.getRight().getElement());
					 String c = (String) Double.toString(a-b);
					p.setElement((T) c);
				}
				else if(p.getElement().equals("*")) {
					double a= Double.parseDouble( (String) p.getLeft().getElement());
					double b= Double.parseDouble( (String) p.getRight().getElement());
					 String c = (String) Double.toString(a*b);
					p.setElement((T) c);
				}
				else if(p.getElement().equals("/")) {
					double a= Double.parseDouble( (String) p.getLeft().getElement());
					double b= Double.parseDouble( (String) p.getRight().getElement());
					 String c = (String) Double.toString(a/b);
					p.setElement((T) c);
				}
			}
			

	}	
		
}

