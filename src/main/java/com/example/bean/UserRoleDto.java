package com.example.bean;

public class UserRoleDto {
	
	private int userid;
	private String userName;
	private String userRole;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "UserRoleDto [userid=" + userid + ", userName=" + userName + ", userRole=" + userRole + "]";
	}
	

}
