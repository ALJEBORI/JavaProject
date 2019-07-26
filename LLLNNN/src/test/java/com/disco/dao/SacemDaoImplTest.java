package com.disco.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.disco.model.SacemRegistration;

import junit.framework.Assert;

class SacemDaoImplTest {
	SacemDao sacemDao = new SacemDaoImpl();

	@Test
	void testFindAll() {
		SacemRegistration sr=new SacemRegistration("111111");
		sacemDao.insert(sr);
		Assert.assertTrue(!sacemDao.findAll().isEmpty());
	}

	@Test
	void testFindByKey() {
		fail("Not yet implemented");
	}

	@Test
	void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteByKey() {
		fail("Not yet implemented");
	}

	@Test
	void testGetByArtist() {
		fail("Not yet implemented");
	}

}
