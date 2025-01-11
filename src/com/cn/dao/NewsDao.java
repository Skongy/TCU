package com.cn.dao;

import java.sql.*;
import java.util.ArrayList;

import com.cn.entity.News;
import com.cn.util.DBcon;

public class NewsDao {
	public ArrayList<News> getAllNews(){
		ArrayList<News> list=new ArrayList<News>();
		Connection con =DBcon.getCon();//获取数据库练级
		String sql="select * from news";//从news表中查询所有的记录
		    PreparedStatement prest=null;
			ResultSet rs=null;//存储查询结果
			try {
				prest=con.prepareStatement(sql);
				rs=prest.executeQuery();
			    while(rs.next()) {
				
				int id=rs.getInt(1);
				String title=rs.getString(2);//获取当前记录的第二个字段的值
				String content=rs.getString(3);
				String time =rs.getString(4);
				News news=new News(id,title,content,time);
				list.add(news);
			}
		} catch (SQLException e) {
			e.printStackTrace();//打印异常信息
		}

		DBcon.close(rs, prest, con);//关闭数据库资源
		return list;
}
	public News getNewsbyId(int id){
		News news=null;
		Connection con=DBcon.getCon();//获取数据库连接
		String sql="select * from news where id=?";//查询id相等的新闻记录
		PreparedStatement prest=null;
		ResultSet rs=null;
		try {
			prest=con.prepareStatement(sql);
			prest.setInt(1,id);
			rs=prest.executeQuery();
			if(rs.next()) {
				int ids=rs.getInt(1);
				String title=rs.getString("title");
				String content=rs.getString("content");
				String time =rs.getString("time");
				news=new News(ids,title,content,time);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBcon.close(rs, prest, con);
		return news;
	}
	public int addNews(News news) {
		int count=0;
		Connection con=DBcon.getCon();
		String sql="insert into news(title,content,time) value(?,?,?)";//向news表中插入数据
		PreparedStatement prest=null;
		try {
			prest = con.prepareStatement(sql);
			prest.setString(1,news.getTitle());
			prest.setString(2,news.getContent());
			prest.setString(3,news.getTime());
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
		Connection con=DBcon.getCon();//建立与数据库的连接
		String sql="delete from news where id=?";//查询id相等的新闻记录
		PreparedStatement prest=null;
		try {
			prest = con.prepareStatement(sql);
			prest.setInt(1, id);
			count=prest.executeUpdate();//返回受影响的行数
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBcon.close(null, prest, con);
		return count;
	}


}
