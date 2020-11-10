package hw4_18001119;

import java.util.Scanner;

public class MainClassStackInterface {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ClassStackInterface<Integer> stack = new ClassStackInterface<Integer>();
		stack.input();
		stack.output();

		System.out.println("Scan data : ");
		int element = Integer.parseInt(sc.nextLine());
		stack.push(element);
		System.out.println("List sau khi  add : ");
		stack.output();

		System.out.println("List co rong hay khong : ");
		stack.ReturnIsEmpty();

		System.out.println("PopData : " + stack.pop());
		System.out.println("List sau khi  pop : ");
		stack.output();

		stack.SystemTop();
	}
}
