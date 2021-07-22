package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.A06_HikariCP;
import jdbc.model.Departments;
import jdbc.model.Employees;

public class A07_DataJoinModel {
	/*
	 	employees와 departments를 조인하여 조회한 결과를 알맞는 model에 담아 출력 해보세요.
	 */
	
	public static void main(String[] args) {
		
		String sql = "SELECT employee_id, first_name, email, hire_date,"
						+ " salary, department_id, department_name FROM employees "
						+ "INNER JOIN departments USING(department_id) ORDER BY employee_id";
		
		ArrayList<Employees> empList = new ArrayList<>();
		ArrayList<Departments> deList = new ArrayList<>();
		
		try(
			Connection conn = A06_HikariCP.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		){
			
			while (rs.next()) {
				empList.add(new Employees(
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getInt("salary"),
						rs.getInt("department_id"),
						rs.getString("department_name")));
				
			}
			System.out.println(empList);
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
