package Numbers;

public class FindPrimeNumber 
{
	//Case 1 : To find if a single number is prime or not.
	//Case 2 : To find prime numbers from an array.
	public static void main(String args[])
	{
		boolean val = findIfPrime(1);
		System.out.println("\nIs the number prime ? : " + val);
		
		int[] send = {1,2,3,5,7,9,11,10,15,19,17,23,22,29,31,41,45};
		int[] receive = findPrimeNums(send);
		for(int i = 0; i < receive.length; i++)
			System.out.print(" " + receive[i]);
	}
	
	public static boolean findIfPrime(int num)
	{
		int[] primeNums = new int[num];
		int notPrime = 0;
		for(int i = 1; i <= num/2 ; i++)
		{
			if( num % i != 0)
			{
				primeNums[i-1] = i;
			}
			if( primeNums[i-1] == 0)
			{ 
				notPrime++;
			}
			//System.out.print(" " + primeNums[i-1]);
		}
		if(notPrime > 2)
			return false;
		else
			return true;
	}
	
	public static int[] findPrimeNums(int[] arr)
	{
		int[] send = new int[arr.length];
		boolean val = false;
		for(int i=0; i<send.length; i++)
		{
			val = findIfPrime(arr[i]);
			if(val)
				send[i] = arr[i];
		}	
		return send;
	}
}
