package employee2;

public class Employee {
	private String employeeName;
	private int employeeId;
	private Address []arr;
	
	public Employee(String employeeName, int employeeId, Address[] a1) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.arr = a1;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	//public void setEmployeeName(String employeeName) {
		//this.employeeName = employeeName;
	//}

	public int getEmployeeId() {
		return employeeId;
	}

//	public void setEmployeeId(int employeeId) {
	//	this.employeeId = employeeId;
	//}

	public Address[] getA1() {
		return arr;
	}

	//public void setA1(Address a1) {
		//A1 = a1;
	//}

}
