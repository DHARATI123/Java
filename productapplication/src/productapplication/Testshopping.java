package productapplication;
import java.util.Scanner;
public class Testshopping {
	public static void main(String[] args) {
		customer c=accept();
		display(c);
		public static customer accept(){
			// TODO Auto-generated method stub
			Product arr[]=c.getP1();
			Product p1=new Product(101,"pd",4000);
			Product p2=new Product(102,"laptop",35000);
			Product[] arr=new Product[2];
			arr[0]=p1;
			arr[1]=p2;
			customer c=new customer(12,"pqr",8546284,arr);
            return c;
		}
		public static void display(customer c){
			System.out.println("*****customer details*************");
			System.out.println("CustId :"+c.getCustomerId());
			System.out.println("custName :"+c.getCustomerName());
			Product arr[]=c.
			for(Product p1:arr){
				System.out.println("..............product details...................");
				System.out.println("product Id :"+p1.getProductId());
				System.out.println("product Name :"+p1.getProductName());
				System.out.println("product price:"+p1.getProductPrice());
				
}