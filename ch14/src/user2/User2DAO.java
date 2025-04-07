package user2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User2DAO {
	
	

private static User2DAO instnace = new User2DAO();
public static User2DAO getInstnace() {
	return instnace;
}

private User2DAO() {}

	// DB 정보
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER= "root";
	private final static String PASS = "1234";
	
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement psmt = null;

	

	
	// CRUD 메서드
	public void insertUser(User2VO vo) {
			String sql = "Insert into `user2` values (?,?,?,?)";
			
		try {
			
			conn = DriverManager.getConnection(HOST, USER, PASS);
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getBirth());
			psmt.setString(4, vo.getAddr());
			
			psmt.executeUpdate();
			
			
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		public User2VO selectUser(String uid) {
			
			String sql = "select * from `user2` where `uid =?";
			User2VO user = null;
			
			try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);
			
			} catch (Exception e) {
			}
		
		
	}
	
}
	
