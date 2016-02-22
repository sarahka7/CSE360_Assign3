/** jUnit tests for Calculator class
 * @author Sarah Kaufman (PIN 417)
 * @version Feb 18, 2016
 * 
 */
package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorClassTests {
	int total = 25; 
	String history = "0"; 

	@Test
	public void testCalculator() {
		Calculator test = new Calculator(); 
		assertNotNull(test);
	}

	@Test
	public void getTotalTest() {
		//Calculator test = new Calculator();
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
		int total = test.divide(0);
		assertEquals(0, total);
	}
	
	@Test
	public void getHistoryTest() {
		Calculator test = new Calculator();
		test.add(7); 
		test.subtract(2);
		test.divide(4);
		test.multiply(2);
		String history = test.getHistory(); 
		assertEquals("0 + 7 - 2 / 4 * 2", history);
	}
	
}
