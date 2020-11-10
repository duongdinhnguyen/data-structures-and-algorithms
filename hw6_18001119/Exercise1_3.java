 package hw6_18001119;

import hw6_18001119.UnsortedLinkedPriorityQueue.NodeEntry;

public class Exercise1_3 {
	public static void main(String [] args) {
		UnsortedLinkedPriorityQueue<Integer,Integer> Unsort= new UnsortedLinkedPriorityQueue<Integer,Integer>();
		Unsort.insert(4, 9);
		Unsort.insert(2, 11);
		Unsort.insert(3,6);
		NodeEntry entry= new NodeEntry(4,6,null);
		Unsort.insert(entry);
		Unsort.insert(6, 7);
		Unsort.output();
		System.out.println(Unsort.min());
		System.out.println(Unsort.removeMin());
		Unsort.output();
		
	}
}


