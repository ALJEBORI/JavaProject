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

public class ArtistDaoImpl implements ArtistDao {
	private final String tableName = "artist";
	private final String idColumnName = "bandname";
	
	@Override
	public List<Artist> findAll() {
		Connection conn;
		Statement stmt = null;
		ResultSet rs = null;
		List<Artist> artists = new ArrayList<>();
		 try {
			conn = Context.getInstance().getConn();
		    stmt = conn.createStatement();
		    rs = stmt.executeQuery("SELECT * FROM " + tableName);
		    
		    while(rs.next()) {
		    	Artist p = new Artist(rs.getString(idColumnName), rs.getString("firstName"), rs.getString("lastName"));
		    	artists.add(p);		
		    }

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Closer.closeResultSet(rs);
			Closer.closeStatement(stmt);
		}
		return artists;
	}

	@Override
	public Artist findByKey(String id) {
		Connection conn;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Artist p = null;
		
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("SELECT * FROM " + tableName + " where " + idColumnName + " LIKE ? ");
			stmt.setString(1, id);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				p = new Artist(rs.getString(idColumnName), rs.getString("firstName"), rs.getString("lastName"));				
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
	public void insert(Artist artist) {
		Connection conn;
		PreparedStatement stmt = null;
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("INSERT INTO " + tableName + " (bandName, firstName, lastName, sacem_id) VALUES (?, ?, ?, ?) ");
			stmt.setString(1, artist.getBandName());
			stmt.setString(2, artist.getFirstName());
			stmt.setString(3, artist.getLastName());
			stmt.setString(4, artist.getSacemRegistration() == null ? null : artist.getSacemRegistration().getReference());
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Closer.closeStatement(stmt);
		}		
	}

	@Override
	public void update(Artist artist) {
		Connection conn;
		PreparedStatement stmt = null;

		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("UPDATE " + tableName + " set " + idColumnName + " = ?, firstName = ?, lastName = ?, sacem_id = ? WHERE " + idColumnName + " = ? ");
			stmt.setString(1, artist.getBandName());
			stmt.setString(2, artist.getFirstName());
			stmt.setString(3, artist.getLastName());
			stmt.setString(4, artist.getSacemRegistration() == null ? null : artist.getSacemRegistration().getReference());
			stmt.setString(5, artist.getBandName());
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

}
