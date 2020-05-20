package student;
import java.util.Scanner;
public class Student {

	private int roll_no;
	private String name;
	private int s1,s2,s3;
	private float per;
	private int tot;
	void accept(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student name");
		 name=sc.next();
		System.out.println("enter student roll no.");
		 roll_no=sc.nextInt();
		System.out.println("enter marks for three subjects");
		s1=sc.nextInt();
	  s2=sc.nextInt();
		s3=sc.nextInt();
	}
	void calculate(){
		tot=s1+s2+s3;
		per=tot/3;
	}
	void display(){
		System.out.println("\tRoll no\tName\tElectronics\tPhysics\tElectrical");
		System.out.println("---------------------------------------------------------");

		System.out.println("Student Name\t"+name);
		System.out.println("Roll no.\t"+roll_no);
		System.out.println("Electronics\t"+s1);
		System.out.println("Physics\t"+s2);
		System.out.println("electrical\t"+s3);
		System.out.println("Total=\t"+tot);
		System.out.println("Percentage\t"+per);
		
		
		// TODO Auto-generated method stub

	}

}
