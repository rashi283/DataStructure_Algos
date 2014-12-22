/* Write an function to judge whether the input String is a number? 
 * For example: "-3.3425","80.0", both of them are number
 */

package String;
import java.lang.*;

public class IsStringNumber
{
	public static void main (String args[])
	{
		String ipStr = "3.00";
		System.out.println("Is string a number? : " + checkIfNumber(ipStr));		
	}
	
	// A better approach is to use Regex
	
	public static boolean checkIfNumber(String ipStr)
	{
		int i=0;
		boolean returnVal = false;
		int foundOneMinus = 0;
		int foundOneDecimal = 0;
		
		for(i=0;i<ipStr.length();i++)
		{
			if(Character.isDigit(ipStr.charAt(i)) && foundOneMinus <= 1 && foundOneDecimal <= 1)
				returnVal = true;
			else if (ipStr.charAt(i)=='-' && foundOneMinus != 1)
			{
				returnVal = true;
				foundOneMinus = 1;
			}
			else if (ipStr.charAt(i) == '.' && foundOneDecimal != 1)
			{
				returnVal = true;
				foundOneDecimal = 1;
			}
			else
			{
				returnVal = false;
				break;
			}
		}
		return returnVal;
	}
}