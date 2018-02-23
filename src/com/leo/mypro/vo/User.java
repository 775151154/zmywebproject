package com.leo.mypro.vo;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class User {
	public String name;
//	注解來至Hibernate Validation各注解
//	@NotEmptyE
	public String fName;
//	@NotEmpty
	public String lName;
	public String password;
	public Date birthDay;
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", fName=" + fName + ", lName=" + lName + ", password=" + password + ", birthDay="
				+ birthDay + "]";
	}
}
