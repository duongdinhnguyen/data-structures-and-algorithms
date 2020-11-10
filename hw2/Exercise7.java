package hw2;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise7 {
	public static void main(String [] args) {
		ArrayList<Card> list= new ArrayList<Card>();
		for(int i=1;i<=13;i++) {
			for(int j=1;j<=4;j++) {
				list.add(new Card(i,j));
			}
		}
		System.out.println("Ban dau :");
		for(Card i : list) {
			System.out.println(i);
		}
		Collections.shuffle(list);
		System.out.println("Sau khi tron :");
		for(Card i : list) {
			System.out.println(i);
		}
		
		
	}
}
