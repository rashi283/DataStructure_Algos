package Numbers;

public class PairsAndTheirValues 
{
	/*Given an array, print all the pairs that sum to a particular value. 
	 * You are not given the value, find all possible values and print pairs for them.
	 */
	
	public static void main(String args[])
	{
		pairsAndValues();
	}
	
	public static void pairsAndValues()
	{
		int[] arr = {1,2,3};
		
		for(int i = 0 ; i< arr.length; i++)
			for(int j = 0 ; j < arr.length ; j++)
			{
				System.out.print("Value : " + (arr[i] + arr[j]));
				System.out.println("  Pair : " + arr[i] + " and " + arr[j]);
				
			}	
	}
}
