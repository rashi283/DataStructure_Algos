package Numbers;

public class MinimumInSlidingWindow 
{
	/*Given an array of integer, find the minimum in the sliding window of size 4, in most optimal way. 
	 * ex [2,1,3,4,6,3,8,9,10,12,56] 
	 * Output : [1,1,3,3,3,3,8.....]
	 */
	
	public static void main(String args[])
	{
		int[] arr = {2,1,3,4,6,3,8,9,10,12,56};
		int[] val = findMinSlidingWindow(arr);
		System.out.println();
		for(int i = 0; i < val.length; i++)
			System.out.print("  " + val[i] );
	}
	
	public static int[] findMinSlidingWindow(int[] arr)
	{
		int[] send = new int[arr.length-3];
		int small, i;
		for( i = 0; i<= arr.length-4; i++)
		{
			small = arr[i];
				if(arr[i+1] < small ) 
				{
					System.out.println(arr[i+1] + " < " + small);
					small = arr[i+1]; 
				}
				if(arr[i+2] < small ) 
				{	
					System.out.println(arr[i+2] + " < " + small);
					small = arr[i+2]; 
				}
				if(arr[i+3] < small ) 
				{
					System.out.println(arr[i+3] + " < " + small);
					small = arr[i+3];
				}
				
			System.out.println("Small : " + small);
			send[i] = small;
		}	
		//send[i] = -1;
		
		return send; 
	}
}
