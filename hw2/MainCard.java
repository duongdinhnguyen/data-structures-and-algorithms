package hw2;

import java.util.ArrayList;
import java.util.Collections;

public class MainCard {
	public static void main(String [] args ) {
		ArrayList<Card> list= new ArrayList<Card>();
		list.add(new Card(1,1));
		list.add(new Card(2,3));
		list.add(new Card(10,2));
		list.add(new Card(11,1));
		list.add(new Card(12,1));
		list.add(new Card(13,3));
		list.add(new Card(5,3));
		list.add(new Card(7,4));
		list.add(new Card(6,3));
		list.add(new Card(1,4));
		
		System.out.println("Truoc khi sap xep :");
		for(Card i : list) {
			System.out.println(i);
		}
		Collections.sort(list, new MyCard());
		System.out.println("Sau khi sap xep :");
		for(Card i : list) {
			System.out.println(i);
		}
	}
	
}

