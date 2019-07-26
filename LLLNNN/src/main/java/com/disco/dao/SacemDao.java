package com.disco.dao;

import com.disco.model.Artist;
import com.disco.model.SacemRegistration;

public interface SacemDao extends GenericDao<SacemRegistration, String> {
	public SacemRegistration getByArtist(Artist artist);
}
