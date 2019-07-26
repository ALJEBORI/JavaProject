package moh.dao;

import java.util.List;
import moh.model.Club;
import moh.model.Customer;

public interface ProductDao extends GenericDao<Customer, Integer>{
	List<Customer>findByName(String name);
}
