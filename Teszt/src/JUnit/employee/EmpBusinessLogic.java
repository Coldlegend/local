package JUnit.employee;

public class EmpBusinessLogic {
	// raise
	public double calculateYearlySalary(EmployeeDetails employeeDetails) {
		double yearlySalary = 0;
		yearlySalary = employeeDetails.getMonthlySalary() * 12;
		return yearlySalary;
	}

	public double calculateRaise(EmployeeDetails employeeDetails) {
		double raise = 0;
		if (employeeDetails.getMonthlySalary() < 80000) {
			raise = 20000;
		} else if (employeeDetails.getMonthlySalary() > 80000 && employeeDetails.getMonthlySalary() < 100000) {
			raise = 10000;
		} else {
			raise = -5000;
		}
		return raise;
	}
	
	public double after (EmployeeDetails employeeDetails) {
		double after = 0;
		if (employeeDetails.getMonthlySalary() > 80000){
			 after = calculateYearlySalary(employeeDetails) - calculateRaise(employeeDetails);
		}
		return after;
	}

}
