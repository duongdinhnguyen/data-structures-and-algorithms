package hw7_18001119;


public class Ex1_SortedLinked {
	public static void main(String [] args) {
		LinkedListHW7<Integer> Sorted= new LinkedListHW7<Integer>();
		Sorted.addTop(7);
		Sorted.InsertSorted(5);
		Sorted.InsertSorted(9);
		Sorted.InsertSorted(2);
		Sorted.InsertSorted(3);
		Sorted.InsertSorted(8);
		Sorted.InsertSorted(6);
		Sorted.InsertSorted(1);
		Sorted.output();
		Sorted.Search(4);

	}
}
