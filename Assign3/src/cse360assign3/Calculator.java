
package cse360assign3;


/** Calculator class to practice jUnit and Github with
 * @author Sarah Kaufman (PIN 417)
 * @version Feb 18, 2016
 * 
 */
public class Calculator {

	private int total;
	private String history = "0"; 
	
	/** Constructor for Calculator */
	public Calculator () {
		total = 25;  // not needed - included for clarity
		history = "0";
	}
	
	/** getTotal method returns an integer
	 *  @param none 
	 *  @return total 
	 */
	public int getTotal () {
		return total;
	}
	
	/** Add method passes in a value and returns nothing
	 *  @param int value 
	 *  @return none
	 */
	public int add (int value) {
		total = total + value; 
		history = history + " + " +  value  + "";
		return total; 
	}
	
	/** Void method passes in a value and returns nothing
	 *  @param int value 
	 * @return 
	 *  @return none
	 */
	public int subtract (int value) {
		total =  total - value;
		history = history + " - " +  value  + "";
		return total; 
	}
	
	/** Multiply method passes in a value and returns nothing
	 *  @param int value 
	 *  @return none
	 */
	public int multiply (int value) {
		total = total * value; 
		history = history + " * " +  value  + "";
		return total; 
	}
	
	/** Divide method passes in a value and returns nothing
	 *  @param int value 
	 *  @return none
	 */
	public int divide (int value) {
		if ( value == 0)
		{
			total = 0; 
		}
		total = total / value; 
		history = history + " / " +  value  + "";
		return total; 
	}
	
	/** getHistory method returns a string
	 *  @param none 
	 *  @return string
	 */
	public String getHistory () {
		return history;
	}
}