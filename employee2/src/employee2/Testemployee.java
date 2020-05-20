package employee2;

public class Testemployee {
	public static void main (String[] args){
		Address A1=new Address("pune","maharashtra","india",411043);
		Address A2=new Address("alibag","maharashtra","india",402201);
		Address arr[]=new Address[2];
		arr[0]=A1;
		arr[1]=A2;
		Employee E1=new Employee("xyz",20,arr);
		display(E1);
	}
	public static void display(Employee emp){
		 System.out.println("employeeId :"+emp.getEmployeeId());
		  System.out.println("EmployeeName :"+emp.getEmployeeName());
		  Address arr[]=emp.getA1();
			for(Address A1:arr){
		  System.out.println("AddressCity :"+A1.getCity());
		  System.out.println("AddressState :"+A1.getCountry());
		  System.out.println("AddressCountry :"+A1.getState());
		  System.out.println("Addresspincode :"+A1.getPincode());
	
		}

		

	}
}


