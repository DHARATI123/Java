
public class Testarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=null;
		s=new Circle(2.2);
		System.out.println("Area of circle:"+s.findArea());
		s=new Triangle(2.2,3.4);
		System.out.println("Area of triangle:"+s.findArea());
			

	}

}
