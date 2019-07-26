package moh.dao;

import java.util.List;
import moh.model.Artist;

public interface ProductDao extends GenericDao<Artist, Integer>{
	List<Artist>findByName(String name);
}