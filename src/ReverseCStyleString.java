
public class ReverseCStyleString 
{
	/*Write code to reverse a C-Style String. 
	 * (C-String means that “abcd” is represented as five characters, including the null character.)
	 */
	
	public static void main(String args[])
	{
		reverse("rashi");
	}
	
	//Optimal solution - Trying to do it in place using Pointers
//	void reverse(char *str) {}

	
	//Not the most optimal solution
	public static void reverse(String str)
	{
		char[] arr = new char[str.length()];
		//arr[0] = str.charAt(str.length());
		for(int i=1; i<=str.length(); i++)
		{
			arr[i-1] = str.charAt(str.length()-i);
			System.out.println(arr[i-1]);
		}	
		System.out.println(str);
	}
	
}
