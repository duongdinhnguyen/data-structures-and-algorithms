package hw3_18001119;

public class MainWordCount {
	public static void main(String [] args) {
		WordCount wordcount= new WordCount();
		wordcount.readfileName("input.txt");
		System.out.println();
		wordcount.Word();
		wordcount.search("input.txt");
	}
}
