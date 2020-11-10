package hw4_18001119;

import java.util.Scanner;

public class MainLinkedQueue {
	private static Scanner sc= new Scanner(System.in);
	public static void main(String [] args) {
		LinkedListQueue <Integer> LinkedQueue= new LinkedListQueue<Integer>();
		LinkedQueue.input();
		LinkedQueue.output();
		System.out.println("Scan dataADD :");
		int dataADD= Integer.parseInt(sc.nextLine());
		LinkedQueue.enqueue(dataADD);
		LinkedQueue.output();
		LinkedQueue.dequeue();
		LinkedQueue.output();
		LinkedQueue.ReturnIsEmpty();
	}
}
