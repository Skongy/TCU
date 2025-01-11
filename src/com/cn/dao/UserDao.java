package com.cn.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.cn.entity.Users;
import com.cn.util.DBcon;

import java.sql.PreparedStatement;

public class UserDao {
	public ArrayList<Users> getAllUsers(){
		ArrayList<Users> list=new ArrayList<Users>();
		Connection con =DBcon.getCon();
		String sql="select * from users";
			PreparedStatement prest=null;
			ResultSet rs=null;
			try {
				prest=con.prepareStatement(sql);
				rs=prest.executeQuery();
			while(rs.next()) {
				String name=rs.getString("name");
				String pass=rs.getString("pass");
				String type =rs.getString("type");
				Users users =new Users(name,pass,type);
				list.add(users);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		DBcon.close(rs, prest, con);
		return list;
}
	
	public int addUsers(Users users) {
		int count=0;
		Connection con=DBcon.getCon();
		String sql="insert into users value(?,?,?)";
		PreparedStatement prest=null;
		try {
			prest = con.prepareStatement(sql);
			prest.setString(1,users.getName());
			prest.setString(2,users.getPass());
			prest.setString(3,users.getType());
			count=prest.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBcon.close(null, prest, con);
		return count;
	}
	
	public int deleteByName(String name) {
		int count=0;
		Connection con=DBcon.getCon();
		String sql="delete from users where name=?";
		PreparedStatement prest=null;
		try {
			prest = con.prepareStatement(sql);
			prest.setString(1, name);
			count=prest.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBcon.close(null, prest, con);
		return count;
	}
	
	public int updateUsers(Users user,String name)  {
		int count=0;
		Connection con=DBcon.getCon();
		String sql="update users set name=?,pass=? ,type=?, where name='"+name+"' ";
		PreparedStatement prest=null;
		try {
			prest = con.prepareStatement(sql);
			prest.setString(1, user.getName());
			prest.setString(2, user.getPass());
			prest.setString(3, user.getType());
			count=prest.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBcon.close(null, prest, con);
		return count;
	}

}