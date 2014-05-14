package Numbers;

public class SumSubsets 
{
//	/* 
//	Generate all subsets of set {1..k}
//	*/
//	void Main()
//	{	
//		Console.WriteLine("Enter value of k in set {1..k}");
//		int subSetSize = Convert.ToInt32(Console.ReadLine());
//		
//		int[] setElements = new int[subSetSize];
//		Console.WriteLine("Enter the elements of subset");
//		for(int i = 0; i < subSetSize; i++)
//		{
//			setElements[i] = Convert.ToInt32(Console.ReadLine());
//		}
//		
//		int[] startArray = new int[subSetSize]; //all defaults to 0
//		int[] lastArray = new int[subSetSize];
//		
//		for(int i = 0; i < lastArray.Length ; i++)
//			lastArray[i] = 1;
//		
//		while(!startArray.AreSequenceEqual(lastArray))
//		{
//			GetNextItem(ref startArray,subSetSize);
//			Console.Write("{");
//			for(int i = 0; i < startArray.Length; i++)
//			{
//				if(startArray[i] == 1)
//				{
//					Console.Write(setElements[i]);
//					Console.Write(",");
//				}
//			}
//			Console.WriteLine("}");
//		}
//	}
//
//	/* - Start from rightmost element. Check if the element is smaller than the upper limit or not. If smaller then
//	increment it by 1, followed by setting all elements further(right) to it to 1.
//	*/
//	public void GetNextItem(ref int[] start, int subSetSize)
//	{
//		int p = subSetSize - 1;
//		while(!(start[p] != 1))
//		{
//			p = p - 1;
//		}
//		
//		start[p] = 1;
//		
//		for(int i = p + 1; i < subSetSize; i++)
//		{
//			start[i] = 0;
//		}
//	}

}
