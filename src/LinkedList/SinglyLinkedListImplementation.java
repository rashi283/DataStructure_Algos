package LinkedList;


public class SinglyLinkedListImplementation 
{
	protected Node head;
	protected Node tail;
	protected long size;
	
	public SinglyLinkedListImplementation()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	//Inserting element at Head Node
	public void addFirst(Node newNode)
	{
		newNode.setNext(head);
		head = newNode;
		size = size + 1;
	}
	
	//Inserting element at Tail Node, provided we keep a reference to the Tail node.
	public void addLast(Node newNode)
	{
		newNode.setNext(null);
		tail.setNext(newNode);
		tail = newNode;
		size = size + 1;
	}
	
}
