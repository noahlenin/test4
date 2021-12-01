package JavaUtilities;

import java.util.Date;
import java.util.Random;


/**
 * 
 * @author noahl
 *
 */
public class javaUtilities {

	/**
	 * This method will return random number
	 * @return Random Number
	 */
	public int getRandomNumber()
	{
		Random rdm = new Random();
		int rdmResult = rdm.nextInt();
		return rdmResult;
		
	}
	
	/**
	 * This Method will return the System date
	 * @return The System Date
	 */
	
	public String getDate()
	{
		Date date = new Date();
		String dateResult = date.toString();
		return dateResult;
	}
	
	public void pressVirtualEnterKey() {
	}
	
	
}
