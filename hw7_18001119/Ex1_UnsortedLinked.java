package hw7_18001119;

public class Ex1_UnsortedLinked {
	public static void main(String [] args) {
		LinkedListHW7<Integer> Unsorted= new LinkedListHW7<Integer>();
		Unsorted.addTop(5);
		Unsorted.add(7);
		Unsorted.add(8);
		Unsorted.add(4);
		Unsorted.add(6);
		Unsorted.add(9);
		Unsorted.add(2);
		Unsorted.add(1);
		Unsorted.add(4);
		Unsorted.add(3);
		Unsorted.output();
		Unsorted.Search(5);
	}
}
