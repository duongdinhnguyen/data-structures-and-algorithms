package hw3_18001119;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainShape {
	private static Scanner sc= new Scanner(System.in);
	private static Random rd= new Random();
	private static int [] array;
	private static  ArrayList<Shape> list = new ArrayList<Shape>();
	public static void main(String [] args ) {
		
			int n= Integer.parseInt(sc.nextLine());
			array= new int[n];
			for(int i =0;i<n;i++) {
				array[i]= rd.nextInt(3)+1;
			}
			
			
			for(int i=0;i<n;i++) {
				if(array[i]==1) {
					int bankinh= rd.nextInt(200);
					Shape temp = new Circle(bankinh);
					list.add(temp);
				}
				else if(array[i]==2) {
					int bankinh = rd.nextInt(200);
					Shape temp= new Sphere( bankinh);
					list.add(temp);
				}
				else {
					int width= rd.nextInt(200);
					int height= rd.nextInt(299);
					Shape temp= new Rectangle(width,height);
					list.add(temp);
				}
			}
			for(Shape temp : list) {
				System.out.println(temp);
			}
			System.out.println("-----------------------------------------");
		for(int i=0;i<n;i++) {
			if(array[i]==1) {
				System.out.println(list.get(i));
				System.out.println("Chu vi :"+ list.get(i).getPerimeter());
				System.out.println("Dien tich :"+ list.get(i).getArea());
				System.out.println("====================================");
			}
			 else if(array[i]==2) {
				 System.out.println(list.get(i));
					System.out.println("The tich:"+ list.get(i).getVolume());
					System.out.println("====================================");

			}
			 else {
				 System.out.println(list.get(i));
					System.out.println("Chu vi :"+ list.get(i).getPerimeter());
					System.out.println("Dien tich :"+ list.get(i).getArea());
					System.out.println("====================================");

			 }
		}		
			
		
		

	}
}
