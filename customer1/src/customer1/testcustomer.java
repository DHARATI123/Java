package customer1;
import java.util.Scanner;
public class testcustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer1 c[]=accept();
		display(c);
	}
	public static Customer1 [] accept(){
		Scanner sc=new Scanner(System.in);
		System.out.println("how many objects do you want");
		int n=sc.nextInt();
		Customer1 carr[]=new Customer1[n];
		for(int i=0;i<carr.length;i++){
			System.out.println("enter cust Id,name,mobileno");
			int custId=sc.nextInt();
			String custName=sc.next();
			int mobile=sc.nextInt();
			Customer1 c=new Customer1(custId,custName,mobile);
			carr[i]=c;
		}
		return carr;
	}
	public static void display(Customer1 carr[]){
		for(Customer1 c:carr){
			System.out.println("custId:"+c.getCustId());
			System.out.println("custname:"+c.getCustName());
			System.out.println("mobileno:"+c.getMobileno());
		}
	}
}