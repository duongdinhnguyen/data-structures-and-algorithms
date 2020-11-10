package hw5_18001119;

import hw5_18001119.LinkedBinaryTree.Node;

public class Exercise1_2 {
	public static void main(String[] args) {
		LinkedBinaryTree<Integer, Node<Integer>> Linked = new LinkedBinaryTree<Integer, Node<Integer>>();

		Node<Integer> root = null;
		root = Linked.addRoot(1);

		Linked.addLeft(root, 3);
		Linked.addRight(root, 5);

		Linked.addLeft(root.getLeft(), 8);
		Linked.addRight(root.getLeft(), 6);

		Linked.addLeft(root.getRight(), 2);
		Linked.addRight(root.getRight(), 7);

		Linked.output(root, 0);
		Linked.ReturnIsEmpty();
		 System.out.println(root.getRight().getElement());

		 System.out.println(Linked.size());

		 System.out.println(Linked.numChildren(root.getRight()));
		 System.out.println(Linked.parent(root.getLeft()));
		 System.out.println(Linked.left(root.getLeft()));
		 System.out.println(Linked.right(root));
		 System.out.println(Linked.sibling(root.getLeft()));

	}
}
