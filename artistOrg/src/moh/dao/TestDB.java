package moh.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import moh.model.Album;
import moh.model.Artist;
import moh.model.SacemReg;

public class TestDB {

	public static void main(String[] args) {
		List<Album>albumList=new ArrayList<Album>();
		List<Artist>artistList=new ArrayList<Artist>();
		Album myAlbum=new Album(15, "QQQQQ", 2019);
		SacemReg newSacem = new SacemReg("69874mmm159",new Date()); 
		albumList.add(myAlbum);
		Artist newArt =new Artist("MOHZAIN", "Moh", "Zain", newSacem, albumList);
		ProductDaoImpl firstArt=new ProductDaoImpl();
		//firstArt.insert(newArt);
		artistList=firstArt.findAll();
		for(Artist k:artistList)
			System.out.println(k);
	}
}
