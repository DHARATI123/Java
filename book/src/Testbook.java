import java.util.Scanner;
public class Testbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Book1 b[]=accept();
      display(b);
      }
 public static Book1 [] accept(){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("how many books do you want");
	 int n=sc.nextInt();
	 Book1 barr[]=new Book1[n];
	 for(int i=0;i<barr.length;i++){
			System.out.println("enter book name, book price");
			String Name=sc.next();
			int price=sc.nextInt();
			Book1 b=new Book1( Name , price);
			barr[i]=b;
		}
		return barr;
	 }
 public static void display(Book1 barr[]){
		for(Book1 b:barr){
			System.out.println("name of book:"+b.getName());
			System.out.println("price of book:"+b.getPrice());
			
		}			
	}
}
