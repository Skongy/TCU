package com.cn.entity;

public class Product {
		private int id ;
		private String name;
		private String brand;
		private String type;
		private int price;
		private String content ;
		private String picture;
		public Product(int id, String name, String brand, String type, int  price, String content, String picture) {
			super();
			this.id = id;
			this.name = name;
			this.brand = brand;
			this.type = type;
			this.price = price;
			this.content = content;
			this.picture = picture;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getPicture() {
			return picture;
		}
		public void setPicture(String picture) {
			this.picture = picture;
		}
		public Product(String name, String brand, String type, int price, String content, String picture) {
			super();
			this.name = name;
			this.brand = brand;
			this.type = type;
			this.price = price;
			this.content = content;
			this.picture = picture;
		}
		
}
