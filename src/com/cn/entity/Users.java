package com.cn.entity;

public class Users {
	private String name ;
	private String pass;
	private String type;
	public Users(String name, String pass, String type) {
		super();
		this.name = name;
		this.pass = pass;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
