package hw5_18001119;

import hw5_18001119.LinkedBinaryTree.Node;

public class Execise2_2 {
	public static void main(String [] args) {
		ExpressionTree<String,Node<String>> Ex2_2= new ExpressionTree<String,Node<String>>();
		Node<String> root= Ex2_2.addRoot("*");
		Ex2_2.addLeft(root, "+");
		Ex2_2.addRight(root,"-");
		Ex2_2.addLeft(root.getLeft(), "/");
		Ex2_2.addRight(root.getLeft(), "3");
		Ex2_2.addLeft(root.getRight(), "7");
		Ex2_2.addRight(root.getRight(), "4");
		Ex2_2.addLeft(root.getLeft().getLeft(), "6");
		Ex2_2.addRight(root.getLeft().getLeft(), "2");
		Ex2_2.preorderPrint(root);
		System.out.println();
		Ex2_2.postorderPrint(root);
		System.out.println();

		Ex2_2.inorderPrint(root);
	}
}
