package Numbers;

public class IsNumOddUsingBitwise 
{

	public static void main(String args[])
	{
		boolean val = isOdd(1179);
		System.out.println(val);
	}
	
	public static boolean isOdd(int n)
	{
//		System.out.println(n<<1);
//		System.out.println((n<<1) & n);
		System.out.println(n&1);
		if( (n & 1) == 0)
		{	
			return false;
		}
		return true;
	}
}
