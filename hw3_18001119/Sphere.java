package hw3_18001119;

public class Sphere extends Shape{
	private double bankinh;
	private double pi= 3.14;
	public double getBankinh() {
		return bankinh;
	}

	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}
	
	public Sphere() {
		super();
	}

	public Sphere(double bankinh) {
		super();
		this.bankinh = bankinh;
	}

	@Override
	protected double getVolume() {
		// TODO Auto-generated method stub
		return (4/3)*pi*Math.pow(bankinh, 3);
	}

	@Override
	protected double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double getPerimeter() {
		// TODO Auto-generated method stub
		return 4*pi*Math.pow(bankinh,2);
	}

	@Override
	public String toString() {
		return "Sphere :" + bankinh ;
	}
	
	
}
