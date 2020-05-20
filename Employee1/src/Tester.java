
public class Tester extends Employee {
	private int NoofTest;

	public Tester(int employeeId, String employeename, double employeesalary, int noofTest) {
		super(employeeId, employeename, employeesalary);
		NoofTest = noofTest;
	}

	public int getNoofTest() {
		return NoofTest;
	}
	

}
