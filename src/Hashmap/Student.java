package Hashmap;

public class Student 
{
	String name;
	int id;
	
	public Student(int idVal, String nameVal) 
	{
		this.id = idVal;
		this.name = nameVal;
	}
	
	public void setName(String nameVal)
	{
		this.name = nameVal;
	}
	public String getName()
	{
		return this.name;
	}
	
	public void setID(int idVal)
	{
		this.id = idVal;
	}
	public int getID()
	{
		return this.id;
	}
	
}

