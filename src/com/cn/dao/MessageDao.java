package com.cn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cn.entity.Message;
import com.cn.util.DBcon;

public class MessageDao {
	public int addMessage(Message m) {
		Connection con =DBcon.getCon();
		
		String sql="insert into message(title,content,name,time,count) values (?,?,?,?,0)";
		PreparedStatement prest=null;//用于执行sql查询的接口
		int count =0;
		try {
			prest=con.prepareStatement(sql);
			prest.setString(1, m.getTitle());
			prest.setString(2, m.getContent());
			prest.setString(3, m.getName());
			prest.setString(4, m.getTime());
			count =prest.executeUpdate();//执行这条sql插入语句，插入到message表中
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return count;
}
	public Message getMessagebyId(int id){
		Message m=null;
		Connection con=DBcon.getCon();
		String sql="select * from message where mid=?";
		PreparedStatement prest=null;
		ResultSet rs=null;
		try {
			prest=con.prepareStatement(sql);
			prest.setInt(1,id);
			rs=prest.executeQuery();
			if(rs.next()) {
				int mid=rs.getInt(1);
				String title=rs.getString("title");
				String content=rs.getString("content");
				String name =rs.getString("name");
				String time =rs.getString("time");
				int count=rs.getInt("count");
				m=new Message(mid,title,content,name,time, count);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBcon.close(rs, prest, con);
		return m;
	}
	public ArrayList<Message> getAllMessage(){
		ArrayList<Message> list=new ArrayList<Message>();
		Connection con =DBcon.getCon();
		String sql="select * from message";
		    PreparedStatement prest=null;
			ResultSet rs=null;
			try {
				prest=con.prepareStatement(sql);
				rs=prest.executeQuery();
			    while(rs.next()) {
				
			    	int mid=rs.getInt(1);
					String title=rs.getString("title");
					String content=rs.getString("content");
					String name =rs.getString("name");
					String time =rs.getString("time");
					int count=rs.getInt("count");
					Message m=new Message(mid,title,content,name,time,count);
				list.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBcon.close(rs, prest, con);
		return list;
	}
	
	
	
	
}
	
