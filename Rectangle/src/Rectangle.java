import java.util.Scanner;
public class Rectangle {
	private int length;
	private int breadth;

	private double area;
  void accept(){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter length of rectangle");
	  length=sc.nextInt();
	  System.out.println("enter the breadth of rectangle");
	  breadth=sc.nextInt();
	  
  }
void calculation(){
	area=length*breadth;
}
void display(){
    System.out.println("length of the rectangle is:"+length);
    System.out.println("breadth of the rectangle is:"+breadth);
    System.out.println("*******************");
    System.out.println("area of the rectangle is :"+area);
    

}
}