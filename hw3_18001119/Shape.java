package hw3_18001119;



/*
 *  1: Hinh tron
 * 	2: hinh cau
 * 	3: Hinh chu nhat
 * */
public abstract class Shape {
	
	protected String name;
	protected abstract double getVolume();
	protected abstract double getArea();
	protected abstract double getPerimeter();
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	
	public Shape() {
		super();
	}
}



