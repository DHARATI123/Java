import java.util.Scanner;
public class Calculator {

	private static Numbers n;
	public static void main(String[] args) {
		Numbers no=accept();
		//no=calculate(no);
		Numbers n1= Numbers();
	}

	


	private static Numbers accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no");
		double firstno=sc.nextDouble();
		System.out.println("Enter second no");
		double secondno=sc.nextDouble();
	
		// TODO Auto-generated method stub
		return n;
	}
	private static Numbers Numbers() {
		// TODO Auto-generated method s

	//private static Numbers calculate(Numbers no) {
		Scanner sc=new Scanner(System.in);
		int choice=0;{
		do{
			System.out.println("1.Addition\n2.sub\n3.mul\n4.div\n5.ave");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			
			Numbers n = null;
			switch(ch){
			case 1:System.out.println("Result is:"+n.addition());
			break;
			case 2:System.out.println("Result is :"+n.substraction());
			break;
			case 3:System.out.println("Result is:"+n.multiplication());
			break;
			case 4:System.out.println("Result is"+n.division());
			break;
			case 5:System.out.println("Result is"+n.Average());
			break;
			
			}
			System.out.println("Do you want to continue");
			choice=sc.nextInt();
		}while(choice==1);
		// TODO Auto-generated method stub
		//return no;
		return null;
		}
		
	}
}	