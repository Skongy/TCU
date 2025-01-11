package com.cn.entity;

public class Reply {
	private int rid;
	private String name ;
	private String content ;
	private String time ;
	private int mid ;
	public Reply(int rid, String name, String content, String time, int mid) {
		super();
		this.rid = rid;
		this.name = name;
		this.content = content;
		this.time = time;
		this.mid = mid;
	}
	public Reply(String content,String name, String time, int mid) {
		super();
		this.name = name;
		this.content = content;
		this.time = time;
		this.mid = mid;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	
}
