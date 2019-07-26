package moh.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Context {
    private static Context instance =  null;
    private Connection conn = null;
    
    private Context() {
        try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/artistorg" + "?user=MJebori&password=mohsql69&serverTimezone=CET&useSSL=false");
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


