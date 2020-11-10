package hw2;

import java.util.Comparator;

public class Card {
	private int rank;
	private int suit;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getSuit() {
		return suit;
	}
	public void setSuit(int suit) {
		this.suit = suit;
	}
	
	public Card() {
		super();
	}
	public Card(int rank, int suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	
	
	@Override
	public String toString() {
		if(this.rank == 1 ) {
			
			return "A " + this.suit;
		}
		else if(this.rank==11) {
			return "J "+this.suit;
		}
		else if(this.rank==12) {
			return "Q "+ this.suit;
		}
		else if(this.rank==13) 
			return "K "+ this.suit;
		else return this.rank +" "+this.suit;
	}
	
}
class MyCard implements Comparator<Card>{

	@Override
	public int compare(Card o1, Card o2) {
		// TODO Auto-generated method stub
		if(o1.getRank()== o2.getRank()) {
			if(o1.getSuit()<o2.getSuit()) {
				return -1;
			}
			else return 1;
		}
		else if(o1.getRank()<o2.getRank()) return -1;
		else return 1;	}
	
}
