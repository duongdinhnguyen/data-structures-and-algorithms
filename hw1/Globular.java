package hw1;

import java.util.Scanner;

public class Globular {
	private Globular[] array;
	private Scanner sc = new Scanner(System.in);
	private int r;
	private int x;
	private int y;
	private int z;

	public Globular() {

	}

	public Globular(int r, int x, int y, int z) {
		super();
		this.r = r;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Globular[] getArray() {
		return array;
	}

	public void setArray(Globular[] array) {
		this.array = array;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Ban kinh Globular=" + r + ", Tam I(" + x + ";" + y + ";" + z + ")";
	}

	public Globular[] input() {
		int n = Integer.parseInt(sc.nextLine());
		array = new Globular[n];
		for (int i = 0; i < n; i++) {
			int r = Integer.parseInt(sc.nextLine());
			int x = Integer.parseInt(sc.nextLine());
			int y = Integer.parseInt(sc.nextLine());
			int z = Integer.parseInt(sc.nextLine());
			array[i] = new Globular(r, x, y, z);
		}
		return array;
	}

	public void sosanh() {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].r == array[j].r && array[i].x == array[j].x && array[i].array == array[j].array
						&& array[i].z == array[j].z) {
					System.out.println("Hai hinh cau bao nhau :");
					System.out.println(array[i] + ";" + array[j]);
					System.out.println("----------------------------------------");
				}
				double khoangcach=Math.sqrt(Math.pow(array[i].x-array[j].x, 2)+Math.pow(array[i].y-array[j].y, 2)+Math.pow(array[i].z-array[j].z, 2));
				if(khoangcach== array[i].r+array[j].r) {
					System.out.println("Hai hinh cau tiep xuc nhau");
					System.out.println(array[i]+";"+array[j]);
					System.out.println("----------------------------------------");
				}
				else if(khoangcach <array[i].r+array[j].r && khoangcach!=0) {
					System.out.println("Hai hinh cau  giao nhau");
					System.out.println(array[i]+";"+array[j]);
					System.out.println("----------------------------------------");
				}
			}
		}
	}

	public void Globu() {
		double pi = 3.14;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
			System.out.println("Dien tich xung quanh Globular :" + 4 * pi * Math.pow(array[i].r, 2));
			System.out.println("The tich Globular :" + 4 * pi * array[i].r);
			System.out.println("--------------------------------------------");
		}
	}
}
