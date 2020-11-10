package hw1;

import java.util.Random;
import java.util.Scanner;

public class bai1 {
	private static Scanner sc;
	private static void inputData(int [] array) {
	     sc= new Scanner(System.in);
		int n= Integer.parseInt(sc.nextLine());
		array= new int[n];
		Random rd= new Random();
		for(int i=0;i<n;i++) {
			array[i]= rd.nextInt(10000);
		}
	}
	private static void outputData(int [] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	private static void search(int [] array) {
		 sc= new Scanner (System.in);
		int n= sc.nextInt();
		for(int i=0;i<array.length;i++) {
			if(array[i]==n) {
				System.out.println(array[i]);
			}
		}
	}
	public static void main (String [] args) {
	int [] array= null;
    inputData(array);
	outputData(array);
	search(array);
	}
}
