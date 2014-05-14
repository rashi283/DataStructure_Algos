package Numbers;


//Given two coordinates, find the distance between them

public class DistanceCoordinates 
{
	public static void main(String args[])
	{
		int x1 = 5;
		int y1 = 5;
		int x2 = 10;
		int y2 = 10;
		
		int diffX = x2 - x1;
		int diffY = y2 - y1;
		
		int dist = (diffX * diffX) + (diffY * diffY);
		double ans = Math.sqrt(dist);
		
		System.out.println("Distance between (" + x1 + "," + y1 + ") and (" +
				x2 + "," + y2 + ") is : " + ans);
	}
}
