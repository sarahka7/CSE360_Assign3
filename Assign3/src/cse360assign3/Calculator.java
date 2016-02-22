
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
	
	/** Add method passes in a value, updates history and returns total
	 *  @param int value 
	 *  @return total
	 */
	public int add (int value) {
		total = total + value; 
		history = history + " + " +  value  + "";
		return total; 
	}
	
	/** Subtract method passes in a value, updates history, and returns total
	 * @param int value 
	 * @return total
	 */
	public int subtract (int value) {
		total =  total - value;
		history = history + " - " +  value  + "";
		return total; 
	}
	
	/** Multiply method passes in a value, updates history, and returns total
	 *  @param int value 
	 *  @return total
	 */
	public int multiply (int value) {
		total = total * value; 
		history = history + " * " +  value  + "";
		return total; 
	}
	
	/** Divide method passes in a value, updates history, and returns nothing
	 *  @param int value 
	 *  @return total
	 */
	public int divide (int value) {
		if ( value == 0)
		{
			total = 0; 
		}
		else
		{
			total = total / value;
		}
		history = history + " / " +  value  + "";
		return total; 
	}
	
	/** getHistory method returns a history of all actions as a string
	 *  @param none 
	 *  @return history 
	 */
	public String getHistory () {
		return history;
	}
}