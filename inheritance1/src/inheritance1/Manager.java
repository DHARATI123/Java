package inheritance1;

public class Manager extends employee1 {
	private double bonus;

	public Manager(int employeeId, String employeeName, double employeesalary, double bonus) {
		super(employeeId, employeeName, employeesalary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Manager m2=(Manager )obj;
		if(this.getEmployeeId()==m2.getEmployeeId()){
			return true;
			
		}
		return false;
		// TODO Auto-generated method stub
		
	}
	
	

}
