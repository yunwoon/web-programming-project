package baby.diary.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import baby.diary.domain.BabyVO;
import baby.diary.domain.MemberVO;

public class BabyDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	String jdbc_driver = "com.mysql.cj.jdbc.Driver";
	String jdbc_url = "jdbc:mysql://localhost/jspdb?useSSL=false&serverTimezone=UTC";
	
	void connect() {
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "jspbook", "passwd");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void disconnect() {
		if(pstmt != null) {
			try {
				pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean add(MemberVO vo) { /*일기 추가*/
		connect();
		String sql = "insert into `member` values (?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getUsername());
			pstmt.setString(2, vo.getMobile());
			pstmt.setString(3, vo.getId());
			pstmt.setString(4, vo.getPassword());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			disconnect();
		}
		return true;
	}
	
	public ArrayList<BabyVO> getBabyList(){ /*일기장 보기*/
		connect();
		ArrayList<BabyVO> babylist = new ArrayList<BabyVO> ();
		String sql = "select * from `diary`";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				BabyVO vo = new BabyVO();
				vo.setTitle(rs.getString("title"));
				vo.setState(rs.getString("state"));
				vo.setDate(rs.getString("date"));
				vo.setWeather(rs.getString("weather"));
				vo.setContent(rs.getString("content"));
				babylist.add(vo);
			}rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}return babylist;
	}
	
	public BabyVO read(String str) { //일기장 읽기
		connect();
		BabyVO vo = new BabyVO();
		String sql = "select * from diary where date = '" + str + "'";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				vo.setDate(rs.getString("date"));
				vo.setTitle(rs.getString("title"));
				vo.setState(rs.getString("state"));
				vo.setWeather(rs.getString("weather"));
				vo.setContent(rs.getString("content"));
				vo.setSelf(rs.getString("self"));
			}rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}return vo;
	}
	
	public boolean add(BabyVO vo) { /*일기 쓰기*/
		connect();
		String sql = "insert into diary(title,state,weather,content,self) values (?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getState());
			pstmt.setString(3, vo.getWeather());
			pstmt.setString(4, vo.getContent());
			pstmt.setString(5, vo.getSelf());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			disconnect();
		}
		return true;
	}
	
	public boolean delete(BabyVO vo) { /*일기 삭제*/
		connect();
		String sql = "delete from diary where content ='" + vo.getContent()  +"'";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			disconnect();
		}
		return true;
	}
}
