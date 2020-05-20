
public class TestEmploye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	    Manager m1=new Manager(102,"ramesh",100000,100000);
	    display("Manager",m1);
	    Developer d1=new Developer(103,"suresh",10000,200000);
	    display("Developer",d1);
	    Tester t1=new Tester(104,"Prakash",2000000,200000000);
	    display("Tester",t1);
	}
	    public static void display(String str,Employee e){
	    
	    System.out.println(str+" Id:"+e.getEmployeeId());
        System.out.println(str+" NAme"+e.getEmployeename());
        System.out.println(str+" salary"+e.getEmployeesalary());
        if(e instanceof Manager){
        	Manager m=(Manager)e;
        
        System.out.println("manager bonus"+m.getBonus());
        }
        
        if(e instanceof Developer){
        	Developer d=(Developer)e;
        
        System.out.println("Developees no of hrs"+d.getNoofhr());
        }
        if(e instanceof Tester){
        	Tester t=(Tester)e;
        
        System.out.println("No of tests"+t.getNoofTest());
        }
}
}
