package jbdc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class A04_SQLInjection {

	// coffee ���̺� SQLInjection ������ �������Ѻ�����.
	// (�Ϻη� ?�� ������� �ʾƾ� ��)
	
	// ���α׷��� ���� ������ ������ 3000������ 4000�� ������ Ŀ�Ǹ� ��ȸ�ϴ� ����Դϴ�.
	
	// ���α׷��� ���� ������ ����ڰ� ���ϴ� id�� Ŀ�Ǹ� �����ϴ� �����̾���.
	
	// DELETE FROM coffee WHERE id = 1 or 1=1
	
	private static String driverName = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	private static String user = "hr";
	private static String password = "1234";
	
	static {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int startPrice;
		int endPrice;
		
		System.out.print("ó�� ���� >>");
		startPrice = sc.nextInt();
		
		System.out.print("�� ���� >> ");
		endPrice = sc.nextInt();
		
		String exploit = "; DELETE FROM coffee";
		
		String sql = "SELECT * FROM coffee WHERE price BETWEEN "
											+ startPrice + " AND " + endPrice + exploit;
		try(
				Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
				
			try(
					ResultSet rs = pstmt.executeQuery();
			){
				while(rs.next()) {
					System.out.printf("%-4d%-10s%5d\n",
						rs.getInt("id"),
						rs.getString("name"),
						rs.getInt("price"));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
