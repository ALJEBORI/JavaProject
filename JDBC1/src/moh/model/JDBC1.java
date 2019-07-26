package moh.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;;

public class JDBC1 {

	public static void main(String[] args) {
		int myid;
		String myname;
		Connection conn;
		Statement stmt;
		ResultSet rs;
		Club myclub = new Club(8, "XXXXXXX");

		System.out.println("findOne");
		/*
		 * for (int i = 1; i < 9; i++) { findOne(i);
		 * System.out.println("+++++++++++++++++++++++++\n"); }
		 */
		// insert(myclub);
		// update(myclub);
		Club xx = findOne(5);
	


	/*			System.out.println("cl_id             cl_nom \n");
				System.out.println("============================\n");
				System.out.println(rs.getInt("cl_id") + ":" + rs.getString("cl_nom") + "\n"); */
			}

	public static Club findOne(int id) {
		Connection conn;
		PreparedStatement stmt;
		ResultSet rs;
		Club clp = null;
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("SELECT * FROM club where cl_id= ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			/*
			 * while (rs.next()) { System.out.println("cl_id             cl_nom \n");
			 * System.out.println("============================\n");
			 * System.out.println(rs.getInt("cl_id") + ":" + rs.getString("cl_nom") + "\n");
			 * }
			 */
			if (rs.next()) {
				
				clp=new Club(rs.getInt("cl_id"), rs.getString("cl_nom"));

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return clp;
	}

	public static void findByName(int id) {
		Connection conn;
		PreparedStatement stmt;
		ResultSet rs;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/club" + "?user=MJebori&password=mohsql69&serverTimezone=CET&useSSL=false");
			stmt = conn.prepareStatement("SELECT * FROM club where cl_nom= ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("cl_id             cl_nom \n");
				System.out.println("============================\n");
				System.out.println(rs.getInt("cl_id") + ":" + rs.getString("cl_nom") + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void delete(int id) {
		Connection conn;
		PreparedStatement stmt;
		ResultSet rs;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/club" + "?user=MJebori&password=mohsql69&serverTimezone=CET&useSSL=false");
			stmt = conn.prepareStatement("DELETE * FROM club where cl_id= ?");
			stmt.setInt(1, id);
			stmt.executeUpdate();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void insert(Club xc) {
		Connection conn;
		PreparedStatement stmt;
		ResultSet rs;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/club" + "?user=MJebori&password=mohsql69&serverTimezone=CET&useSSL=false");
			stmt = conn.prepareStatement("INSERT INTO club (cl_nom,cl_ville) VALUES(?,'Paris')");
			// stmt.setInt(1, xc.getId());
			stmt.setString(1, xc.getName());
			stmt.executeUpdate();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void update(Club xc) {
		Connection conn;
		PreparedStatement stmt;
		ResultSet rs;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/club" + "?user=MJebori&password=mohsql69&serverTimezone=CET&useSSL=false");
			stmt = conn
					.prepareStatement("UPDATE club SET cl_nom='ZZZZZZZZ',cl_ville='LYON', cl_dp_dept=69 where cl_id=?");
			stmt.setInt(1, xc.getId());
			stmt.setString(1, xc.getName());
			stmt.executeUpdate();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}