package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import sources.Dollar;

public class MoneyExampleTest {

	@Test
	public void test() {
	}
	
	@Test
	public void testMultiplication(){
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(new Dollar(10),product);
		product = five.times(3);
		assertEquals(new Dollar(15), product);
	}
	
	@Test
	public void testEqualty(){
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
	

}
