package com.cn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBcon {
	public static Connection getCon() {
		Connection con=null;
		//import
		String diver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/company?useSSL=false";
		try {
			Class.forName(diver);
			con=(Connection) DriverManager.getConnection(url, "root", "1234");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return con;
}
	public static void close(ResultSet rs,PreparedStatement prest,Connection con) 
	{
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(prest!=null) {
			try {
				prest.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void Close(PreparedStatement prest, Connection con) {
		// TODO Auto-generated method stub
		
	}
}

