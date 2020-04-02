package baby.diary.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import baby.diary.domain.MemberVO;

public class MemberDAO {
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
	
	public boolean add(MemberVO vo) { /*멤버 추가*/
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
	
	public ArrayList<MemberVO> getMemberList(){ /*멤버 리스트 보기*/
		connect();
		ArrayList<MemberVO> memberlist = new ArrayList<MemberVO> ();
		String sql = "select * from `member`";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setUsername(rs.getString("username"));
				vo.setMobile(rs.getString("mobile"));
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				memberlist.add(vo);
			}rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}return memberlist;
	}
	
	public boolean login_check(String id, String pwd){ //로그인 확인, 로그인 저장
		connect();
		String sql = "select `password` from `member` where id = '" + id + "'";
		ResultSet rs = null;
		Boolean bs = false;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String pass = rs.getString("password");
				if(pass.equals(pwd)) {
					bs = true;
				}
			}rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return bs;
	}
	
	public MemberVO read(String str) { //update 구문에서 사용할 MemberVO
		connect();
		MemberVO vo = new MemberVO();
		String sql = "select * from `member` where id = '" + str + "'";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				vo.setId(rs.getString("id"));
				vo.setUsername(rs.getString("username"));
				vo.setMobile(rs.getString("mobile"));
				vo.setPassword(rs.getString("password"));
			}rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}return vo;
	}
	
	public boolean update(MemberVO vo) { /*회원 정보 변경*/
		connect();
		String sql = "update `member` set username=?, mobile=?, id=?, `password`=? where id ='" + vo.getId()  +"'";
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
	
	public boolean delete(MemberVO vo) { /*회원 정보 삭제*/
		connect();
		String sql = "delete from `member` where id ='" + vo.getId()  +"'";
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
