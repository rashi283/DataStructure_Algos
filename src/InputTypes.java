
import java.io.*;
import java.util.Scanner;

public class InputTypes 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an int : ");
		int i = s.nextInt();
		System.out.println("You entered int : " + i);
		
		System.out.println("Enter a char : ");
		String c = s.next();
		System.out.println("You entered String : " + c);
		
		System.out.println("Enter a double : ");
		double d = s.nextDouble();
		System.out.println("You entered double : " + d);
		
		System.out.println("Enter a float : ");
		float f = s.nextFloat();
		System.out.println("You entered float : " + f);
		
		System.out.println("Enter a boolean : ");
		boolean b = s.nextBoolean();
		System.out.println("You entered boolean : " + b);
		
		System.out.println("Enter a long : ");
		long l = s.nextLong();
		System.out.println("You entered long : " + l);
		
		System.out.println("Enter a byte : ");
		byte by = s.nextByte();
		System.out.println("You entered byte : " + by);
		
		System.out.println("Enter a short : ");
		short sh = s.nextShort();
		System.out.println("You entered short : " + sh);

	}
}
