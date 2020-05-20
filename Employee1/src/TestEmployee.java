
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic static void main (String[]args){
		System.out.println(".................manager details............................");
	    Manager m1=new Manager(102,"ramesh",100000,100000);
	    System.out.println("Manager Id:"+m1.getEmployeeId());
        System.out.println("Manager NAme"+m1.getEmployeename());
        System.out.println("manager salary"+m1.getEmployeesalary());
        System.out.println("manager BOnus"+m1.getBonus());
        System.out.println("................Developer details.........................");
        Developer d1=new Developer(103,"suresh",2000000,200000000);
        System.out.println("Developer Id"+d1.getEmployeeId());
        System.out.println("Developer name"+d1.getEmployeename());
        System.out.println("developer salary"+d1.getEmployeesalary());
        System.out.println("developers no of hrs"+d1.getNoofhr());
        Tester t1=new Tester(104,"Prakash",2000000,200000000);
        System.out.println("Tester Id"+t1.getEmployeeId());
        System.out.println("tester name"+t1.getEmployeename());
        System.out.println("tester salary"+t1.getEmployeesalary());
        System.out.println("No of tests"+t1.getNoofTest());
}
}