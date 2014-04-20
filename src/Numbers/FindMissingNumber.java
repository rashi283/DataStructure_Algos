package Numbers;

public class FindMissingNumber 
{
	/*
	 * You have n - 1 numbers from 1 to n. Your task is to find the missing number.
	 */
	
	//Optimal Solution - Using Sum of Natural Numbers
	public static void main(String args[])
	{
		int n = 7;
		int actual = 0;
		int expected;
		
		int[] arr = {4,3,5,1,7,2};
		
		for(int i=0; i < n-1; i++)
			actual = actual + arr[i]; 
		System.out.println("Actual : " + actual);
		
		expected = n * (n+1) / 2;
		System.out.println("Expected : " + expected);
		int result = expected - actual;
		System.out.println("Missing number : " + result);
	}
	
	/* Bad solution - Not working
	 * public static void main(String args[])
	{
		int n = 10, i,j;
		boolean flag = false;
		int[] arr = {1,2,3,4,5,6,8,9,10};
		
		for(i=1; i <= 9; i++)
		{
			for(j=1; j<=9; j++)
			{
				if(arr[j] == i)
				{
					flag = true;
					//continue;
				}
				else
				{	
					//System.out.println("Missing number : " + i);
					flag = false;
					//break;		
				}	
			}
			if(flag == true)
				break;
		}
		System.out.print("Missing number : " + i);
		
	}*/
}
