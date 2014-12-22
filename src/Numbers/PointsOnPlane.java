/*Fill in the following methods:
	
	public interface PointsOnAPlane {   
    
     //Stores a given point in an internal data structure
    void addPoint(Point point);
    
     //For given 'center' point returns a subset of 'm' stored points that are
     //closer to the center than others.
     //E.g. Stored: (0, 1) (0, 2) (0, 3) (0, 4) (0, 5)
     //findNearest(new Point(0, 0), 3) -> (0, 1), (0, 2), (0, 3)
     
    Collection<Point> findNearest(Point center, int m);
	}
*/
package Numbers;
import java.util.*;

public class PointsOnPlane
{
	public static void main(String args[])
	{
		Integer[] point = new Integer[2];
		ArrayList<Integer []> pointsArr = new ArrayList<Integer []>();
		
		for(int i=0; i<5; i++)
		{
			point[0] = i;
			point[1] = i+1;
			pointsArr.add(point);
			//System.out.println(pointsArr.get(i[i]).toString());
		}
		
		//System.out.println("Input Array: " + pointsArr);
		//System.out.println("The nearest points are: " + findNearest())
	}
}
