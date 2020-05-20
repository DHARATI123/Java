package book;

public class testbook {
	public static void main(String[]args){
		book b1=new book();
		book b2=new book(2,"python",300.00);
		book b3=new book(3,"c++",200.00);
		book b4=new book(4,"c",100.00);
		 
		book arr[]=new book[4];
		arr[0]=b1;
		arr[1]=b2;
		arr[2]=b3;
		arr[3]=b4;
		
		for( book b:arr){
			System.out.println("book id"+b.getBookId());
			System.out.println("book name"+b.getBookname());
			System.out.println("book price"+b.getBookprice());
			System.out.println("==============================");
		}
    
		//System.out.println("book id"+b1.getBookId());
		//System.out.println("book name"+b1.getBookname());
		//System.out.println("book price"+b1.getBookprice());
		 
		//System.out.println("book id"+b2.getBookId());
		//System.out.println("book string"+b2.getBookname());
		//System.out.println("book price"+b2.getBookprice());

		
		//book b3=b1;
	    //b3.setBookId(120);
	    //b3.setBookname("c++");
	    //b3.setBookprice(200);
	    
	    //System.out.println("book id"+b3.getBookId());
		//System.out.println("book string"+b3.getBookname());
		//System.out.println("book price"+b3.getBookprice());
	    
	}

}
