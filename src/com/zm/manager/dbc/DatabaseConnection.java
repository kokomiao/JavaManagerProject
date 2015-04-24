package com.zm.manager.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DatabaseConnection {
	private Properties pro =null;
	private Connection conn =null;
	
	public DatabaseConnection(Properties pro){
		this.pro = pro;
		//数据库连接操作
		try {
			Class.forName(pro.getProperty("dbdriver")); //通过属性文件找到驱动
			this.conn = DriverManager.getConnection(this.pro.getProperty("dburl"), 
					this.pro.getProperty("dbuser"), this.pro.getProperty("dbpass"));
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		return this.conn;
	}
	public void close(){
		try {
			this.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
