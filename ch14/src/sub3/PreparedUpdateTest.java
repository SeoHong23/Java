package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2024/07/29
 * 이름 : 박서홍
 * 내용 : PreparedInsert 실습하기
 */
public class PreparedUpdateTest {
	
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // <-- 마지막 접속 데이터베이스명
		String user = "root";
		String pass = "1234";
		
		// 아이디 J101, '김철수', '부산광역시' 수정하기
		
		try {
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			// 2단계 - SQL실행 객체(PreparedStatment)생성
			String sql = "Update `user2` set `name` = '김철수', `addr` = '부산광역시' where `uid` = 'J101' " ;
			PreparedStatement psmt = conn.prepareStatement(sql);
			// 3단계 - SQL실행
			psmt.executeUpdate();
			// 4단계 - ResultSet 결과처리
			// 5단계 - 데이터베이스 종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update 완료...");
	}

}
