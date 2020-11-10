package hw3_18001119;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	protected double getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	protected double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}

	@Override
	public String toString() {
		return "Rectangle : " + width + ";" + height ;
	}
	
}