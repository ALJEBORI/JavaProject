package com.disco.dao;

import java.util.List;

import com.disco.model.Artist;
import com.disco.model.SacemRegistration;

public interface SacemDao extends GenericDao<SacemRegistration, String> {
	public SacemRegistration getByArtist(Artist artist);
}
