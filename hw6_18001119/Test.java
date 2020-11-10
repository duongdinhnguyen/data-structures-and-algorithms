package hw6_18001119;

import java.util.Random;

public class Test {
	private static Random random= new Random();
	public static void main(String [] args) {
		int arr[] = new int[5];
		for(int i=1;i<=arr.length;i++) {
				arr[i]= random.nextInt(20);
		}
		for(int i=1;i<=arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
