
public class Triangle extends Shape {
	final double t=0.5;
	double l,b;

	public Triangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	
	}

	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return t*l*b;
	}
	

}
