package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorClassTests {
		int total = 25; 


	@Test
	public void getTotalTest() {
		Calculator test = new Calculator();
		assertEquals(25, total);
	}
	
	@Test
	public void AddTest() {
		Calculator test = new Calculator();
		int total = test.add(5);
		assertEquals(30, total);
	
	}
	
	@Test
	public void SubtractTest() {
		Calculator test = new Calculator();
		int total = test.subtract(5);
		assertEquals(20, total);
	}
	
	@Test
	public void MultiplyTest() {
		Calculator test = new Calculator();
		int total = test.multiply(4);
		assertEquals(100, total);
	}
	
	@Test
	public void DivideTest() {
		Calculator test = new Calculator();
		int total = test.divide(5);
		assertEquals(5, total);
	}
	
	@Test
	public void getHistoryTest() {
		Calculator test = new Calculator();
		String string = test.getHistory();
		assertEquals("", "");
	}
	
	
}
