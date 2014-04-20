package String;

public class StringAnagram 
{
	/*
	 * Write a method to decide if two strings are anagrams or not.
	 */
	
	public static void main(String args[])
	{
		boolean val = anagram("act", "cat");
		System.out.println(val);
		
		val = anagram1("actt", "catt");
		System.out.println(val);
	}
	//Solution 1 - Sorting the strings
//	public boolean anagram(String s, String t)
//		return sort(s) == sort(t);
	
	//Solution 2 - Check if both strings have identical counts for each unique char
	public static boolean anagram1(String s, String t) 
	{
		if (s.length() != t.length()) return false;
		int[] letters = new int[256];
		int num_unique_chars = 0;
		int num_completed_t = 0;
		char[] s_array = s.toCharArray();
		for (char c : s_array) 
		{ // count number of each char in s.
			if (letters[c] == 0) ++num_unique_chars;
				++letters[c];
		}
		for (int i = 0; i < t.length(); ++i) 
		{
			int c = (int) t.charAt(i);
			if (letters[c] == 0) 
			{ // Found more of char c in t than in s.
				return false;
			}
			--letters[c];
			if (letters[c] == 0) 
			{
				++num_completed_t;
				if (num_completed_t == num_unique_chars) 
				{// itÕs a match if t has been processed completely
					return i == t.length() - 1;
				}
			}
		 }
		 return false;
	}
	
	//Bad Solution - using Two For loops. Hence Time complexity: O(n^2)
	public static boolean anagram(String str1, String str2)
	{
		if(str1.length() != str2.length())
			return false;
		else
		{	
			int[] arr1 = new int[str1.length()];
			int[] arr2 = new int[str2.length()];
			
			int count1 = 0;
			int count2 = 0;
			
			for(int i=0; i<str1.length(); i++)
			{
				for(int j=0; j<str1.length(); j++)
				{
					if(str1.charAt(j) == str1.charAt(i))
						arr1[i] = ++count1;
					if(str2.charAt(j) == str2.charAt(i))
						arr2[i] = ++count2;
				}
				arr1[i] = ++count1;
				arr2[i] = ++count2;
				
				if(arr1[i] != arr2[i])
					return false;
			}	
			return true;	
		}	
	}
}
