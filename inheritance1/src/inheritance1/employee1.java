package inheritance1;

public class employee1 {
	private int employeeId;
	private String employeeName;
	private double employeesalary;
	public employee1(int employeeId, String employeeName, double employeesalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeesalary = employeesalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public double getEmployeesalary() {
		return employeesalary;
	}
	

}
