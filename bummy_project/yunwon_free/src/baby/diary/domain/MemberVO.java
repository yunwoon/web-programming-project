/*회원들 관리*/
/*이름, 소속, 전화번호, 아이디, 비밀번호*/
package baby.diary.domain;

public class MemberVO {
	private String username;
	private String mobile;
	private String id;
	private String password;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}