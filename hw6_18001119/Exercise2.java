package hw6_18001119;

public class Exercise2 {
	public static void main(String [] args) {
		MinHeapPriorityQueue<Integer,Integer> MinHeap=new MinHeapPriorityQueue<Integer,Integer>();
		MinHeap.insertHeap(3,5);
		MinHeap.insertHeap(5, 8);
		MinHeap.insertHeap(6,9);
		MinHeap.insertHeap(2,7);
		MinHeap.insertHeap(1,6);
		MinHeap.insertHeap(4,3);
		MinHeap.insertHeap(7,1);
		MinHeap.insertHeap(9,4);
		MinHeap.insertHeap(8,2);
		MinHeap.insertHeap(8,2);
		MinHeap.Out(1,0);

		System.out.println(MinHeap.removeHeap());
		MinHeap.Out(1,0);
		System.out.println(MinHeap.removeHeap());
		MinHeap.Out(1,0);
		System.out.println(MinHeap.removeHeap());
		MinHeap.Out(1,0);

	}
}
