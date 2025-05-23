package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2024/07/29
 * 이름 : 박서홍
 * 내용 : PreparedInsert 실습하기
 */
public class PreparedDeleteTest {
	
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // <-- 마지막 접속 데이터베이스명
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			// 2단계 - SQL실행 객체(PreparedStatment)생성
			String sql = "DELETE FROM `user2` WHERE `uid`=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "J101");
			// 3단계 - SQL실행
			psmt.executeUpdate();
			// 4단계 - ResultSet 결과처리
			// 5단계 - 데이터베이스 종료
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Delete 완료...");
	}

}
