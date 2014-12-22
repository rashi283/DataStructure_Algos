/* Write a function that, given a list of integers (both positive and negative) 
 * returns the sum of the contiguous subsequence with maximum sum. 
 * Thus, given the sequence (1, 2, -4, 1, 3, -2, 3, -1) it should return 5.
 * */
package Numbers;

public class SumContiguousIntegers{
	public static void main (String args[]){
		int[] arr = {1, 2, -4, 1, 3, -2, 3, -1};
		System.out.println("Sum is: " + getSum(arr));
	}
	public static int getSum(int[] arr){
		int i=0, max=0, curr=0;
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Arr, Curr, Max : " +arr[i]+ " " +curr+ " " +max);
			if(curr + arr[i] <= 0)
				curr =0;
			else
				curr += arr[i];
			if(curr > max)
				max = curr;
			System.out.println("After Arr, Curr, Max : " +arr[i]+ " " +curr+ " " +max);
		}
		return max;
	}
}