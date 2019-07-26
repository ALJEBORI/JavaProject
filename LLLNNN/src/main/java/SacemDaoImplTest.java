import static org.junit.Assert.*;

import org.junit.Test;

import com.disco.dao.SacemDao;
import com.disco.dao.SacemDaoImpl;
import com.disco.model.SacemRegistration;

public class SacemDaoImplTest {
SacemDao sacemDao =new SacemDaoImpl();
	@Test
	public void testFindAll() {
		SacemRegistration sr=new SacemRegistration("11111111");
		sacemDao.insert(sr);
	}

	@Test
	public void testFindByKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetByArtist() {
		fail("Not yet implemented");
	}

}
