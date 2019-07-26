package com.disco;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import com.disco.dao.AlbumDao;
import com.disco.dao.AlbumDaoImpl;
import com.disco.dao.ArtistDao;
import com.disco.dao.ArtistDaoImpl;
import com.disco.dao.SacemDao;
import com.disco.dao.SacemDaoImpl;
import com.disco.model.Album;
import com.disco.model.Artist;
import com.disco.model.SacemRegistration;

public class Entry {
	
	
	private static Scanner sc = new Scanner(System.in);
	private static SacemDao sacemDao = new SacemDaoImpl();
	private static ArtistDao artistDao = new ArtistDaoImpl();
	private static AlbumDao albumDao = new AlbumDaoImpl();
	
	public static void main(String[] args) throws IOException {
		displayHello();
		boolean exit = false;
		Properties prop=new Properties();
		Entry entry=new Entry();
		InputStream input =entry.getClass().getClassLoader().getResourceAsStream("db.properties");
		prop.load(input);
		System.out.println(prop.getProperty("db.driver"));
		
		do {
			String choice = displayMainMenuAndGetChoice();
			clearScreen(false);
			switch (choice) {
			case "lr":
				listArtist();
				break;
			case "ll":			
				listAlbums();
				break;
			case "cr":
				createArtist();
				break;
			case "s":
				selectAndEnterArtist();
				break;		
			case "del":
				deleteArtist();
				break;		

			case "exit":
				exit = true;
				break;
	
			default:
				break;
			}
		}while(!exit);
		System.out.println("**************************************************");
		System.out.println("      For those about to rock, we salute you!     ");
		System.out.println("**************************************************");
		
		
	}
	private static void selectAndEnterArtist() {
		System.out.print("Band Name to edit>");
		String bandName = sc.nextLine();
		Artist a = artistDao.findByKey(bandName);
		if(a != null) {
			showAlbumLoop(a);
		}else {					
			System.out.println("Unknow input... try harder");
		}
	}
	private static void showAlbumLoop(Artist a) {
		boolean exitalbum = false;
		
		do {
			String choiceAlbum = displayArtistMenuAndGetChoice(a);
			clearScreen(false);
			switch (choiceAlbum) {
			case "s":
				System.out.println("EDIT TO DO");
				break;
			case "cr":
				createAlbum(a);
				break;
			case "ll":			
				listAlbums(a);
				break;
			case "del":
				deleteAlbum();
	
			case "exit":
				exitalbum = true;
				break;
	
			default:
				break;
			}
		}while(!exitalbum);

	}
	
	private static void deleteAlbum() {
		System.out.print("Album ID to delete>");
		Long id = sc.nextLong();
		albumDao.deleteByKey(id);
		System.out.println("Done");		
	}
	private static void createAlbum(Artist a) {
		System.out.print("Title>");
		String title = sc.nextLine();
		System.out.print("Release Year>");
		int releaseYear = sc.nextInt();
		
		Album album = new Album(title, releaseYear, a);
		albumDao.insert(album);
		System.out.print("Album ADD: OK");		
	}
	private static void listArtist() {
		System.out.println("List Artist");
		for(Artist a : artistDao.findAll()) {
			System.out.println(a.getBandName()+":"+a.getFirstName()+" "+a.getLastName());
		}

		clearScreen(true);
	}
	private static void listAlbums() {
		System.out.println("List Albums");
		for(Album a : albumDao.findAll()) {
			System.out.println(a.getId() + ":" + a.getTitle()+":"+a.getReleaseYear());
		}

		clearScreen(true);
	}
	private static void listAlbums(Artist artist) {
		System.out.println("List Albums");
		for(Album a : albumDao.findAllByArtist(artist)) {
			System.out.println(a.getTitle()+":"+a.getReleaseYear());
		}
		clearScreen(true);
		
	}
	
	private static void deleteArtist() throws IOException {
		System.out.print("Band Name to delete>");
		String bandName = sc.nextLine();
		Artist artist = artistDao.findByKey(bandName);
		if(artist == null) {
			System.out.println("Artiste inconnu");
			clearScreen(true);
			return;
		}
		albumDao.deleteByArtiste(artist);
		SacemRegistration sacemReg = sacemDao.getByArtist(artist);
		artistDao.deleteByKey(bandName);
		sacemDao.deleteByKey(sacemReg.getReference());
		clearScreen(true);

	}
	
	private static void createArtist() throws IOException {
		System.out.print("Band Name>");
		String bandName = sc.nextLine();
		System.out.print("First Name>");
		String firstName = sc.nextLine();
		System.out.print("Last Name>");
		String lastName = sc.nextLine();
		System.out.print("Registration Number>");
		String registrationNumber = sc.nextLine();
		
		SacemRegistration sacemReg = new SacemRegistration(registrationNumber);
		sacemDao.insert(sacemReg);
		Artist artist = new Artist(bandName, firstName, lastName);
		artist.setSacemRegistration(sacemReg);
		artistDao.insert(artist);
		clearScreen(true);

	}
	
