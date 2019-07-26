package com.disco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.disco.dao.utils.Closer;
import com.disco.dao.utils.Context;
import com.disco.model.Album;
import com.disco.model.Artist;

public class AlbumDaoImpl implements AlbumDao {
	private final String tableName = "album";
	private final String idColumnName = "id";
	
	@Override
	public List<Album> findAll() {
		Connection conn;
		Statement stmt = null;
		ResultSet rs = null;
		List<Album> albums = new ArrayList<>();
		 try {
			conn = Context.getInstance().getConn();
		    stmt = conn.createStatement();
		    rs = stmt.executeQuery("SELECT * FROM " + tableName);
		    
		    while(rs.next()) {
		    	Album p = new Album(rs.getLong(idColumnName), rs.getString("title"), rs.getInt("releaseYear"));
		    	albums.add(p);		
		    }

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Closer.closeResultSet(rs);
			Closer.closeStatement(stmt);
		}
		return albums;
	}

	@Override
	public Album findByKey(Long id) {
		Connection conn;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Album p = null;
		
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("SELECT * FROM " + tableName + " where " + idColumnName + " LIKE ? ");
			stmt.setLong(1, id);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				p = new Album(rs.getLong(idColumnName), rs.getString("title"), rs.getInt("releaseYear"));				
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
	public void insert(Album album) {
		Connection conn;
		PreparedStatement stmt = null;
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("INSERT INTO " + tableName + " (title, releaseYear, artist_id) VALUES (?, ?, ?) ");
			stmt.setString(1, album.getTitle());
			stmt.setInt(2, album.getReleaseYear());
			stmt.setString(3, album.getArtist() == null ? null : album.getArtist().getBandName());
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Closer.closeStatement(stmt);
		}		
	}

	@Override
	public void update(Album album) {
		Connection conn;
		PreparedStatement stmt = null;

		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("UPDATE " + tableName + " set title = ?, releaseYear = ?, artist_id = ? WHERE " + idColumnName + " = ? ");
			stmt.setString(1, album.getTitle());
			stmt.setInt(2, album.getReleaseYear());
			stmt.setString(3, album.getArtist() == null ? null : album.getArtist().getBandName());
			stmt.setLong(4, album.getId());
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Closer.closeStatement(stmt);
		}
		
	}

	@Override
	public void deleteByKey(Long id) {
		Connection conn;
		PreparedStatement stmt = null;
		
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("DELETE FROM " + tableName + " where " + idColumnName + "= ?");
			stmt.setLong(1, id);
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Closer.closeStatement(stmt);
		}		
	}

	@Override
	public List<Album> findAllByArtist(Artist a) {
		Connection conn;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Album> albums = new ArrayList<>();
		 try {
			conn = Context.getInstance().getConn();
		    stmt = conn.prepareStatement("SELECT * FROM " + tableName + " WHERE artist_id LIKE ?");
		    stmt.setString(1, a.getBandName());
		    rs = stmt.executeQuery();
		    
		    while(rs.next()) {
		    	Album p = new Album(rs.getLong(idColumnName), rs.getString("title"), rs.getInt("releaseYear"));
		    	albums.add(p);		
		    }

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Closer.closeResultSet(rs);
			Closer.closeStatement(stmt);
		}
		return albums;
	}

	@Override
	public void deleteByArtiste(Artist a) {
		Connection conn;
		PreparedStatement stmt = null;
		
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("DELETE FROM " + tableName + " where artist_id = ?");
			stmt.setString(1, a.getBandName());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Closer.closeStatement(stmt);
		}		
	}

}
