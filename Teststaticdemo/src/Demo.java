import static java.lang.System.out;
public class Demo {
	int n1;
	static int n2;
   public void show()
   {
	   out.println("value of n1 is :"+n1);
	   out.println("value of n1 is :"+n2);
   }
   public static void display(){
	   Demo t=new Demo();
	   out.println("value of n1 is :"+t.n1);
	   System.out.println("value of n1 is :"+n2);
	   
   }
}
public class TeststaticDemo{
	public static void main(String[] args){
		System.out.println("welcome......");
		System.out.println("main.......");
		Demo d1=new Demo();
		d1.n1=10;
		d1.n2=10;
		System.out.println("..........................for d1..........................");
		System.out.println("value of n1 is :"+d1.n1);
		System.out.println("value of n1 is :"+d1.n2);
		  Demo d2=new Demo();
		  d2.n1=20;
		  d2.n2=20;
		  System.out.println("....................for d2...................");
		  System.out.println("value of n1 is :"+d2.n1);
		  System.out.println("value of n1 is :"+d2.n2);
		  System.out.println("...................for d1.................");
		  System.out.println("value of n1 is :"+d1.n1);
		  System.out.println("value of n1 is :"+d1.n2);
		  Demo.display();
	}


}

		  
		


	

