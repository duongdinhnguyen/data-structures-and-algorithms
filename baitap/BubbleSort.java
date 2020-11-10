package baitap;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
	
	private Scanner sc= new Scanner(System.in);
	private Random rd= new Random();
	private int [] array;
	//public int length;
	public BubbleSort() {
		
	}
	public BubbleSort(int [] array) {
		super();
		this.array = array;
	}
	public int[] getArray() {
		return array;
	}
	public void setArray(int[] array) {
		this.array = array;
	}
	public void input() {
		int n= Integer.parseInt(sc.nextLine());
		array = new int[n];
		for(int i=0;i<n;i++) {
			array[i]= rd.nextInt(10000);
		}
	}
	public void sort(int [] arr, int i,int j) {
		int temp= arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
	}
	public void sortArray() {
		int [] newArray = new int[array.length];
		for(int i=0;i<array.length;i++) {
			newArray[i]=array[i];
		}
		for(int i=0;i<newArray.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();

		for(int i=0;i<newArray.length;i++) {
			for(int j=i+1;j<newArray.length;j++) {
				if(newArray[i]>newArray[j]) {
					sort(newArray,i,j);			}
			}
		}
		for(int i=0;i<newArray.length;i++) {
			System.out.print(newArray[i]+" ");
		}
	}
	
}
