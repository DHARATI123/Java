package inheritance;

public class developer extends employee {
	private int noofhr;
	public developer(int employeeId, String employeename, double employeesalary, int noofhr) {
		super(employeeId, employeename, employeesalary);
		this.noofhr = noofhr;
	}



	public int getNoofhr() {
		return noofhr;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "developer Id"+getEmployeeId()"\ndeveloper name"+getEmployeeName()"\ndevelopers salary"+getEmployeeSalary()"\nno of hrs"+getNoofhr();
	}
	

}
