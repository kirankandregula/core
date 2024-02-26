package solventek_project.entity;

public class User {
	
	private String userName;
	private String passWord;
	private UserRole role;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + ", role=" + role + "]";
	}
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
	public User(String userName, String passWord, UserRole role) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.role = role;
	}
	
	

}
