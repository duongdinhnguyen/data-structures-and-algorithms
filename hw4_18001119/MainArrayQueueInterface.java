package hw4_18001119;

import java.util.Scanner;

public class MainArrayQueueInterface {
	private static Scanner scan= new Scanner(System.in);
	public static void main(String [] args) {
		ArrayQueue<Integer> ArrayQueue= new ArrayQueue<Integer>();
		ArrayQueue.input();
		ArrayQueue.output();
		System.out.println("Scan dataADD : ");
		int dataADD=Integer.parseInt(scan.nextLine());
		ArrayQueue.enqueue(dataADD);
		ArrayQueue.output();
		System.out.println(ArrayQueue.dequeue());
		ArrayQueue.output();

	}
}
