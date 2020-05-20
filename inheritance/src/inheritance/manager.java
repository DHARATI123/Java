package inheritance;
public class manager extends employee {

private int managerbonus;

public manager(int employeeId, String employeename, double employeesalary, int managerbonus) {
	super(employeeId, employeename, employeesalary);
	this.managerbonus = managerbonus;
}

public int getManagerbonus() {
	return managerbonus;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "manager Id"+getemployeeId()+"\nmanager name"+getemployeename()+"\nmanager salary"+getemployeesalary()+"\nmanager bonus"+getmanagerbonus();
	
}


}
