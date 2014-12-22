/* Display an integer array of [1, 2, 3, 4, 5, 6, 7] in the following format 
1 4 6 
2 5 7 
3 
The method signature takes in an array of integers and the number of columns. 
In the above example, noOfCols = 3. The columns should contain equal number of elements 
as much as possible.
 * */

package Numbers;
import java.util.*;

public class IntegersInCols{
	public static void main(String args[]){
		int[] arr = {1,2,3,4,5,6,7};
		int cols = 3;
		System.out.println("Result is: ");
		printCols(arr, cols);
	}
	public static void printCols(int[] arr, int cols)
	{
		int len = arr.length;
		int remain = len % cols;
		int rows = len / cols;
		int k=0, j=1, last=0;
		List<Integer> temp = new ArrayList<Integer>();
		System.out.println("Remain: " + remain + " Rows: " + rows);
		for(int i=0; i<cols; i++)
		{
			if(remain==1 & k<=(rows+remain) & k>0)
			{
				last = arr[rows];
				k=k+1;
				j=j+1;
			}
			temp.add(arr[k]);
			k+=2;
			temp.add(arr[j]);
			j+=2;
			System.out.println(temp.toString());
		}	
		temp.add(last);
		k=0;j=1;
		for(int i=0; i<cols; i++)
		{
			if(k<temp.size() && j<temp.size())
			System.out.print(temp.get(k));
			else
				k=1;
				j=1;
		}
	}
}