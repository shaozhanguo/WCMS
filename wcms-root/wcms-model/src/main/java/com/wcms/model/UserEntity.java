package com.wcms.model;

public class UserEntity {

	private String userId;
	
	private String userCode;
	
	private String userName;
	
	private String userPwd;
	
	private String userBirthday;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userCode=" + userCode + ", userName=" + userName + ", userPwd="
				+ userPwd + ", userBirthday=" + userBirthday + ", getUserId()=" + getUserId() + ", getUserCode()="
				+ getUserCode() + ", getUserName()=" + getUserName() + ", getUserPwd()=" + getUserPwd()
				+ ", getUserBirthday()=" + getUserBirthday() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}

