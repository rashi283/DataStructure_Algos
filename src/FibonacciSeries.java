
public class FibonacciSeries 
{
	public static void main(String args[])
	{
		int N = 12;
		int M = 8;
		int L = 5;
		int[] receive = fibonacci(N);
		int[] receiveNew = fibonacciFromM(N, M, L);
		for(int i = 0; i < N; i++)
		{	
			System.out.print(" " + receive[i]);
		}
		System.out.println();
		for(int i = 0; i < N; i++)
		{	
			System.out.print(" " + receiveNew[i]);
		}
		System.out.println("\n The " + N + "th Fibonacci number starting with " + L + " and " 
				+ M + " is : " + findFibonacciNum(N,M,L));
	}
	
	//Case 1: Give the fibonacci sequence for the first N numbers
	public static int[] fibonacci(int N)
	{
		int[]  arr = new int[N];
		if (N==0)
			return arr;
		else
		{
			arr[0] = 0;
			arr[1] = 1;
			for(int i = 2; i < N; i++)
				arr[i] = arr[i-1] + arr[i-2];
		}
		return arr;
	}
	
	//Case 2: Give the fibonacci sequence for the first N numbers starting from fibonacci number M 
	// and previous fibonacci number L
	public static int[] fibonacciFromM(int N, int M, int L)
	{
		int[]  arr = new int[N];
		//int first = M - L;
		int prev = L;
		int curr = M;
		
		arr[0] = M;
		for(int i = 1; i < N; i++)
		{
			arr[i] = curr + prev;
			prev = curr;
			curr = arr[i];
		}
		return arr;
	}
	
	//Case 3 : Find the nth value of a Fibonacci progression starting with L and M.
	public static int findFibonacciNum(int N, int M, int L)
	{
		int[] arr = new int[N+1];
		int prev = L;
		int curr = M;
		arr[0] = prev;
		arr[1] = curr;
		int i;
		for( i = 2 ; i <= N-1 ; i++)
		{
			arr[i] = prev + curr;
			prev = curr;
			curr = arr[i];
		}	
		return arr[i-1];
	}
}

