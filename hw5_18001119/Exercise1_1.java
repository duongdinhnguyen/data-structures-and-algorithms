package hw5_18001119;

import java.util.Random;

public class Exercise1_1 {
	public static Random rd= new Random();
	public static void main(String [] args) {
		ArrayBinaryTree<Integer> ArrayTree= new ArrayBinaryTree<Integer>();
	
		ArrayTree.setRoot(1);
		
		ArrayTree.setLeft(1, 3);
		ArrayTree.setLeft(2, 8);
		ArrayTree.setLeft(3, 2);

	 	ArrayTree.setRight(1, 5);		
	 	ArrayTree.setRight(2, 6);		
	 	ArrayTree.setRight(3, 7);		
		
		System.out.println("Size : "+ArrayTree.size());
		ArrayTree.output();
		ArrayTree.ReturnIsempty();
		System.out.println(ArrayTree.root());
		

		System.out.println(ArrayTree.numChildren(6));
		

		System.out.println(ArrayTree.parent(2));
		
		

		System.out.println(ArrayTree.right(2));
		
		

		System.out.println(ArrayTree.left(3));
		

		System.out.println(ArrayTree.sibling(2));
		
	}
}
