package baitap;

import java.util.Random;
import java.util.Scanner;

public class Arraysort {
	private static int [] array;
	 static Scanner scan= new Scanner(System.in);
	 static Random rd=new Random();
	
	private static void sort(int [] arr,int i,int j) {
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]= temp;
	}
	private static void Bubbelsort (int[] array2) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j])  sort(array2,i,j);
			}
		}
	}
	private static void output(int[] array2) {
		// TODO Auto-generated method stub
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]);
		}
	}
	private static void input(int[] array2) {
		// TODO Auto-generated method stub
		int n= scan.nextInt();
		array2= new int[n];
		for(int i=0;i<n;i++) {
			array2[i]= rd.nextInt(2000);
		}
	}
}
