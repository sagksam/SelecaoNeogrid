/**
 * 
 */
package br.com.selecaoneogrid.controller;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Paulo
 *
 */
public class TrackControllerTest {

	private TrackController trackController;
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
		
		trackController = new TrackController();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link br.com.selecaoneogrid.controller.TrackController#readInput()}.
	 */
	@Test
	public void testReadInput() {
		
		trackController.readInput();
	}
	
}
