package JUnit.employee;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEmployeeDetails {
	EmployeeDetails employee = new EmployeeDetails();
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();

	@Test
	public void testCalculateRaise() {
		employee.setName("Dani");
		employee.setAge(25);
		employee.setMonthlySalary(105000);
		double raise = empBusinessLogic.calculateRaise(employee);
		assertEquals(-5000, raise, 0.0);
	}

	@Test
	public void testCalculateYearlySalary() {
		employee.setName("Dani");
		employee.setAge(25);
		employee.setMonthlySalary(105000);

		double salary = empBusinessLogic.calculateYearlySalary(employee);
		assertEquals(1260000, salary, 0);
	}

	@Test
	public void after() {
		employee.setName("Dani");
		employee.setAge(25);
		employee.setMonthlySalary(105000);
		double after = empBusinessLogic.after(employee);
		assertEquals(1255000, after, 1265000);
	}

}
