package inheritance;

public class testemployee {
	public static void main (String[]args){
		System.out.println(".................manager details............................");
		manager m1= new manager(1002,"Ramesh",50000,40000);
		display(m1,"manager");
		System.out.println("....................developer details.........................");
		developer d1=new developer(1050,"suresh",30000,5);
		display(d1,"developer");
	}
	public static void display(employee e,String str){
		System.out.println(
				
				);
	}
	 /* public static void display(employee e,String str){
		  System.out.println(str+"Id:"+e.getEmployeeId());
		  System.out.println(str+"name :"+e.getEmployeename());
		  System.out.println(str+"salary :"+e.getEmployeesalary());
		  if(e instanceof manager){
			  manager m=(manager)e;
			  System.out.println("manager bonus:"+m.getManagerbonus());
		  if(e instanceof developer){
			  developer d=(developer)e;
			  System.out.println("developer no of hours:"+d.getNoofhr());
		  }
		  }
	  }*/
	  
}
