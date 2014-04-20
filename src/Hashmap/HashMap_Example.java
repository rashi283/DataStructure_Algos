package Hashmap;
import java.util.HashMap;

public class HashMap_Example 
{
	public static void main(String args[])
	{
		Student[] students = new Student[5];
		for(int i=0; i<students.length; i++)
		{	
			students[i] = new Student(i, "name" + i);
		}
		buildMap(students);
		
	}
	public static HashMap<Integer, Student> buildMap(Student[] students)
	{
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		for (Student s : students)
		{	
			map.put(s.getID(), s);
			System.out.println(s.getID() + " " + s.getName() );
			System.out.println(map.get(s.getID()));
		}
		System.out.println(map);
		return map;
	}
}
