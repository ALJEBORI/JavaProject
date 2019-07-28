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
	InputStream input =this.getClass().getClassLoader().getResourceAsStream("db.properties");	
	Properties prop=new Properties();
	// New
	String driver;
	private Context() {
		try {
			try {
				prop.load(input);
				driver=prop.getProperty("db.password");
				Class.forName(driver);
				conn = DriverManager.getConnection(prop.getProperty("db.url")+prop.getProperty("db.databasename") + "?user=" +prop.getProperty("db.login")+"&password="+prop.getProperty("db.password")+"&serverTimezone=CET&useSSL=false");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
