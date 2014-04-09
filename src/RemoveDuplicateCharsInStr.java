
public class RemoveDuplicateCharsInStr 
{
	/* Design an algorithm and write code to remove the duplicate characters in a string
	 * without using any additional buffer. NOTE: One or two additional variables are fine.
	 * An extra copy of the array is not.
	 * FOLLOW UP
	 * Write the test cases for this method.
	 * */

	public static void main(String args[])
	{
		removeDup("hheelloo");
		char[] arr = new char[8];
		arr[0] = 'h';
		arr[1] = 'h';
		arr[2] = 'e';
		arr[3] = 'e';
		arr[4] = 'l';
		arr[5] = 'l';
		arr[6] = 'o';
		arr[7] = 'o';
		System.out.println("\nhheelloo");
		removeDuplicates(arr);
		removeDups(arr);
	}
	
	//Using additional buffer - Bad implementation using two loops
	//Time Complexity : O(n^2)
	public static void removeDup(String str)
	{
		char[] arr =new char[str.length()];
		boolean flag = false;
		System.out.println(str);
		for(int i=0; i<str.length();i++)
		{
			for(int j=0; j<=i ; j++)
			{
				if(str.charAt(i)!=arr[j])
					flag = true;
				else if(str.charAt(i) == arr[j])
				{
					flag = false;
					break;
				}
			}	
			if (flag == true)
				arr[i] = str.charAt(i);
			System.out.print(arr[i]);
		}	
	}
	
	//Optimal Solution - using no Additional Buffer -- CHECK
	//Time complexity : O(n^2)
	public static void removeDuplicates(char[] str)
	{
		if(str == null)
			return;
		int len = str.length;
		
		if(len<2)
			return;
		
		int tail = 1;
		
		for(int i = 1; i < len ; ++i)
		{
			int j;
			for(j=0; j < tail; ++j)
			{
				if(str[i] == str[j])
					break;
			}	
			if(j == tail)
			{
				str[tail] = str[i];
				++tail;
			}
			System.out.print(str[i]);
		}
		str[tail] = 0;
	}
	
	//Additional memory of constant size -- CHECK
	public static void removeDups(char[] str)
	{
		if (str == null) return;
		int len = str.length;
		if(len < 2) return;
		boolean[] hit = new boolean[256];
		for(int i=0; i<256; ++i) hit[i] = false;
		hit[str[0]] = true;
		int tail = 1;
		for(int i =1; i < len; ++i)
		{
			if(!hit[str[i]])
			{
				str[tail] = str[i];
				++tail;
				hit[str[i]] = true;
			}
			System.out.print(str[tail]);
		}
		str[tail] = 0;
	}
}
