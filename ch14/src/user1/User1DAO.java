package user1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2024/07/29   
 * 이름 : 박서홍
 * 내용 : Transcation 실습하기
 */
public class User1DAO {
	
	private static User1DAO instnace = new User1DAO();
	public static User1DAO getInstance() {
			return instnace;
			
	} 
	private User1DAO() {}
		
		// DB 정보
		private final static  String HOST = "jdbc:mysql://localhost:3306/studydb";
		private final static  String USER = "root";
		private final static  String PASS = "1234";
		   
	
	
	// CRUD 메서드
	public void insertUser(User1VO vo) {
		
		String sql = "INSERT INTO `user1` values(?,?,?,?,?)";
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
		PreparedStatement psmt = conn.prepareStatement(sql);
		
		
		
			psmt.setString(1,vo.getUid());
			psmt.setString(2,vo.getName());
			psmt.setString(3,vo.getBirth());
			psmt.setString(4,vo.getHp());
			psmt.setInt(5,vo.getAge());
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public User1VO selectUser(String uid) {
		
		String sql = "select * from `user1` where `uid` =?";
		User1VO user = null;
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);
			
			ResultSet rs = psmt.executeQuery();
			
			// 조회결과가 1 또는 0이기 때문에 while 대신 if문으로 next()
			if(rs.next()) {
				user = new User1VO();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setHp(rs.getString(4));
				user.setAge(rs.getInt(5));
			}
			
			rs.close();
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}					
		return null;
	}
	
	public List<User1VO> selectUsers() {
		
		String sql = "select * from `user1`";
		List<User1VO> users = new ArrayList<>();
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users; 
	} 
			
	public int updateUser(User1VO vo) {
		
		String sql = "update `user1` set `name`=?, `birth`=?, `hp`=? `age`=? where `uid`=?";
		int result = 0;
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getBirth());
			psmt.setString(3, vo.getHp());
			psmt.setInt(4, vo.getAge());
			psmt.setString(5, vo.getUid());
			
			
			result = psmt.executeUpdate();
			
			psmt.close();
			conn.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
			
	public int deleteUser(String uid) {
		String sql = "Delete from `user1` where `uid` = ?"; 
		int result = 0;
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);
			
			result = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
		
	
	
		
	


}
