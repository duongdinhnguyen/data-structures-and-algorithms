package hw2;

public class MainSort {
	
	public static void main(String [] args) {
		Sort list= new Sort();
		list.input();
		long start= System.nanoTime();
		list.Bubble();
		long end = System.nanoTime();
		System.out.println("Time for BubbleSort to run : "+(end - start) +"nano s");
		System.out.println("--------------------------------------");

		long start2= System.nanoTime();

		list.Insertion();
		long end2= System.nanoTime();

		System.out.println("Time for InsertionSort to run : "+(end2 - start2) +" nano s");
		System.out.println("--------------------------------------");

		long start3= System.nanoTime();

		list.Selection();
		long end3= System.nanoTime();

		System.out.println("Time for SelectionSort to run : "+(end3 - start3) +"nano s");

	}
}
// Nhap n
