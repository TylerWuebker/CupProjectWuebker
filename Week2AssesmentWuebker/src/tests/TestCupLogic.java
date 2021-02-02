package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Cup;
import model.CupLogic;

public class TestCupLogic {
	
	CupLogic CupLog = new CupLogic();
	Cup Cup20Oz = new Cup("Black");
	
	@Before
	public void setUp() throws Exception {
		Cup20Oz.setSizeOZ(20);
	}

	@Test
	public void testFill() {
		Cup20Oz.setHowFull(0);
		int fillAmt = CupLog.fill(Cup20Oz, 10);
		assertEquals(10, fillAmt);
	}
	
	@Test
	public void testEmpty() {
		Cup20Oz.setHowFull(10);
		int emptyAmt = CupLog.empty(Cup20Oz, 5);
		assertEquals(5, emptyAmt);
	}
	
	@Test
	public void testIsFull() {
		Cup20Oz.setHowFull(20);
		boolean isFull = CupLog.isFull(Cup20Oz);
		assertTrue(isFull);
	}
	
	@Test
	public void testIsNotFull() {
		Cup20Oz.setHowFull(10);
		boolean isNotFull = CupLog.isFull(Cup20Oz);
		assertFalse(isNotFull);
	}
	

}
