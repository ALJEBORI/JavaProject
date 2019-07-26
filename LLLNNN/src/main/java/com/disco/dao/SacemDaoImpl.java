package com.disco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.disco.dao.utils.Closer;
import com.disco.dao.utils.Context;
import com.disco.model.Artist;
import com.disco.model.SacemRegistration;

public class SacemDaoImpl implements SacemDao {
	private final String tableName = "sacemregistration";
	private final String idColumnName = "reference";
	
	@Override
	public List<SacemRegistration> findAll() {
		Connection conn;
		Statement stmt = null;
		ResultSet rs = null;
		List<SacemRegistration> registrations = new ArrayList<>();
		 try {
			conn = Context.getInstance().getConn();
		    stmt = conn.createStatement();
		    rs = stmt.executeQuery("SELECT * FROM " + tableName);
		    
		    while(rs.next()) {
		    	SacemRegistration p = new SacemRegistration(rs.getString(idColumnName), rs.getDate("date"));
		    	registrations.add(p);		
		    }

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Closer.closeResultSet(rs);
			Closer.closeStatement(stmt);
		}
		return registrations;
	}

	@Override
	public SacemRegistration findByKey(String id) {
		Connection conn;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		SacemRegistration p = null;
		
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("SELECT * FROM " + tableName + " where " + idColumnName + " LIKE ? ");
			stmt.setString(1, id);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				p = new SacemRegistration(rs.getString(this.idColumnName), rs.getDate("date"));				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Closer.closeResultSet(rs);
			Closer.closeStatement(stmt);
		}
		return p;
	}

	@Override
	public void insert(SacemRegistration registration) {
		Connection conn;
		PreparedStatement stmt = null;
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("INSERT INTO " + tableName + " (reference, date) VALUES (?, ?) ");
			stmt.setString(1, registration.getReference());
			stmt.setDate(2, new java.sql.Date(registration.getDate().getTime()));
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Closer.closeStatement(stmt);
		}		
	}

	@Override
	public void update(SacemRegistration registration) {
		Connection conn;
		PreparedStatement stmt = null;

		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("UPDATE " + tableName + " set " + idColumnName + " = ? WHERE " + idColumnName + " = ? ");
			stmt.setString(1, registration.getReference());
			stmt.setDate(2, new java.sql.Date(registration.getDate().getTime()));
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Closer.closeStatement(stmt);
		}
		
	}

	@Override
	public void deleteByKey(String id) {
		Connection conn;
		PreparedStatement stmt = null;
		
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("DELETE FROM " + tableName + " where " + idColumnName + "= ?");
			stmt.setString(1, id);
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Closer.closeStatement(stmt);
		}		
	}

	
	//select * from artist left join sacem on artist.sacem_id = sacem.reference where artist.bandName like 'Lamb of god'
	@Override
	public SacemRegistration getByArtist(Artist artist) {
		Connection conn;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		SacemRegistration p = null;
		
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("SELECT * FROM " + tableName + " LEFT JOIN artist ON artist.sacem_id = sacem.reference WHERE artist.bandName LIKE ? ");
			stmt.setString(1, artist.getBandName());
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				p = new SacemRegistration(rs.getString(this.idColumnName), rs.getDate("date"));				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Closer.closeResultSet(rs);
			Closer.closeStatement(stmt);
		}
		return p;
	}

}
