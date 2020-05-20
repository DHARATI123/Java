import java.util.Scanner;

public class Testemployee {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
	    Employee e[]=accept();
	      display(e);
	      }
	 private static void display(Employee[] e) {
	 System.out.println("dharati");
	 System.out.println("23");
	 System.out.println("12/45/64");
	 
		// TODO Auto-generated method stub
	 }	
	
	public static Employee[] accept(){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("count of Empolyees");
		 int n=sc.nextInt();
		 Employee earr[]=new Employee[n];
		 for(int i=0;i<earr.length;i++){
				System.out.println("EMployee Name,Employee Id,Employees joining Date");
	             
}
		return earr;
}
}