package hw6_18001119;

import hw6_18001119.UnsortedArrayPriorityQueue.ArrEntry;

public class Exercise1_1 {
	public static void main(String [] args) {
		UnsortedArrayPriorityQueue<Integer,Integer> Unsorted= new UnsortedArrayPriorityQueue<Integer,Integer>();
		Unsorted.insert(1, 1);
		Unsorted.insert(3, 4);
		System.out.println(Unsorted.size());
		ArrEntry entry= new ArrEntry(1,2);
		Unsorted.insert(entry);
		System.out.println(Unsorted.min().toString());
		System.out.println(Unsorted.removeMin().toString());
		Unsorted.output();
	}
}
