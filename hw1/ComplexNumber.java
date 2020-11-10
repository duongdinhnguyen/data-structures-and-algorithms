package hw1;

import java.util.ArrayList;
import java.util.Scanner;

public class ComplexNumber {
	private static Scanner sc;
	private int phanthuc;
	private int phanao;
	public ComplexNumber() {
		
	}
	public ComplexNumber(int phanthuc, int phanao) {
		super();
		this.phanthuc = phanthuc;
		this.phanao = phanao;
	}
	public int getPhanthuc() {
		return phanthuc;
	}
	public void setPhanthuc(int phanthuc) {
		this.phanthuc = phanthuc;
	}
	public int getPhanao() {
		return phanao;
	}
	public void setPhanao(int phanao) {
		this.phanao = phanao;
	}
	@Override
	public String toString() {
		return  phanthuc + "+"+ phanao + "i";
	}
	private static void input(ArrayList<ComplexNumber> awc) {
		sc= new Scanner(System.in);
		int n= Integer.parseInt(sc.nextLine());
		ComplexNumber [] arr= new ComplexNumber[n];
		for(int i=0;i<n;i++) {
			int phanthuc= Integer.parseInt(sc.nextLine());
			int phanao= Integer.parseInt(sc.nextLine());
			arr[i]= new ComplexNumber(phanthuc,phanao);
			awc.add(arr[i]);
		}
	}
	private static void output(ArrayList<ComplexNumber> awc) {
		for(int i=0;i<awc.size();i++) {
			System.out.println("ComplexNumber :"+awc.get(i));
		}

	}
	public static void main(String [] args ) {
		ArrayList<ComplexNumber> awc= new ArrayList<ComplexNumber>();
		input(awc);
		output(awc);
		sumComplexNumber(awc);
		multiplyComplexNumber(awc);
	}
	private static void multiplyComplexNumber(ArrayList<ComplexNumber> awc) {
		// TODO Auto-generated method stub
		ComplexNumber multiply= new ComplexNumber(1,0);
		
		for(int i=0;i<awc.size();i++) {
			int a1=multiply.phanthuc;
			int b1=multiply.phanao;
			multiply.phanthuc= a1* awc.get(i).phanthuc- b1*awc.get(i).phanao;
			multiply.phanao= a1*awc.get(i).phanao+ b1*awc.get(i).phanthuc;

		}
		System.out.println("Multiply ComPlexNumber : "+multiply);

	}
	private static void sumComplexNumber(ArrayList<ComplexNumber> awc) {
		// TODO Auto-generated method stub
		ComplexNumber sum= new ComplexNumber();
		for(int i=0;i<awc.size();i++) {
			sum.phanthuc += awc.get(i).getPhanthuc();
			sum.phanao += awc.get(i).getPhanao();
		}
		System.out.println("Sum ComplexNumber : "+sum);
	}
}

