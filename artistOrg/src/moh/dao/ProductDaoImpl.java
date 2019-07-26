package moh.dao;

//import java.math.BigInteger;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import moh.model.Context;
import moh.model.SacemReg;
import moh.model.Album;
import moh.model.Artist;
import moh.model.Artist;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Artist> findAll() {
		Connection conn;
		PreparedStatement stmt;
		ResultSet rs;
		List<Artist> myArtistList = new ArrayList<Artist>();
		List<Album>albumList=new ArrayList<Album>();
		Artist artOne = null;
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("SELECT artist.* ,album.* ,sacemregistration.* FROM artist inner join album on album.bandName = artist.bandName inner join sacemregistration on sacemregistration.reference=artist.reference ");
			rs = stmt.executeQuery();
            rs.beforeFirst();
			while (rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("title"));
				System.out.println(rs.getInt("releaseYear"));
				Album nalbum=new Album(rs.getInt("id"), rs.getString("title"), rs.getInt("releaseYear"));
				albumList.add(nalbum);				
				SacemReg mySac=new SacemReg(rs.getString("reference"),rs.getDate("date"));
				artOne = new Artist(rs.getString("bandName"), rs.getString("firstName"), rs.getString("lastName"), mySac, albumList);
				myArtistList.add(artOne);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return myArtistList;
	}

	@Override
	public Artist findByKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Artist obj) {
		Connection conn;
		PreparedStatement stmt;
		try {
			conn = Context.getInstance().getConn();
			stmt = conn.prepareStatement("INSERT INTO sacemregistration (reference,date) VALUES(?,?)");
			stmt.setString(1, obj.getArtistSacem().getReference());
			// stmt.setDate(2,new Date().getDate());
			stmt.setDate(2, new java.sql.Date(obj.getArtistSacem().getDate().getTime()));
			stmt.executeUpdate();
			stmt = conn.prepareStatement("INSERT INTO Artist (bandName,firstName,lastName,reference) VALUES(?,?,?,?)");
			stmt.setString(1, obj.getBandName());
			stmt.setString(2, obj.getFirstName());
			stmt.setString(3, obj.getLastName());
			stmt.setString(4, obj.getArtistSacem().getReference());
			stmt.executeUpdate();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void update(Artist obj) {

	}

	@Override
	public void deleteByKey(Integer key) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Artist> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
