package hw2;

import java.util.ArrayList;
import java.util.Collections;

public class MainT {
	public static void main(String [] a) {
		ArrayList<T> list= new ArrayList<T>();
		list.add(new T(23,"Peter"));
		list.add(new T(12,"John"));
		list.add(new T(8,"Jack"));
		list.add(new T(34,"Avi"));
		list.add(new T(35,"Skt"));
		list.add(new T(17,"Yorn"));
		list.add(new T(45,"NaTa"));
		list.add(new T(37,"Sky"));
		list.add(new T(29,"Tom"));
		System.out.println("Truoc khi sap xep :");
		for(T i : list) {
			System.out.print(i.getVar()+" ");
		}
		System.out.println();
		System.out.println("===================================================");

		Collections.sort(list);
		System.out.println("Sau khi sap xep :");

		for(T i : list) {
			System.out.print(i.getVar()+" ");
		}

}
}
