package com.yueqian.epidemic_domain.domain;

public class UsersVO {
	private int userId;
	private String password;
	private String userName;
	
	public static UsersVO getFallbackInstance() {
		return new UsersVO(-1, "降级处理用户名");
	}
	
	public UsersVO() {
		super();
	}
	public UsersVO(int userId, String userName) {
		super();
		this.userId = userId;
		this.password = "123";
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
