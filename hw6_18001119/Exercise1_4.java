package hw6_18001119;

import hw6_18001119.SortedLinkedPriorityQueue.NodeEntry;

public class Exercise1_4 {
	public static void main(String [] args) {
		SortedLinkedPriorityQueue <Integer,Integer> Sorted= new SortedLinkedPriorityQueue<Integer,Integer>();
		Sorted.insert(5, 7);
		Sorted.insert(3, 45);
		NodeEntry entry= new NodeEntry(9,6,null);
		Sorted.insert(entry);
		//Sorted.insert(9, 6);
		Sorted.insert(2, 9);
		Sorted.insert(7, 4);
		NodeEntry entry1= new NodeEntry(6,3,null);

		Sorted.insert(entry1);
		Sorted.insert(1, 8);
		Sorted.insert(4, 2);
		Sorted.insert(8, 5);
		System.out.println(Sorted.min());
		System.out.println(Sorted.removeMin());
		Sorted.output();
		
	}
}
