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
		five.times(2);
		assertEquals(10,five.amount);
		five.times(3);
		assertEquals(15, five.amount);
	}
	

}
