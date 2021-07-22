package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class A05_MetaData {

	public static void main(String[] args) {
		
		// SELECT������ ������ ResultSet���� ResultSetMetaData�� ���� �� �ְ�, 
		// ������ �����͵��� ��Ÿ�����͸� �� �� �ִ�.
		String sql1 = "SELECT employee_id, job_id, department_id FROM employees";
		String sql2 = "SELECT * FROM coffee";
		
		try(
				Connection conn = DBConnector.getConnection();
				PreparedStatement pstmt1 = conn.prepareStatement(sql1);
				PreparedStatement pstmt2 = conn.prepareStatement(sql2);
				ResultSet rs1 = pstmt1.executeQuery();
				ResultSet rs2 = pstmt2.executeQuery();
		){
			ResultSetMetaData meta1 = rs1.getMetaData();
			
			System.out.println("Employees���̺��� ����");
			
			int MAX_COLUMN_EMP = meta1.getColumnCount();
			System.out.println("�÷��� ���� : " + MAX_COLUMN_EMP + "��");
			
			for(int col = 1; col <= MAX_COLUMN_EMP; ++col) {
				System.out.printf("%-20s%-14s%-25s\n",
						meta1.getColumnName(col),
						meta1.getColumnTypeName(col),
						meta1.getColumnClassName(col));
			}
			
			System.out.println("----------------------- ���� ���� --------------------------");
			// ���� ���� : meta2�� ����غ�����
			ResultSetMetaData meta2 = rs2.getMetaData();
			
			System.out.println("Coffee���̺��� ����");
			
			int MAX_COLUMN_COFFEE = meta2.getColumnCount();
			System.out.println("�÷��� ���� : " + MAX_COLUMN_COFFEE + "��");
			
			for(int col = 1; col <= MAX_COLUMN_COFFEE; ++col) {
				System.out.printf("%-20s%-14s%-25s\n",
						meta1.getColumnName(col),
						meta1.getColumnTypeName(col),
						meta1.getColumnClassName(col));
			}
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
