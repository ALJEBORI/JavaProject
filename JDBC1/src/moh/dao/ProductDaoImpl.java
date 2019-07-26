package moh.dao;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import moh.model.Club;
import moh.model.Context;
import moh.model.Customer;

public class ProductDaoImpl implements ProductDao {
	
	@Override
	public List<Customer> findAll() {
		Connection conn;
		PreparedStatement stmt;
		ResultSet rs;
		List<Customer> myCustList = new ArrayList<Customer>();
		Customer custOne = null;
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("SELECT * FROM Customer ");
			rs = stmt.executeQuery();
            
			while (rs.next()) {
					custOne = new Customer(rs.getInt("ct_id"), rs.getString("firstName"), rs.getString("lastName"));
					myCustList.add(custOne);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return myCustList;
	}

	@Override
	public Customer findByKey(Integer id) {
		Connection conn;
		PreparedStatement stmt;
		ResultSet rs;
		Customer cust = null;
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("SELECT * FROM Customer where ct_id= ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if (rs.next()) {
				cust = new Customer(rs.getInt("ct_id"), rs.getString("firstName"), rs.getString("lastName"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return cust;
	}

	@Override
	public void insert(Customer obj) {
		Connection conn;
		PreparedStatement stmt;
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("INSERT INTO Customer (firstName,lastName) VALUES(?,?)");
			// stmt.setInt(1, xc.getId());
			stmt.setString(1, obj.getFirstName());
			stmt.setString(2, obj.getLastName());
			stmt.executeUpdate();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void update(Customer obj) {
		Connection conn;
		PreparedStatement stmt;
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("UPDATE Customer SET firstName=?,lastName=? where ct_id=?");
			stmt.setString(1, obj.getFirstName());
			stmt.setString(2, obj.getLastName());
			stmt.setInt(3, obj.getId());
			stmt.executeUpdate();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void deleteByKey(Integer key) {
		Connection conn;
		PreparedStatement stmt;
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("DELETE FROM customer WHERE ct_id=?");
			stmt.setInt(1, key);
			stmt.executeUpdate();
		} catch (Exception e) {

			e.printStackTrace();
		}


	}

	@Override
	public List<Customer> findByName(String name) {
		Connection conn;
		PreparedStatement stmt;
		ResultSet rs;
		List<Customer> myCustList = new ArrayList<Customer>();
		Customer custOne = null;
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("SELECT * FROM Customer where firstName like ? OR lastName like ? ");
			stmt.setString(1, name);
			stmt.setString(2, name);
			rs = stmt.executeQuery();
			while (rs.next()) {
					custOne = new Customer(rs.getInt("ct_id"), rs.getString("firstName"), rs.getString("lastName"));
					myCustList.add(custOne);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return myCustList;
	}


}
