package LinkedList;

public class CircularLinkedList 
{
	//Members
	protected Node cursor;
	protected int size;
	
	//Constructor
	public CircularLinkedList()
	{
		cursor = null;
		size = 0;
	}
	
	//Methods
	public int getSize()
	{
		return size;
	}
	
	public Node getCursor()
	{
		return cursor;
	}
	
	public void advance()
	{
		cursor = cursor.getNext();
	}
	
	public void add(Node newNode)
	{
		if(cursor == null)
		{
			newNode.setNext(newNode);
			cursor = newNode;
		}
		else
		{
			newNode.setNext(cursor.getNext());
			cursor.setNext(newNode);
		}
		size++;
	}
	
	public Node remove()
	{
		Node oldNode = cursor.getNext();
		if(oldNode == cursor)
			cursor = null;
		else
		{
			cursor.setNext(oldNode.getNext());
			oldNode.setNext(null);
		}	
		size--;
		return oldNode;
	}
	
	public String toString()
	{
		if(cursor == null)
			return " [ ] ";
		else
		{
			String s = " [ ..." + cursor.getElement();
			Node oldCursor = cursor;
			for(advance(); oldCursor!=cursor; advance())
				s += " , " + cursor.getElement();
			return s + " ... ] ";
		}	
	}
	
	public static void main(String args[])
	{
		CircularLinkedList cll = new CircularLinkedList();
		Node node1 = new Node("Element1", null);
		Node node2 = new Node("Element2", null);
		Node node3 = new Node("Element3", null);
		Node node4 = new Node("Element4", null);
		
		cll.add(node1);
		cll.add(node2);
		cll.add(node3);
		cll.add(node4);
		
		System.out.println(cll.toString());
		
		cll.remove();
		
		System.out.println(cll.toString());
	}
	
}
