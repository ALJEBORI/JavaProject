package com.disco.dao.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.disco.Entry;

public class Context {
	private static Context instance =  null;
	private Connection conn = null;
	Properties prop=new Properties();
	InputStream input =this.getClass().getClassLoader().getResourceAsStream("db.properties");	
	private Context() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/artistorg" + "?user=MJebori&password=mohsql69&serverTimezone=CET&useSSL=false");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Context getInstance() {
		if(instance == null) {
			instance = new Context();
		}
		return instance;
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
}
