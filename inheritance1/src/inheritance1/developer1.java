package inheritance1;

public class developer1 extends employee1 {
	private int noofhrs;

	public developer1(int employeeId, String employeeName, double employeesalary, int noofhrs) {
		super(employeeId, employeeName, employeesalary);
		this.noofhrs = noofhrs;
	}

	public int getNoofhrs() {
		return noofhrs;
	}

	@Override
	public String toString() {
		return "developer1 [noofhrs=" + noofhrs + "]";
	}
	

}
