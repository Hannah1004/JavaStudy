package jdbc.model;

public class Departments {

	private int department_id;
	private String department_name;
	
	public Departments(int department_id, String department_name) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	@Override
	public String toString() {
		return "Departments [department_id=" + department_id + ", department_name=" + department_name + "]";
	}
	
}
