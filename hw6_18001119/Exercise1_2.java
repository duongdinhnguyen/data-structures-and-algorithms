package hw6_18001119;

import hw6_18001119.SortedArrayPriorityQueue.ArrEntry;

public class Exercise1_2 {
	public static void main(String [] args) {
		SortedArrayPriorityQueue<Integer,Integer>  Sorted= new SortedArrayPriorityQueue<Integer,Integer>();
		ArrEntry entry= new ArrEntry(2,3);
		Sorted.insert(entry);
		ArrEntry entry1= new ArrEntry(1,9);

		Sorted.insert(entry1);
		Sorted.insert(6, 5);
		Sorted.insert(4, 8);
		Sorted.insert(3,6);
		Sorted.insert(7, 5);

		Sorted.insert(2,4);
		Sorted.output();
		System.out.println(Sorted.removeMin());
		Sorted.output();
		System.out.println(Sorted.min());
		
	}
}
