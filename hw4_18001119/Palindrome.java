package hw4_18001119;

import java.util.Scanner;

public class Palindrome {
	private LinkedListQueue<String> list = new LinkedListQueue<String>();
	private Scanner sc = new Scanner(System.in);
	private int n;
	public void input() {
		System.out.println("Scan list kiem tra : ");
		 n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			list.enqueue(sc.nextLine());

		}
	}
	
	public String Swap(String string) {
		String newList="";
		for(int i=string.length()-1;i>=0;i--) {
			newList+=string.charAt(i);
		}
		return newList;
	}

	public boolean booleanPalin() {
		for(int i=0;i<n;i++) {
			String newString=list.dequeue();
			if(!newString.equals(Swap(newString))) {
				return false;
			}
		}
		
		return true;
	}
	public void output() {
		if(booleanPalin()) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}

}
