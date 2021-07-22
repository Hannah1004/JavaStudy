package jdbc.model;

public class Employees {

	private int employee_id;
	private String first_name;
	private int salary;
	private int department_id;
	private String department_name;
	
	public Employees(int employee_id, String first_name, int salary, int department_id, String department_name) {
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.salary = salary;
		this.department_id = department_id;
		this.department_name = department_name;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public int getSalary() {
		return salary;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	@Override
	public String toString() {
		return String.format("%-6d%-15s%-6d%-6d%-10s\n", employee_id, first_name, salary,
							department_id, department_name);
	}
	
}
