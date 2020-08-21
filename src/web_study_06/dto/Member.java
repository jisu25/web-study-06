package web_study_06.dto;

public class Member {

	private String name;
	private String userId;
	private String nickname;
	private String pwd;
	private String email;
	private String phone;
	
	public Member() {
	}

	public Member(String name, String userId, String nickname, String pwd, String email, String phone) {
		super();
		this.name = name;
		this.userId = userId;
		this.nickname = nickname;
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return String.format("Member [name=%s, userId=%s, nickname=%s, pwd=%s, email=%s, phone=%s]", name, userId,
				nickname, pwd, email, phone);
	}
	
	
	
}
