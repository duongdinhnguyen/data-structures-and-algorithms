package hw4_18001119;

import java.util.Scanner;

public class MainLinkedListStack {
	private static Scanner sc= new Scanner (System.in);
	
	public static void main(String [] args) {
		LinkedListStack<Integer> linkedStack= new LinkedListStack<Integer>();
		linkedStack.input();
		linkedStack.output();
		
		System.out.println("Scan dataPush : ");
		int dataPush=Integer.parseInt(sc.nextLine());
		linkedStack.push(dataPush);
		linkedStack.output();	
		linkedStack.stack();


		
		linkedStack.pop();
		linkedStack.output();
		linkedStack.stack();


	}
}
