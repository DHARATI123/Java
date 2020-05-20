package inheritance1;

public class TestEmp {
	public static void main(String[] args) {
		Manager m1=new Manager(102,"ramesh",10000,20000);
		display(m1,"manager");
		Manager m2=new Manager(102,"ramesh",10000,20000);
		display(m2,"manager");
		developer1 d1=new developer1(103,"paresh",30000,20);
		display(d1,"developer1");
		if (m1.equals(m2)){
			System.out.println("obj are same");
		}
		else{
			System.out.println("obj are not same");
		}
	}
	public static void display(employee1 e,String str)
	{
		System.out.println(str+"Id is:"+e.getEmployeeId());
		System.out.println(str+" name is:"+e.getEmployeeName());
		System.out.println(str+"salary is:"+e.getEmployeesalary());

		if(e instanceof Manager){
			Manager m1=(Manager)e;
			System.out.println("manager bonus is:"+m1.getBonus());
		}
		if(e instanceof Manager){
			Manager m2=(Manager)e;
			System.out.println("manager bonus is:"+m2.getBonus());
		}
		if(e instanceof developer1){
				developer1 d1=(developer1)e;
				System.out.println("developers no of hrs are:"+d1.getNoofhrs());
		
		}

	}
}