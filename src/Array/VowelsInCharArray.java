package Array;

public class VowelsInCharArray 
{
	public static void main(String args[])
	{
		String array = "aeiou"; //"HelloThisIsAJavaProgram";
		int count = 0;
		for(int i=0; i<array.length();i++)
			if( array.charAt(i) == 'a' || array.charAt(i) == 'e' || array.charAt(i) == 'i' ||
					array.charAt(i) == 'o' || array.charAt(i) == 'u' || array.charAt(i) == 'A' ||
					array.charAt(i) == 'E' || array.charAt(i) == 'I' || array.charAt(i) == 'O' ||
					array.charAt(i) == 'U' )
				++count;
		System.out.println("Count of vowels : " + count);
	}
	
}
