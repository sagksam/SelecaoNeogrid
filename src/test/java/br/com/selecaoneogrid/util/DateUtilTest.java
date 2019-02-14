/**
 * 
 */
package br.com.selecaoneogrid.util;

import static org.junit.Assert.*;

import org.joda.time.LocalDateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Paulo
 *
 */
public class DateUtilTest {
     
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link br.com.selecaoneogrid.util.DateUtil#dateToString(org.joda.time.LocalDateTime)}.
	 */
	@Test
	public void testDateToString() {
		
		LocalDateTime localDateTime = new LocalDateTime(2019, 2, 13, 9, 0);
		assertEquals(DateUtil.dateToString(localDateTime), "09:00AM");
	}

}
