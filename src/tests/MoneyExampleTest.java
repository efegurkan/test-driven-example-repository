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
		assertEquals(10,product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}
	
	@Test
	public void testEqualty(){
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
	

}
