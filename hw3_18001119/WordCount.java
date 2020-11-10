package hw3_18001119;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
	private SimpleArrayList<WordCount> test;
	private String temp;
	private Scanner sc;
	private String word;
	private int count=0;
	public WordCount(String word) {
		super();
		this.word = word;
	}
	public WordCount() {
		super();
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public void readfileName(String fileName) {
		try {
			sc=new Scanner(new File(fileName));
			while(sc.hasNext()) {
			System.out.print(sc.next()+" ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
	public void search(String fileName) {
		try {
			 sc= new Scanner(new File(fileName));
			 // kiem tra co ptu tiep theoko
			 while(sc.hasNext()) {
				 if(sc.next().equals(temp)) {
					 count++;
				 }
				 
				 
 
				 
			 }
				System.out.println("So lan xuat hien cua "+temp+" : "+count);

			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		sc.close();
	}
	public String Word() {
		sc= new Scanner (System.in);
		System.out.println("Nhap vao word can dem : ");
		 temp= "Hello";
		return temp;
	}
	
	public boolean equals(WordCount o) {
		if(test.isContain(o)) {
			count ++;
			return true;
		}
		 return false;
		
		
	}
}
