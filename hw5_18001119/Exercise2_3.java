package hw5_18001119;

import hw5_18001119.LinkedBinaryTree.Node;

public class Exercise2_3{
	public static void main(String [] args) {
		Tester<String,Node<String>> Ex2_3= new Tester<String,Node<String>>();
		Node<String> root= Ex2_3.addRoot("*");
		Ex2_3.addLeft(root, "+");
		Ex2_3.addRight(root,"-");
		Ex2_3.addLeft(root.getLeft(), "/");
		Ex2_3.addRight(root.getLeft(), "3");
		Ex2_3.addLeft(root.getRight(), "7");
		Ex2_3.addRight(root.getRight(), "4");
		Ex2_3.addLeft(root.getLeft().getLeft(), "6");
		Ex2_3.addRight(root.getLeft().getLeft(), "2");
		Ex2_3.inorderPrint2_3(root);
		System.out.println(root.getElement());
	}
}
