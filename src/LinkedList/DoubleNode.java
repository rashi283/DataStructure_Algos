package LinkedList;

public class DoubleNode 
{
	//Members:
	private String element;
	private DoubleNode next;
	private DoubleNode prev;
	
	//Constructor
	public DoubleNode(String e, DoubleNode n, DoubleNode p)
	{
		element = e;
		next = n;
		prev = p;
	}
	
	//Methods to access the members:
	public void setElement(String newElem)
	{
		element = newElem;
	}
	
	public String getElement()
	{
		return element;
	}
	
	public void setNext(DoubleNode newNext)
	{
		next = newNext;
	}
	
	public DoubleNode getNext()
	{
		return next;
	}
	
	public void setPrev(DoubleNode newPrev)
	{
		prev = newPrev;
	}
	
	public DoubleNode getPrev()
	{
		return prev;
	}
}
