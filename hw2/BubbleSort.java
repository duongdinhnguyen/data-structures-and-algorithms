package hw2;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
	private double[] array;
	private int compare = 0;
	private int change = 0;
	private Scanner sc = new Scanner(System.in);
	private Random rd = new Random();

	public BubbleSort(double[] array) {
		super();
		this.array = array;
	}

	public double[] getArray() {
		return array;
	}

	public void setArray(double[] array) {
		this.array = array;
	}

	public BubbleSort() {
		super();
	}

	public void input() {
		int n = Integer.parseInt(sc.nextLine());
		array = new double[n];
		for (int i = 0; i < n; i++) {
			array[i] = rd.nextInt(200);
			System.out.print(array[i]+" ");
		}
		System.out.println();

	}

	public void sort(double[] array, int i, int j) {
		double temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public void Bubble() {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				compare++;
				if (array[i] > array[j]) {
					sort(array, i, j);
					change++;
				}

			}

		}
		System.out.println("So lan Compare :"+ compare);
		System.out.println("So la Change : "+change);
		System.out.println("--------------------------------------");

		System.out.println("Day sau khi sap xep :");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

	}
}
