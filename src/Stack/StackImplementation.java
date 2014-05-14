package Stack;

public class StackImplementation 
{
   private int maxSize;
   private long[] stackArray;
   private int top;
   public StackImplementation(int s) 
   {
      maxSize = s;
      stackArray = new long[maxSize];
      top = -1;
   }
   public void push(long j) 
   {
      stackArray[++top] = j;
   }
   public long pop() 
   {
      return stackArray[top--];
   }
   public long peek() 
   {
      return stackArray[top];
   }
   public boolean isEmpty() 
   {
      return (top == -1);
   }
   public boolean isFull() 
   {
      return (top == maxSize - 1);
   }
   public static void main(String[] args) 
   {
      StackImplementation theStack = new StackImplementation(10); 
      
      case1(theStack, 11);
      
      while (!theStack.isEmpty()) 
      {
         long value = theStack.pop();
         System.out.print(value + " ");
      }
   }
   
   public static void case1(StackImplementation stackVal, long sumVal)
   {
	   StackImplementation theStack = stackVal;
	   long[] arr = new long[10];
	   int i=0;
	   long tempVal =0;
	   long tempSum = 0;
	   
	   theStack.push(7);
	   theStack.push(6);
	   theStack.push(5);
	   theStack.push(4);
	   
	   tempVal = theStack.pop();
	   arr[i++] = tempVal;
	   
	   while(!theStack.isEmpty())
	   {
		   tempVal = theStack.pop();
		   arr[i++] = tempVal;
		   tempSum = tempSum + tempVal;
		   System.out.println(tempSum + " " +arr[i]); 
		   
		   if(tempSum == sumVal)
			   System.out.println(tempSum);
			   
	   } 

   }
}