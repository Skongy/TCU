package com.cn.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cn.entity.Product;
import com.cn.util.DBcon;

import java.sql.PreparedStatement;

public class ProductDao {
	public ArrayList<Product> getAllProduct(){
		ArrayList<Product> list=new ArrayList<Product>();
		Connection con =DBcon.getCon();
		String sql="select * from product";
			PreparedStatement prest=null;
			ResultSet rs=null;
			try {
				prest=con.prepareStatement(sql);
				rs=prest.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString("name");
				String brand=rs.getString("brand");
				String type =rs.getString("type");
				int price=rs.getInt("price");
				String content =rs.getString("content");
				String picture=rs.getString("picture");
				Product product =new Product(id,name,brand,type,price,content,picture);
				list.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBcon.close(rs, prest, con);
		return list;
}
	public Product getproductbyId(int id){
		Product product=null;
		Connection con=DBcon.getCon();
		String sql="select * from product where id=?";
		PreparedStatement prest=null;
		ResultSet rs=null;
		try {
			prest=con.prepareStatement(sql);
			prest.setInt(1,id);
			rs=prest.executeQuery();
            if(rs.next()) {
				int ids=rs.getInt(1);
				String name=rs.getString("name");
				String brand=rs.getString("brand");
				String type =rs.getString("type");
				int price=rs.getInt("price");
				String content =rs.getString("content");
				String picture=rs.getString("picture");
				product =new Product(ids,name,brand,type,price,content,picture);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBcon.close(rs, prest, con);
		return product;
	}
	
	
	public int addProduct(Product product) {
		int count=0;
		Connection con=DBcon.getCon();
		String sql="insert into product value(?,?,?,?,?,?,?)";
		PreparedStatement prest=null;
		try {
			prest = con.prepareStatement(sql);
			prest.setInt(1,product.getId());
			prest.setString(2,product.getName());
			prest.setString(3,product.getBrand());
			prest.setString(4,product.getType());
			prest.setInt(5,product.getPrice());
			prest.setString(6,product.getContent());
			prest.setString(7,product.getPicture());
			count=prest.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBcon.close(null, prest, con);
		return count;
	}
	
	public int deleteByid(int id) {
		int count=0;
		Connection con=DBcon.getCon();
		String sql="delete from product where id=?";
		PreparedStatement prest=null;
		try {
			prest = con.prepareStatement(sql);
			prest.setInt(1, id);
			count=prest.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBcon.close(null, prest, con);
		return count;
	}
	
	public int updateProduct(Product product, int id_)  {
		int count=0;
		Connection con=DBcon.getCon();
		String sql="update product set id=?,name=?,brand=?,type=?,price=?,content=?,picture=? where id='"+id_+"' ";//查询id相等的商品
		PreparedStatement prest=null;
		try {
			prest = con.prepareStatement(sql);
			prest.setLong(1, product.getId());
			prest.setString(2, product.getName());
			prest.setString(3, product.getBrand());
			prest.setString(4, product.getType());
			prest.setInt(5,product.getPrice());
			prest.setString(6, product.getContent());
			prest.setString(7, product.getPicture());
			count=prest.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();

		}
		DBcon.close(null, prest, con);
		return count;
	}

}
