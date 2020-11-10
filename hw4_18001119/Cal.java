package hw4_18001119;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cal {
	private static Scanner sc;
	public static void input(String fileName,ArrayList<String> Cal) {
		try {
			
			sc = new Scanner(new File(fileName));
			while(sc.hasNext()) {
				Cal.add(sc.next());

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static boolean isboolean(String toanhang) {
		try {
			Integer.parseInt(toanhang);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}			
		
	}
	
	public static void main(String [] args) {
		ArrayList<String> Cal=new ArrayList<String>();
		LinkedListStack<String> toantu=new LinkedListStack<String>();
		LinkedListStack<Double> toanhang=new LinkedListStack<Double>();
		int count=0;
		     
		
		
		input("Cal.txt",Cal);
		for(int i=0;i<Cal.size();i++) {
			System.out.print(Cal.get(i));
		}
		System.out.print(" = ");
		for(int i=0;i<Cal.size();i++) {
			if(Cal.get(i).equals("(")) {
				count++;
			}
			else if(Cal.get(i).equals("-")||Cal.get(i).equals("+")||Cal.get(i).equals("*")||Cal.get(i).equals("/")) {
				toantu.push(Cal.get(i));
			}
			else if(isboolean(Cal.get(i))) {
				
				toanhang.push(Double.parseDouble(Cal.get(i)));
			}
			else if(Cal.get(i).equals(")")) {
				count--;
				double a= toanhang.pop();
				String tt= toantu.pop();
				if(tt.equals("+")) {
					toanhang.push(toanhang.pop()+a);
				}
				else if (tt.equals("-")){
					toanhang.push( toanhang.pop()-a);
				}
				else if(tt.equals("*")) {
					toanhang.push(toanhang.pop()*a);
				}
				else if(tt.equals("/")) {
					toanhang.push(toanhang.pop()/a);
				}
				
			}
		}
		if(count >0 ||count < 0) {
			System.out.print("Khong hop le");
		}
		else toanhang.output();
		

		
	}
}
