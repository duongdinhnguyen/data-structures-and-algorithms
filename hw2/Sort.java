package hw2;

import java.util.Random;
import java.util.Scanner;

public class Sort {
	private double [] array;
	private int compare;
	private int change;
	private Scanner sc= new Scanner(System.in);
	private Random rd= new Random();
	public Sort(double[] array) {
		super();
		this.array = array;
	}
	public Sort() {
		super();
	}
	public double[] getArray() {
		return array;
	}
	public void setArray(double[] array) {
		this.array = array;
	}
	public void input() {
		int n= Integer.parseInt(sc.nextLine());
		array= new double [n];
		for(int i=0;i<n;i++) {
			array[i]= rd.nextInt(200);
		}
	}
	public void sort(double[] array, int i, int j) {
		double temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public void Bubble() {
		compare =0;
		change =0;
		double []newList= new double [array.length];
		for(int i=0;i<newList.length;i++) {
			newList[i]= array[i];
		}
		for (int i = 0; i < newList.length; i++) {
			for (int j = i + 1; j < newList.length; j++) {
				compare++;
				if (newList[i] > newList[j]) {
					sort(newList, i, j);
					change++;
				}

			}

		}
		System.out.println("BubbleSort : ");
		System.out.println("So lan Compare :"+ compare);
		System.out.println("So la Change : "+change);

		System.out.println("Day sau khi sap xep :");
		for(int i=0;i<newList.length;i++) {
			System.out.print(newList[i]+" ");
		}
		
		System.out.println();
		//System.out.println("--------------------------------------");

	}
	public void Insertion() {
		compare =0;
		change =0;
		double []newList= new double [array.length];
		for(int i=0;i<newList.length;i++) {
			newList[i]= array[i];
		}
		double minIndex;
		// Xet gia tri tu phan tu i=2 voi gia tri phan tu truoc do
		// Day phia truoc da duoc sap xep theo mot trinh tu
		for(int i=1;i<newList.length;i++) {
			compare ++;
			minIndex = newList[i];
			int j= i-1;
			/* Dat minIndex = array[j+1](Tren dat =array[i] vi la phan tu dau tien can xet)
			 * Neu array[j]> minIndex <Thuc chat day la array[j+1]>
			  		array[j+1]=array[j] vaf giam j  xuong xet tiep nhu tren
			 * den khi array[j] khong thoa man dieu kien thi array[j+1] giu nguyen
			 */
			while(j>=0 && newList[j]> minIndex) {
				newList[j+1]= newList[j];
				j--;
				change ++;
				compare ++;
			}
			newList[j+1]= minIndex;
			
		}
		// compare " So lan so sanh;
		// so lan so sanh khi tang i la n-1 va so lan lap lai la n-1
		// 
		
		compare -= 2*(newList.length-1);
		compare += change;
		System.out.println("InsertionSort : ");
		System.out.println("So lan Compare : "+compare);
		System.out.println("So lan Change : "+change);
		System.out.println("Day sau khi sap xep :");
		for(int i=0;i<newList.length;i++) {
			System.out.print(newList[i]+" ");
		}
		System.out.println();
		//System.out.println("-------------------------------------------");

	}
	public void swap(double[] array, int i, int j) {
		double tem = array[i];
		array[i] = array[j];
		array[j] = tem;
	}

	public void Selection() {
		compare =0;
		change =0;
		double []newList= new double [array.length];
		for(int i=0;i<newList.length;i++) {
			newList[i]= array[i];
		}
		int minIndex;
		for (int i = 0; i < newList.length; i++) {
			minIndex = i;// Xet list tu phan tu i sau do tang dan
			// Tim kiem index cua phan tu nho nhat so voi index i
			for (int j = i + 1; j < newList.length; j++) {
				compare++;
				if (newList[j] < newList[minIndex]) {
					minIndex = j;
				}

			}
			/* Neu vi tri nho nhat khac index i thi :
			 * Doi vi tri cua i voi vi tri minIndex
			 * Bien dem so lan doi vi tri tang 1
			*/
			if (minIndex != i) {
				swap(newList, i, minIndex);
				change++;
			}
		}
		System.out.println("SelectionSort : ");
		System.out.println("So lan Compare :" + compare);
		System.out.println("So la Change : " + change);
		System.out.println("Day sau khi sap xep :");
		for (int i = 0; i < newList.length; i++) {
			System.out.print(newList[i] + " ");
		}
		System.out.println();

	}
}
