/*Given a string array ex: [1, 2, 3], find the permutation in best time.
*For example,
*[1,2,3] have the following permutations:
*[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
*/

package Numbers;
import java.util.*;

public class PermutationsOfNumbers
{
	public static void main(String args[])
	{
		int[] inArr = {1,2,3};
		System.out.println("Permutations of " + Arrays.toString(inArr) + " is the following :" );
		//permutations(inArr);
	}
	
	// Still not the best solution.
//	public static int[] permutations(int[] inArr)
//	{
//		int i=0, j=1;
//		//List<Integer> opArr = new ArrayList<Integer>();
//		//List<Integer> tempArr = new ArrayList<Integer>();
//        tempArr = new ArrayList<Integer>();
//
//		System.out.println("[" + inArr[0] + "]");
//
//		for(i=0;i<inArr.length; i++)
//		{
//			for(j=0; j<inArr.length; j++)
//			{
//				tempArr.add(inArr[i]);
//				tempArr.add(inArr[j]);
//			}
//		}
//		System.out.println(tempArr);
//		return inArr;
//	}
}
