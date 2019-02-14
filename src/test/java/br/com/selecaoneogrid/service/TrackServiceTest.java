/**
 * 
 */
package br.com.selecaoneogrid.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Paulo
 *
 */
public class TrackServiceTest {

	private TrackService trackService;
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
		
		trackService = new TrackService();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link br.com.selecaoneogrid.service.TrackService#getTrackOne()}.
	 */
	@Test
	public void testGetTrackOne() {
		assertEquals(trackService.getTrackOne().getDescription(), "Track 1:");
		assertEquals(trackService.getTrackOne().getTasks().size(), 11);
	}

	/**
	 * Test method for {@link br.com.selecaoneogrid.service.TrackService#getTrackTwo()}.
	 */
	@Test
	public void testGetTrackTwo() {
		assertEquals(trackService.getTrackTwo().getDescription(), "Track 2:");
		assertEquals(trackService.getTrackTwo().getTasks().size(), 12);
	}

}
