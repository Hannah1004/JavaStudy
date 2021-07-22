package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class A04_SQLInjection {

	// coffee 테이블에 SQLInjection 공격을 성공시켜보세요.
	// (일부러 ?를 사용하지 않아야 함)
	
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
		
		String id = "3";
		// String id = "3 or 1=1";
		
		String sql = "DELETE FROM coffee WHERE id = " + id;
		
		try(
				Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
			//PreparedStatement의 구버전 (보안상 문제가 있는 버전)
			Statement statement = conn.createStatement();
			
			int rows = statement.executeUpdate(sql);
			
			System.out.println("done.");
			//pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
