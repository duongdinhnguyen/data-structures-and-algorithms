package hw7_18001119;

public class Exercise1_UnSortedArray {
	public static void main(String [] args) {
		SimpleArrayListHW7<Integer> Ex1_ArrUnsorted = new SimpleArrayListHW7<Integer>();
		Ex1_ArrUnsorted.add(2);
		Ex1_ArrUnsorted.add(6);
		Ex1_ArrUnsorted.add(7);
		Ex1_ArrUnsorted.add(3);
		Ex1_ArrUnsorted.add(67);
		Ex1_ArrUnsorted.add(45);
		Ex1_ArrUnsorted.add(23);
		Ex1_ArrUnsorted.add(49);
		Ex1_ArrUnsorted.Out();
		int newT= 67;
		Ex1_ArrUnsorted.Searching(newT);
		
	}
}
