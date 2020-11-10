package hw2;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
	private double [] array;
	private int compare=0;
	private int change=0;
	private Scanner sc= new Scanner(System.in);
	private Random rd = new Random();
	public InsertionSort() {
		
	}
	public InsertionSort(double [] array) {
		this.array= array;
	}
	public double[] getArray() {
		return array;
	}
	public void setArray(double[] array) {
		this.array = array;
	}
	public void input() {
		int n= Integer.parseInt(sc.nextLine());
		array= new double[n];
		for(int i=0;i<n;i++) {
			array[i]= rd.nextInt(200);
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	public void Insertion() {
		double minIndex;
		// Xet gia tri tu phan tu i=2 voi gia tri phan tu truoc do
		// Day phia truoc da duoc sap xep theo mot trinh tu
		for(int i=1;i<array.length;i++) {
			compare ++;
			minIndex = array[i];
			int j= i-1;
			/* Dat minIndex = array[j+1](Tren dat =array[i] vi la phan tu dau tien can xet)
			 * Neu array[j]> minIndex <Thuc chat day la array[j+1]>
			  		array[j+1]=array[j] vaf giam j  xuong xet tiep nhu tren
			 * den khi array[j] khong thoa man dieu kien thi array[j+1] giu nguyen
			 */
			while(j>=0 && array[j]> minIndex) {
				array[j+1]= array[j];
				j--;
				change ++;
				compare ++;
			}
			array[j+1]= minIndex;
			
		}
		// compare " So lan so sanh;
		// so lan so sanh khi tang i la n-1 va so lan lap lai la n-1
		// 
		
		compare -= 2*(array.length-1);
		compare += change;
		System.out.println("-------------------------------------------");
		System.out.println("So lan Compare : "+compare);
		System.out.println("So lan Change : "+change);
		System.out.println("-------------------------------------------");
		System.out.println("Day sau khi sap xep :");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
