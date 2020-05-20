public class Developer extends Employee {
	private int noofhr;

	public Developer(int employeeId, String employeename, double employeesalary, int noofhr) {
		super(employeeId, employeename, employeesalary);
		this.noofhr = noofhr;
	}

	public int getNoofhr() {
		return noofhr;
	}
	
}
