
public class Circle extends Shape {
 	final double PI=3.14;
 	double r;
	public Circle( double r) {
		super();
		
		this.r = r;
	}
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return PI*r*r;
	}
 	

}
