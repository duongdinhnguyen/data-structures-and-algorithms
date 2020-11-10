package hw3_18001119;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Complex {
	private float real;
	private float image;
	private Random rd= new Random();
	private Complex temp;
	private Scanner sc= new Scanner(System.in);
	//private Complex [] array;
	private ArrayList<Complex> list= new ArrayList<Complex> ();
	public Complex(float real, float image) {
		super();
		this.real = real;
		this.image = image;
	}
	public Complex() {
		super();
	}
	public float getReal() {
		return real;
	}
	public void setReal(float real) {
		this.real = real;
	}
	public float getImage() {
		return image;
	}
	public void setImage(float image) {
		this.image = image;
	}
	public void input() {
		int n= Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			int real= rd.nextInt(20);
			int image= rd.nextInt(20);
			Complex awc= new Complex(real,image);
			list.add(awc);
		}
	
	}
	public void search() {
		int real= Integer.parseInt(sc.nextLine());
		int image= Integer.parseInt(sc.nextLine());
		Complex temp1= new Complex(real,image);
		for(Complex i: list) {
			if(i.equals(temp1)) {
				System.out.println("Co xuat hien");
			}
		}
	}
	public void MyOut() {
		int n= Integer.parseInt(sc.nextLine());
		System.out.println(list.get(n-1));
	}
	public void SumComplex() {
		temp= new Complex(0,0);
		for(Complex i: list) {
			Complexadd(i);
		}
		System.out.println("Tong cac so phuc :" +temp);
	}
	public void output() {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	public void Complexadd(Complex c) {
		//temp = new Complex(0,0);
		temp.real += c.real;
		temp.image += c.image;
		
	}
	public Complex Complexminus(Complex c) {
		temp= new Complex(0,0);
		temp.real= this.real- c.real;
		temp.image= this.image- c.image;
		return temp;
	}
	public Complex MultiComplex(Complex c) {
		temp.real= this.real*c.real- this.image*c.image;
		temp.image= this.real*c.image+ this.image*c.real;
		return temp;
	}
	@Override
	public String toString() {
		return  real + " + " + image + "i";
	}
	
	
}
 