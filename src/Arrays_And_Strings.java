
public class Arrays_And_Strings 
{
	public static void main(String args[])
	{
		//Good implementation
		boolean val = isUniqueChars2("asdfghjkl");
		System.out.println(val);
		
		//Bad implementation
		val = isUnique("asdfghjkl");
		System.out.println(val);
		
		//Optimal implementation
		val = isUniqueChars("asdfghjkl");
		System.out.println(val);
	}
	
	//Implement an algorithm to determine if a string has all unique characters. 
	//What if you can not use additional data structures?
	
	//Good Solution - using only 1 loop
	//Assumption - Char set is ASCII
	public static boolean isUniqueChars2(String str)
	{
		boolean[] char_set = new boolean[256];
		for(int i=0; i<str.length(); i++)
		{
			int val = str.charAt(i);
			if (char_set[val])
				return false;
			char_set[val] = true;
		}	
		return true;
	}
	//Time complexity : O(n)
	//Space complexity : O(n)
	
	//Bad implementation using two loops
	public static boolean isUnique(String str)
	{
		char[] arr = new char[256];
		for(int i=0; i<str.length(); i++)
		{
			arr[i] = str.charAt(i);
			for(int j=0; j<i;j++)
				if(arr[j]==str.charAt(i))
					return false;
		}
		return true;
	}
	//Time complexity : O(n^2)
	//Space complexity : 0
	
	//Optimal Solution to reduce Space Complexity using Bit Vector
	//Assumption : String is lower case only and hence using only a single int
	public static boolean isUniqueChars(String str)
	{
		int checker = 0;
		for(int i=0; i<str.length(); ++i)
		{
			int val = str.charAt(i) - 'a';
			//System.out.println(str.charAt(i) + " " + val);
			if((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
			//System.out.println(checker);
		}
		return true;
	}
	
	
	
}
