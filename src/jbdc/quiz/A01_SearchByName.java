package jbdc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class A01_SearchByName {
	/*
	 	# ����ڷ� ���� ���ڿ��� �Է¹����� �ش� ���ڿ��� �̸��� ���Ե� ��� ����� ��ȸ�غ�����
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String text;
		System.out.print("���ڿ��� �Է����ּ��� >> ");
		text = sc.nextLine();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("�ش� ���̺귯���� ã�� �� ����");
		}
		
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"1234"
			);
			
			String sql = "SELECT employee_id, first_name, salary"
					+ " FROM EMPLOYEES WHERE LOWER(FIRST_NAME) LIKE LOWER('%" + text + "%')";
			
			PreparedStatement pstmt 
					= conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%-10d%-15s%-8d\n",
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getInt("salary"));
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("getConnection �ϴٰ� ���� ����");
		}
	}
}
