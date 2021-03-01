/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.ReusablePool;
import ubu.gii.dass.c01.Reusable;
import ubu.gii.dass.c01.DuplicatedInstanceException;
import ubu.gii.dass.c01.NotFreeInstanceException;

/**
 * @author alumno
 *
 */
public class ReusablePoolTest {

	private ReusablePool pool;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		pool = ReusablePool.getInstance();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		pool = null;
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		ReusablePool pool = ReusablePool.getInstance();
		//Comprobamos que no es nulo
		assertNotNull(pool);
		//El objeto devuelto es una instancia de ReusablePool
		assertTrue(pool instanceof ReusablePool);
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		Reusable r1, r2, r3 = null;
		try {
			//Tanto r1 como r2 deben ser objetos Reusable
			r1 = pool.acquireReusable();
			assertNotNull(r1);
			assertTrue(r1 instanceof Reusable);
			r2 = pool.acquireReusable();
			assertNotNull(r2);
			assertTrue(r2 instanceof Reusable);
			//Comprobamos que no son el mismo objeto reusable
			assertFalse(r1.util().equals(r2.util()));
			r3 = pool.acquireReusable();
		} catch (NotFreeInstanceException e) {
			assertNull(r3);
		}
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 */
	@Test
	public void testReleaseReusable() {
		fail("Not yet implemented");
	}

}
