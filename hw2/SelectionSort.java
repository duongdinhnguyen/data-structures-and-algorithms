package hw2;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
	private double[] array;
	private int compare = 0;
	private int change = 0;
	private Scanner sc = new Scanner(System.in);
	private Random rd = new Random();

	public SelectionSort(double[] array) {
		super();
		this.array = array;
	}

	public SelectionSort() {
		super();
	}

	public double[] getArray() {
		return array;
	}

	public void setArray(double[] array) {
		this.array = array;
	}

	public void input() {
		int n = Integer.parseInt(sc.nextLine());
		array = new double[n];
		for (int i = 0; i < n; i++) {
			array[i] = rd.nextInt(200);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------------");

	}

	public double minArray(double[] array) {
		double min = Double.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public void swap(double[] array, int i, int j) {
		double tem = array[i];
		array[i] = array[j];
		array[j] = tem;
	}

	public void Selection() {
		int minIndex;
		for (int i = 0; i < array.length; i++) {
			minIndex = i;// Xet list tu phan tu i sau do tang dan
			// Tim kiem index cua phan tu nho nhat so voi index i
			for (int j = i + 1; j < array.length; j++) {
				compare++;
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}

			}
			/* Neu vi tri nho nhat khac index i thi :
			 * Doi vi tri cua i voi vi tri minIndex
			 * Bien dem so lan doi vi tri tang 1
			*/
			if (minIndex != i) {
				swap(array, i, minIndex);
				change++;
			}
		}
		System.out.println("So lan Compare :" + compare);
		System.out.println("So la Change : " + change);
		System.out.println("----------------------------------------");
		System.out.println("Day sau khi sap xep :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
