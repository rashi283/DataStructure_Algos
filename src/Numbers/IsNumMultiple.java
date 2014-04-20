package Numbers;

public class IsNumMultiple 
{
	public static void main(String args[])
	{
		boolean val = isNumMultiple(101,101);
		System.out.println(val);
	}
	
	public static boolean isNumMultiple(int n, int m)
	{
		if( n % m == 0)
			return true;
		return false;
	}
}
