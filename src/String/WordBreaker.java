package String;

import java.util.HashSet;
import java.util.Set;

/*Given a string s and a dictionary of words dict, determine if s can be 
 * segmented into a space-separated sequence of one or more dictionary words.
 * For example, given
 * s = "leetcode",
 * dict = ["leet", "code"].
 * 
 * Below is a bad implementation with Time Complexity as O(2^n)
*/
public class WordBreaker 
{
	public static void main(String args[])
	{
		String s = "leetcode";
		Set<String> strSet = new HashSet<String>();
		strSet.add("leet");
		strSet.add("code");
		System.out.println("Can the word be broken? : " + wordBreak(s, strSet));
	}
	public static boolean wordBreak(String s, Set<String> dict) 
	{
        return wordBreakHelper(s, dict, 0);
	}

	public static boolean wordBreakHelper(String s, Set<String> dict, int start){
	   if(start == s.length()) 
	       return true;
	
	   for(String a: dict){
	       int len = a.length();
	       int end = start+len;
	
	       //end index should be <= string length
	       if(end > s.length()) 
	           continue;
	
	       if(s.substring(start, start+len).equals(a))
	           if(wordBreakHelper(s, dict, start+len))
	               return true;
	   }
	
	   return false;
	}
}
