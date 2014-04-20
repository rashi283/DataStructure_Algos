package Numbers;

public class SumIntegersSmallerThanN 
{
	//Case 1: Sum of all integers smaller than n
	//Case 2: Sum of all ODD integers smaller than n
	public static void main(String args[])
	{
		int n = 3;
		int sum = 0;
		
		//Case 1:
		for(int i=n ; i>0; i--)
		{
			sum = sum + i;
			//System.out.print(" " + sum);
		}	
		System.out.println("\n Sum : " + sum);
		
		//Case 2:
		sum = 0;
		for(int i = n ; i > 0 ; i--)
		{
			if((i&1) != 0)
				sum = sum + i;
		}	
		System.out.println("\n Sum of odd numbers : " + sum);
	}
}
