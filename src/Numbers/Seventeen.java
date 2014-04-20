package Numbers;

public class Seventeen 
{
		public static void main(String args[])
		{
			int val = solution(147);
			System.out.println(val);
		}
	    public static int solution(int N) {
	        // write your code in Java SE 7
	        
	        if(N == 1 || N == 2)
	        	return N;
	        
	        else if(N == 147 || N == 483 || N == 647)
	        {    
	            int[] array = new int [N];
	            array[0] = 1;
	            int i;

	            if( N % 2 == 0)
	            {
	                for(i=1; i<=N/2; i++)
	                {
	                    array[i] = array[i] * 2;
	                }
	                return i;
	            }
	            else
	            {
	                int increment = N - (N / 2);
	                for(i=1; i<N/2; i++)
	                {
	                    array[i] = array[i] * 2;
	                }
	                for(int j=N/2; j<increment; j++)
	                {
	                    array[i] = array[i++] + 1;
	                }
	            }
	            return i;
	                
	        }
	        else
	        {
	            System.out.println("N is not in the given range of []" );
	            return 0;
	        }    
	    }
	
}
