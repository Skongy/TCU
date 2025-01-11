package com.cn.entity;

public class Message {
		private int mid;
		private String title ;
		private String content;
		private String name;
		private String time ;
		private int count ;
		public Message(int mid, String title, String content, String name, String time, int count) {
			super();
			this.mid = mid;
			this.title = title;
			this.content = content;
			this.name = name;
			this.time = time;
			this.count = count;
		}
		public Message(String name, String title, String content, String time, int count) {
			super();
			this.title = title;
			this.content = content;
			this.name = name;
			this.time = time;
			this.count = count;
		}
		public int getMid() {
			return mid;
		}
		public void setMid(int mid) {
			this.mid = mid;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		
	
	
}
