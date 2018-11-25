package info.sjd.entity;

public class User {

	private Integer userId;
	private String login;
	private String password;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(Integer userId, String login, String password) {
		this.userId = userId;
		this.login = login;
		this.password = password;
	}

	public User() {
	}
}
