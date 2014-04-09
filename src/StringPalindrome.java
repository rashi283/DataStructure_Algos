
public class StringPalindrome 
{
	public static void main(String args[])
	{
		boolean val = palindrome("qwertyuiop", "poiuytrewq");
		System.out.println(val);
	}
	
	public static boolean palindrome(String str1, String str2)
	{
		if(str1.length() != str2.length())
			return false;
		else
		{
			int len = str1.length() - 1;
			for(int i=0; i<str1.length(); i++)
			{
				if(str1.charAt(i) != str2.charAt(len--))
					return false;
			}	
			return true;
		}	
	}
}
