package customer1;

public class Testcustomer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Customer1 c=accept();
     display(c);
     
	}
	public static Customer1 accept(){
		Customer1 c=new Customer1(101,"mahesh",1234);
		return c;
		
	}
public static void display(Customer1 c){
	System.out.println("Cust Id:"+c.getCustId());
	System.out.println("Cust name:"+c.getCustName());
	System.out.println("Cust mobile no:"+c.getMobileno());
}
}
