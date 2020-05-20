
public class Manager extends Employee {
	private int bonus;

	
	public Manager(int employeeId, String employeename, double employeesalary, int bonus) {
		super(employeeId, employeename, employeesalary);
		this.bonus = bonus;
	}


	public int getBonus() {
		return bonus;
	}
	

}
