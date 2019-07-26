package com.disco.dao;

import java.util.List;

import com.disco.model.Album;
import com.disco.model.Artist;

public interface AlbumDao extends GenericDao<Album, Long> {
	public List<Album> findAllByArtist(Artist a);
	public void deleteByArtiste(Artist a);
}
