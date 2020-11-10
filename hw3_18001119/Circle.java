package hw3_18001119;

public class Circle extends Shape{
	private double bankinh;
	private double pi= 3.14;
	public double getBankinh() {
		return bankinh;
	}

	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}
	
	public Circle(double bankinh) {
		super();
		this.bankinh = bankinh;
	}

	public Circle() {
		super();
	}

	@Override
	protected double getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double getArea() {
		// TODO Auto-generated method stub
		return pi*Math.pow(bankinh, 2);
	}

	@Override
	protected double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*pi*bankinh;
	}

	@Override
	public String toString() {
		return "Cricle :" + bankinh ;
	}
	
	
	
}

