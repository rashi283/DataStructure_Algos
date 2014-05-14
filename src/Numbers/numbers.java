package Numbers;

import java.util.ArrayList;
import java.util.List;

//Write a Algorithm/java Snippet to find the combinations makes up the given 
//summation.
//Set containts numbers from 1,2...9, and you are given the desired sum to be 
//find.
//1) No Numbers are repeated
//2) Numbers are in sorted format
//
//Below are the different examples
//eg : Input :  { 4,5,6,7}, Sum = 11
//o/p :  (4,7),(5,6)
//
//Input :  { 4,5,6,7}, Sum = 15
//output : (4,5,6)
//
//Input :  { 1,2,3,4,6,7,8 } , Sum :  10
//o/p : (3,7) , (2,8),(1,2,3,4),(1,2,7)
//
//code:
//
//public class numbers {
//    
//    public static void main(String args[])
//    {
//        int[] arr = {4,5,6,7};
//        int sum = 11;
//        String arrOp;
//    
//        for (int i = 0; i < arr.length; i++)
//        {
//            for(int j = i; j < arr.length; j++)
//            {
//                if ( (arr[j] + arr[i]) == sum )
//                {
//                    System.out.println("set : " + arr[j] + ", " + arr[i]);
//                }
//            }   
//        }   
//    }
//}
//
//output:
//set : 5, 6
//set : 4, 7
//
//output:
//set : 7, 4
//set : 6, 5
//
//else if ((arr[j] + arr[i] + arr[i+1]) == sum)
//                {
//                    System.out.println("set : " + arr[j] + ", " + arr[i] + ", " + arr[i+1]);
//                }
//
//
//Javascript:
//for(var i = 0; i< 100; i++)
//{
//    
//    document.getElement("div") = i //Update
//}
//



public class numbers {
	
	public static void main(String args[])
	{
		int[] arr = {4,5,6,7};
		int sum = 11;
		int tempVal = arr[0];
		int j = 1;
	
		for (int i = 0; i < arr.length-1; i++)
		{	
			while(tempVal != sum && j<arr.length)
			{
				tempVal = tempVal + arr[j];
				if(tempVal == sum)
					System.out.print(arr[j] + ",");
				j++;

			}
		}	
		
		//testFindAllSubsets();
	}
	
	

//    public static void combine(int[] a, List<int> outstr, int index)
//    {
//        for (int i = index; i < a.Length; i++)
//        {
//
//            int count = 0;
//            foreach (var item in outstr)
//                count += item;
//
//            if ((a[i] + count) == 10)
//            {
//                foreach (var item in outstr)
//                    Console.Write("{0}", item);
//
//                Console.Write("{0}", a[i]);
//                Console.WriteLine();
//            }
//
//
//            outstr.Add(a[i]);
//            combine(a, outstr, i + 1);
//            outstr.Remove(a[i]);
//        }
//    }
	
//	public static void testFindAllSubsets() {
//        int[] array = {4,5,6,7};
//        int k=7;
//                 // here the algorithm starts
//        for(int i = 0; i < array.length;i++){
//            // now work back words
//            int sum = array[i];
//            List<Integer> subset = new ArrayList<Integer>();
//            subset.add(array[i]);
//            for(int j = array.length -1; j > i && sum < k; j--){
//                int newSum = sum + array[j];
//                                    // if the sum is greater, than ditch this subset
//                if(newSum <= k){
//                    subset.add(array[j]);
//                    sum = newSum;
//                }
//            }
//            // we won't always find a subset, but if we do print it out
//            if(sum == k){
//                System.out.print("{");
//                System.out.print(subset.get(0));
//                for(int l = 1; l < subset.size(); l++){
//                    System.out.print(","+subset.get(l));
//                }
//                System.out.print("}");
//                System.out.println();
//            }
//        }
//    }
}
