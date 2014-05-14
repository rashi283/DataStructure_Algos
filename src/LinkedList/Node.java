package LinkedList;

public class Node 
{
	//Members
	private String element;
	private Node next;
	
	//Constructor
	public Node (String s, Node n)
	{
		element = s;
		next = n;
	}
	
	public Node ()
	{}
	
	//Methods
	
	public void setElement(String newElem)
	{
		element = newElem;
	}
	
	public String getElement()
	{
		return element;
	}
	
	public void setNext(Node newNext)
	{
		next = newNext;
	}
	
	public Node getNext()
	{
		return next;
	}
}