	private static String displayMainMenuAndGetChoice() {
		System.out.println("> Make a choice");
		System.out.println("*************");
		System.out.println("(lr) 	List all artists");
		System.out.println("(ll) 	List all albums");
		System.out.println("(cr) 	Create an artist");
		System.out.println("(s)  	Select and artist and go to album managment");
		System.out.println("(del) 	Delete an artist");
		System.out.println("(exit) 	exit");

		System.out.print("Your choice ? >");
		return sc.nextLine();
		
	}
	private static String displayArtistMenuAndGetChoice(Artist artist) {
		System.out.println("> What do you want to to for artist :"+artist.getBandName());
		System.out.println("***************************");
		System.out.println("(s)  	Edit informations");
		System.out.println("(cr)  	create an album");
		System.out.println("(ll) 	List all albums for this artist");
		System.out.println("(s)  	Delete an album");
		System.out.println("(s)  	Edit an album");
		System.out.println("(exit) 	exit to main menu");
		
		System.out.print("Your choice ? >");
		return sc.nextLine();
	}
	
	private static void displayHello() {
		System.out.println("**********************************");
		System.out.println("*           Welcome to           *");
		System.out.println("*        SuperDiscographie       *");
		System.out.println("**********************************");
		System.out.println("");
		System.out.println("");
	}
	private static void test() {
		
		Random rand = new Random();

		// TEST SACEM
		SacemDao sacemDao = new SacemDaoImpl();
		SacemRegistration sacemreg = new SacemRegistration(""+rand.nextInt(500000));
		sacemDao.insert(sacemreg);
		
		List<SacemRegistration> listSacem = sacemDao.findAll();
		System.out.println(listSacem.size());
		
		SacemRegistration sacemRegistration = listSacem.get(0);
		sacemRegistration.setReference("AAA");
		
		sacemDao.update(sacemRegistration);
		listSacem = sacemDao.findAll();
		System.out.println(sacemDao.findAll().get(0));
		System.out.println(listSacem.size());
		
		sacemDao.deleteByKey(listSacem.get(listSacem.size()-1).getReference());
		listSacem = sacemDao.findAll();
		System.out.println(listSacem.size());
		sacemreg = new SacemRegistration(""+rand.nextInt(500000));
		sacemDao.insert(sacemreg);
		listSacem = sacemDao.findAll();
		System.out.println(sacemDao.findByKey(listSacem.get(0).getReference()));
		
		// TEST ARTIST
		ArtistDao artistDao = new ArtistDaoImpl();
		Artist artistreg = new Artist(""+rand.nextInt(500000),"jean","mouloud");
		artistreg.setSacemRegistration(listSacem.get(listSacem.size() - 1));
		artistDao.insert(artistreg);
		
		List<Artist> listArtist = artistDao.findAll();
		System.out.println(listArtist.size());
		System.out.println(listArtist.get(0));
		Artist artist = listArtist.get(0);
		artist.setFirstName("Michel");
		
		artistDao.update(artist);
		listArtist = artistDao.findAll();
		System.out.println(artistDao.findAll().get(0));
		System.out.println(listArtist.size());
		
		artistDao.deleteByKey(listArtist.get(listArtist.size()-1).getBandName());
		listArtist = artistDao.findAll();
		System.out.println(listArtist.size());
		artistreg = new Artist("ABC"+""+rand.nextInt(500000),"jean","mouloud");
		artistreg.setSacemRegistration(listSacem.get(0));
		artistDao.insert(artistreg);
		listArtist = artistDao.findAll();
		System.out.println(artistDao.findByKey(listArtist.get(0).getBandName()));
		
		// TEST ALBUM
		AlbumDao albumDao = new AlbumDaoImpl();
		Album albumreg = new Album("Reign in blood",2019, listArtist.get(0));
		albumreg.setArtist(listArtist.get(0));
		albumDao.insert(albumreg);
		
		List<Album> listAlbum = albumDao.findAll();
		System.out.println(listAlbum.size());
		System.out.println(listAlbum.get(0));
		Album album = listAlbum.get(0);
		album.setTitle("The link");
		
		albumDao.update(album);
		listAlbum = albumDao.findAll();
		System.out.println(albumDao.findAll().get(0));
		System.out.println(listAlbum.size());
		
		albumDao.deleteByKey(listAlbum.get(listAlbum.size()-1).getId());
		listAlbum = albumDao.findAll();
		System.out.println(listAlbum.size());
		albumreg = new Album("Rust in peace",1946, listArtist.get(0));
		albumreg.setArtist(listArtist.get(0));
		albumDao.insert(albumreg);
		listAlbum = albumDao.findAll();
		System.out.println(albumDao.findByKey(listAlbum.get(0).getId()));
 }
	public static void clearScreen(boolean askForKey) {  
		if(askForKey) {
			System.out.println("Press enter to continue");
			try {
				System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}  
}
