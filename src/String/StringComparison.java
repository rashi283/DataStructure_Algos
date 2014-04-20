package String;

public class StringComparison 
{
	public static void main(String args[])
	{
		String str1 = "hello";
		String str2 = "hello";
		boolean flag = false;
		
		if(str1.length() != str2.length())
			System.out.println("Strings not equal");
		
		//Checking if both the strings referencing the same object - if yes, then they are equal.
		if(str1.hashCode() == str2.hashCode())
			System.out.println("Strings are equal");
		else
		{
			for(int i=0; i<str1.length(); i++)
			{
				if(str1.charAt(i) != str2.charAt(i))
				{
					System.out.println("Strings not equal");
					flag = true;
					break;
				}	
			}
			if (flag != true)
				System.out.println("Strings are equal");
		}	
	}
}
