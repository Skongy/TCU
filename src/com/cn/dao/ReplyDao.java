package com.cn.dao;

import java.sql.*;
import java.util.ArrayList;

import com.cn.entity.Product;
import com.cn.entity.Reply;
import com.cn.util.DBcon;

public class ReplyDao {
	public int addReply(Reply r) {
	int count=0;
	Connection con=DBcon.getCon();
	String sql="insert into reply(name,content,time,mid) values(?,?,?,?)";
	PreparedStatement prest=null;
	        try {
				prest = con.prepareStatement(sql);
				prest.setString(1, r.getName());
				prest.setString(2, r.getContent());
				prest.setString(3, r.getTime( ));
				prest.setInt(4, r.getMid( ));
				 count=prest.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	DBcon.Close(prest, con);
	return count;
	}
	public ArrayList<Reply> getAllReplyById(int mid){
		ArrayList<Reply> list=new ArrayList<Reply>();
		Connection con =DBcon.getCon();
		String sql="select * from reply where mid=?";
			PreparedStatement prest=null;
			ResultSet rs=null;
			try {
				prest=con.prepareStatement(sql);
				prest.setInt(1,mid);
				rs=prest.executeQuery();
			while(rs.next()) {
				
				int rid=rs.getInt(1);
				String name=rs.getString("name");
				String content=rs.getString("content");
				String time =rs.getString("time");
				Reply r =new Reply(rid, name, content ,time,mid);
				list.add(r);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBcon.close(rs, prest, con);
		return list;
}
	
	

	
	
	
	
}
