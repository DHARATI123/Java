package inheritance;

public class employee {
private int employeeId;
private String employeename;
private double employeesalary;
public employee(int employeeId, String employeename, double employeesalary) {
	this.employeeId = employeeId;
	this.employeename = employeename;
	this.employeesalary = employeesalary;
}
public int getEmployeeId() {
	return employeeId;
}
public String getEmployeename() {
	return employeename;
}
public double getEmployeesalary() {
	return employeesalary;
}



}
