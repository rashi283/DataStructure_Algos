package String;

public class RemovePunctuation 
{
	public static void main(String args[])
	{
		String array = "Let's try Mike! : Hello , new world .";
		String arrayNew = "";
		for(int i = 0 ; i < array.length(); i++)
		{
			if( array.charAt(i) == '.' || array.charAt(i) == '?' || array.charAt(i) == '!' ||
		
					array.charAt(i) == ':' || array.charAt(i) == '-' || array.charAt(i) == '(' ||
					array.charAt(i) == ')' || array.charAt(i) == '"' || array.charAt(i) == ',' )
				continue;
			else
				arrayNew = arrayNew + array.charAt(i);
		}
		System.out.print(arrayNew);
	}
}
