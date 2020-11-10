package hw3_18001119;

import java.util.Scanner;

public class MainSimpleLinkedList {
	private static Scanner sc= new Scanner(System.in);
	public static void main(String [] args) {
		SimpleLinkedList<Integer> simplelinkedlist =new SimpleLinkedList<Integer>();
			simplelinkedlist.input();
			simplelinkedlist.output();
			System.out.println("So pt hien tai :" + simplelinkedlist.size());
			System.out.println("******************************************");
			
			
			System.out.println("Nhap vao phan tu add vao dau :");
			int data= Integer.parseInt(sc.nextLine());
			simplelinkedlist.add(data);
			simplelinkedlist.output();
			System.out.println("So pt hien tai :" + simplelinkedlist.size());
			System.out.println("******************************************");


			
			
			
			System.out.println("Nhap vao phan tu add vao cuoi :");	
			int dataEnd= Integer.parseInt(sc.nextLine());
			simplelinkedlist.addBot(dataEnd);
			simplelinkedlist.output();
			System.out.println("So pt hien tai :" + simplelinkedlist.size());
			System.out.println("******************************************");
			
			
			
			System.out.println("Nhap vao index : ");
			int index= Integer.parseInt(sc.nextLine());
			System.out.println("Gia tri phtu "+ index+" :");
			System.out.println(simplelinkedlist.get(index));
			System.out.println("******************************************");

			
			
			
			System.out.println("Nhap vao index :");	
			int indexSet= Integer.parseInt(sc.nextLine());
			System.out.println("Nhap vao dataSet :");	
			int dataSet= Integer.parseInt(sc.nextLine());
			simplelinkedlist.set(indexSet, dataSet);
			simplelinkedlist.output();
			System.out.println("******************************************");


			
			System.out.println("Nhap dataIsContain :");
			int dataIsContain= Integer.parseInt(sc.nextLine());
			System.out.println("Ton tai "+dataIsContain+" trong List :");
			if(simplelinkedlist.isContain(dataIsContain)) {
				System.out.println("True");
			}
			else System.out.println("No");

			System.out.println("List co rong hay khong ?");
			if(simplelinkedlist.isEmpty()) {
				System.out.println("No");
			}
			else System.out.println("Yes");
			System.out.println("******************************************");

			
			
			
			
			
			System.out.println("RemoveTop :"+simplelinkedlist.removeTop());
			
			simplelinkedlist.output();
			System.out.println("So pt hien tai :" + simplelinkedlist.size());
			System.out.println("******************************************");
			
			
			
			System.out.println("RemoveBot :"+simplelinkedlist.removeBot());
			simplelinkedlist.output();
			System.out.println("So pt hien tai :" + simplelinkedlist.size());
			System.out.println("******************************************");
			
			
			System.out.println("Nhap dataRemove :");
			int dataRemove=Integer.parseInt(sc.nextLine());
			simplelinkedlist.remove(dataRemove);
			simplelinkedlist.output();
			System.out.println("So pt hien tai :" + simplelinkedlist.size());

			
			
			
			
			
			
			
			
	}
}
