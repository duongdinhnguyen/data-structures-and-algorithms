package hw6_18001119;

public class Exercise3 {
	public static void main(String [] args ) {
		TestExercise3<Integer,Integer> test= new TestExercise3<Integer,Integer> ();
		test.input();
		//test.print();

		long st= System.nanoTime();
		test.Selectionsort();
		long end= System.nanoTime();
		System.out.println("Time for SelectionSort : "+ (end-st));
		
	}
}
