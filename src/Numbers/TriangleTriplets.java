/* Problems Statement: Given a array of positive integers, find all possible triangle 
 * triplets that can be formed from this array.
 * eg: 9 8 10 7  
 * ans: 9 8 10, 9 8 7, 9 10 7, 7 8 10 
 * Note : array not sorted, there is no limit on the array length
 */
package Numbers;
import java.util.Arrays;

public class TriangleTriplets
{
	public static void main (String args[])
	{
		int[] givenArray = {2,4,5,10};
		int[] returnArray = findTriangleCombi(givenArray);
		System.out.println("Returned Array:" + Arrays.toString(returnArray));
	}
	public static int[] findTriangleCombi (int[] givenArray)
	{	
		int[] returnArray = new int[givenArray.length * 2];
		System.out.println(givenArray.length);
		int i; int j=0;
		for (i=0; i<givenArray.length-2; i++)
		{
			if( givenArray[i] + givenArray[i+1] > givenArray[i+2])
			{
				returnArray[j] = givenArray[i]; //length 0, becomes 1
				returnArray[j+1] = givenArray[i+1]; //length 1, becomes 2
				returnArray[j+2] = givenArray[i+2]; //length 2, becomes 3
				j = j + 3;
			}
		}	
		return returnArray;
	}
}


