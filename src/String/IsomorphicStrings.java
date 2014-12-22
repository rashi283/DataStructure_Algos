/* Given two (dictionary) words as Strings, determine if they are isomorphic. 
 * Two words are called isomorphic if the letters in one word can be remapped 
 * to get the second word. Remapping a letter means replacing all occurrences of 
 * it with another letter while the ordering of the letters remains unchanged. 
 * No two letters may map to the same letter, but a letter may map to itself.
Example:
Given "foo", "app"; returns true
   we can map 'f' -> 'a' and 'o' -> 'p'
Given "bar", "foo"; returns false
   we can't map both 'a' and 'r' to 'o'

Given "turtle", "tletur"; returns true
   we can map 't' -> 't', 'u' -> 'l', 'r' -> 'e', 'l' -> 'u', 'e' -'r'

Given "ab", "ca"; returns true
   we can map 'a' -> 'c', 'b' 
 * */

package String;
import java.util.*;

public class IsomorphicStrings{
	public static void main(String args[])
	{
		String str1 = "foo";
		String str2 = "bar";
		System.out.println("Are strings isomorphic? : " + checkStr(str1, str2));
	}
	public static boolean checkStr(String str1, String str2)
	{
		int i=0; 
		//StringBuilder uni1 = new StringBuilder();
		//StringBuilder uni2 = new StringBuilder();
		//char[] uni1 = {'z'};
		//char[] uni2 = {'z'};
		List<Character> uni1 = new ArrayList<Character>();
		List<Character> uni2 = new ArrayList<Character>();
		uni1.add('z');
		uni2.add('z');
		if(str1.length()!= str2.length())
			return false;
		else
		{
			System.out.println("im here");
			for(i=0; i<str1.length(); i++)
			{
				for(int j=0; j<=uni1.size(); j++)
				{	
					System.out.println("uni1 " + uni1.toString());
					if (uni1.get(j) != str1.charAt(i))
					{
						System.out.println("uni1 at : " + uni1.get(j));
						uni1.add((str1.charAt(i))); 
					}
				}
				
				for(int k=0; k<=uni2.size(); k++)
				{	
					System.out.println("uni2 " + uni2.toString());
					if (uni2.get(k) != str2.charAt(i))
					{
						System.out.println("uni2 at : " + uni2.get(k));
						uni2.add((str2.charAt(i))) ; 
					}
				}
			}
			if(uni1.size() != uni2.size())
				return false;
				
		}
		return true;
	}
}
 