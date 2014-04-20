package Numbers;

public class SecondSmallest 
{
	//Find the second smallest element in an array
	
	public static void main(String args[])
	{
		int[] arr = {6, 1, 7, 8, 2, 4, 5, 3};
		int val = findSecondSmallest(arr);
		System.out.println("Return value: " + val);
	}
	
	//Check if can be optimized further. One test case doesnt work always.
	public static int findSecondSmallest(int[] arr)
	{
		int small = arr[0];
		int second = arr[1];
		System.out.println("Small and smallest before loop: " + small + " " + second);
		for(int i =0; i< arr.length; i++)
		{
			if(arr[i] < small) 
			{
				System.out.println("Prev small and Small selected" + small + " "+ arr[i]); 
				small = arr[i]; 
			}
			if(i > 1 && i != arr.length-1)	
			{	
				if(arr[i] < second) 
				{
					System.out.println("Second small selected" + arr[i]);
					second = arr[i];
				}
			}
			if(i == arr.length-1)
			{
				if(arr[i] < second)
				{
					System.out.println("Second small selected : " +arr[i]);
					second = arr[i];
				}
			}		
		}	
		return second;
	}
	
	public static int findSecondSmallestAlso(int[] arr)
	{
		int small = 0;
		int second;
		int addAll = 0;
		for(int i = 0 ; i< arr.length; i++)
		{
			addAll = addAll + arr[i];
		}
		//Find the subtractions and compare them
		
		return small;
	}
}
