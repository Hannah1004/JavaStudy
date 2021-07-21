package jbdc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class A04_SQLInjection {

	// coffee 테이블에 SQLInjection 공격을 성공시켜보세요.
	// (일부러 ?를 사용하지 않아야 함)
	
	// 프로그램의 원래 동작은 가격이 3000원에서 4000원 사이인 커피를 조회하는 기능입니다.
	
	// 프로그램의 원래 동작은 사용자가 원하는 id의 커피를 삭제하는 동작이었다.
	
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
		
		System.out.print("처음 가격 >>");
		startPrice = sc.nextInt();
		
		System.out.print("끝 가격 >> ");
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
