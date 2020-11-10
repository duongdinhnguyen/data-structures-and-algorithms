package hw7_18001119;

import hw7_18001119.BinarySearchTree.Node;

public class Exercise2  {
	public static void main(String [] args) {
		BinarySearchTree<Integer> Ex2= new BinarySearchTree<Integer>();
		Node <Integer> root = null;
		
		root=Ex2.Insert(5, root);
		Ex2.Insert(3,root);
		Ex2.Insert(1,root);
		Ex2.Insert(2,root);
		Ex2.Insert(7,root);
		Ex2.Insert(9,root);
		Ex2.Insert(4,root);
		Ex2.Insert(6,root);
		Ex2.Out(root, 0);
		System.out.println("Min : "+Ex2.FindMind(root));
		Ex2.Search(2, root);
		Ex2.Delete(2, root.getLeft().getLeft().getRight());
		Ex2.Out(root, 0);

	}
}
