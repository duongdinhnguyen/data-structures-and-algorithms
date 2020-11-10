package hw7_18001119;

public class Exercise1_SortedArray {
	public static void main(String [] args ) {
		SimpleArrayListHW7<Integer> SortedArr= new SimpleArrayListHW7		<Integer>();
		SortedArr.add(5);
		SortedArr.add(896);
		SortedArr.add(57);
		SortedArr.add(34);
		SortedArr.add(27);
		SortedArr.add(48);
		SortedArr.add(70);
		SortedArr.add(66);
		SortedArr.Sort();
		SortedArr.Out();
		int newT = 48;
		SortedArr.Searching(newT);

	}
}
