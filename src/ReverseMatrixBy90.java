
public class ReverseMatrixBy90 
{
	public static void main(String args[])
	{
		int[][] arr = new int[2][2];
		int num = 10;
		System.out.println("Sent: ");
		for(int i=0; i<2;i++)
		{
			for(int j=0;j<2;j++)
			{	
				arr[i][j] = num++;
				System.out.print(" " + arr[i][j] + " ");
			}
		}
		int rows = 1;
		int columns = 1;
		arr = reverseMatrix(arr, rows, columns);
		System.out.println("Received: ");
		for(int i=0; i<2;i++)
		{
			for(int j=0;j<2;j++)
			{	
				System.out.print(" " + arr[i][j] + " ");
			}
		}
	}
	
	public static int[][] reverseMatrix(int[][] arr, int rows, int columns)
	{
		int buffer;
		buffer = arr[rows][columns];
		System.out.println(arr[rows][columns]);
		arr[rows][columns] = arr[rows-1][columns];
		arr[rows-1][columns] = arr[rows-1][columns-1];
		arr[rows-1][columns-1] = arr[rows][columns-1];
		arr[rows][columns-1] = buffer;
		
		return arr;

		//		for(int i=0 ; i <rows; i++)
//		{
//			for(int j=0; j<columns; j++)
//			{
//				buffer = arr[i][j];
//				
//			}
//		}
				
		//return arr;
	}
}
