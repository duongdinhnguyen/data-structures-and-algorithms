package hw3_18001119;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class MainSimpleArrayList {
	private static Random rd = new Random();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SimpleArrayList<Integer> list = new SimpleArrayList<Integer>();
		list.input();
		
		int data = rd.nextInt(20);
		list.add(data);
		System.out.println("Phan tu thu : ");
		
		int index1 = Integer.parseInt(sc.nextLine());
		System.out.println("Gia tri phtu la : " + list.get(index1));
		
		
		
		System.out.println("List sau khi add  :");
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}	
		System.out.println();
		System.out.println("So phantu hien tai : " + list.size());
		
		
		
		
		System.out.println("Thay phtu thu : ");
		int index2= Integer.parseInt(sc.nextLine());
		int data2= rd.nextInt(20);
		System.out.println("bang voi :"+ data2);
		list.set(index2, data2);
		System.out.println("List sau khi thay  :");
		Iterator<Integer> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}	
		System.out.println();
		System.out.println("So phantu hien tai : " + list.size());
		
		
		
		
		
		System.out.println("Remove cac phtu bang : ");
		int data3= Integer.parseInt(sc.nextLine());
		list.remove(data3);
		System.out.println("List sau khi remove  :");
		Iterator<Integer> iterator1 = list.iterator();
		while (iterator1.hasNext()) {
			
			System.out.print(iterator1.next() + " ");
			
		}
		System.out.println();
		System.out.println("So phantu hien tai : " + list.size());
		
		
		
		System.out.println("Nhap dataisContain :");
		int dataisContain= Integer.parseInt(sc.nextLine());
		System.out.println("Kiem tra co ton tai "+dataisContain+" trong list");
		if(list.isContain(dataisContain)) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}

}
