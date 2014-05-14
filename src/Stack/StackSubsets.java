package Stack;

//Making use of Java Util Stack class
import java.util.Stack;

public class StackSubsets 
{
    //Setting value of the Integer array and Expected Sum;
	public static final int[] DATA = { 1,2,3,4,6,7,8 };
	public static final int SUM = 10;

	//Declaring new Stack of Integers
    private Stack<Integer> stack = new Stack<Integer>();

    //Sum variable initialization
    private int sumInStack = 0;

    //Function to find subsets with summation as required sum
    public void fillSubset(int[] data, int fromIndex, int endIndex) 
    {
    	//If Sum equal to required Sum, then print the subset
        if (sumInStack == SUM) 
            print(stack);

        //Finding the sum of the subset within the stack
        for (int i = fromIndex; i < endIndex; i++) {

            if (sumInStack + data[i] <= SUM) 
            {
                stack.push(data[i]);
                sumInStack += data[i];

                //Recursively find the subsets
                fillSubset(data, i + 1, endIndex);
                sumInStack -= (Integer) stack.pop();
            }
        }
    }

    //Main function to run the class
    public static void main(String args[])
    {	
    	StackSubsets get = new StackSubsets();
    	System.out.println("Sets for SUM: " + SUM);
        get.fillSubset(DATA, 0, DATA.length);
    }
    
    //Printing the result
    private void print(Stack<Integer> stack) 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("("); 
        for (Integer i : stack) {
            sb.append(i).append(",");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1).append(")").toString()); 
    }
    
}
