package book;
import java.util.Scanner;


public class testbookapplication {

	public static void main(String[] args) {
		testbookapplication t=new testbookapplication();
		book arr[]=t.accept();
		t.display(arr);
	}
	public book[] accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many objects do you want.....");
		int n=sc.nextInt();
		book arr[]=new book [n];
		int bid;
		String bname;
		double bprice;
		for(int i=0;i<arr.length;i++){
			System.out.println("enter bookid,bname,bprice");
			arr[i]=new book(sc.nextInt(),sc.next(),sc.nextDouble());
		}
		return arr;
		
		}
	public void display(book arr[])
	{
		for(book b:arr){
			System.out.println(b.getBookId()+"\t"+b.getBookname()+b.getBookprice());
		}
		// TODO Auto-generated method s
	
	}

}
