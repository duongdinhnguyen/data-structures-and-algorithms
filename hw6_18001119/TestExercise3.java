package hw6_18001119;

import java.util.Random;
import java.util.Scanner;

public class TestExercise3 <K extends Comparable,E>  extends MinHeapPriorityQueue <K,E>{
	private ArrEntry [] list;
	private int n=0;
	private Scanner sc= new Scanner(System.in);
	private Random rd= new Random();
	public TestExercise3() {
		list= new ArrEntry[defaultsize];
	}
	
	
	
	public void print() {
		for(int i=0;i<n;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
	
	public void input() {
		n= Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			Object k= rd.nextInt(9999);
			Object e= rd.nextInt(9999);
			list[i]= new ArrEntry(k,e);
		}
	}
	
	
	public void Selectionsort() {
		ArrEntry [] listTest= new ArrEntry[n];
		for(int i=0;i<n;i++) {
			listTest[i]= list[i];
		}
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(((Comparable) listTest[j].key).compareTo(listTest[min].key)<0) {
					min=j;
				}
			}
			if(min != i) {
				ArrEntry newA = listTest[i];
				listTest[i]= listTest[min];
				listTest[min]=newA;
			}
		}
	}
	public void MergeSort() {
		ArrEntry [] listTest= new ArrEntry[n];
		for(int i=0;i<n;i++) {
			listTest[i]= list[i];
		}
	}
	public void QuickSort() {
		ArrEntry [] listTest= new ArrEntry[n];
		for(int i=0;i<n;i++) {
			listTest[i]= list[i];
		}
	}
	
	public void HeapSort() {
		
	}
}
