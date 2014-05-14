package LinkedList;

public class DoublyLinkedList 
{
	//Members:
	protected DoubleNode header;
	protected DoubleNode trailer;
	protected int size;
	
	//Constructor
	public DoublyLinkedList()
	{
		size = 0;
		header = new DoubleNode(null, null, null);
		trailer = new DoubleNode(null, null, null);
		
		header.setNext(trailer);
	}
	
	public int getSize()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return (size == 0);
	}
	
	public DoubleNode getFirst()
	{
		if (isEmpty())
		{	
			System.out.println("List is empty");
			return null;
		}
		else
			return header.getNext();
	}
	
	public DoubleNode getLast()
	{
		if (isEmpty())
		{	
			System.out.println("List is empty");
			return null;
		}
		else
			return trailer.getPrev();
	}
	
	public DoubleNode getPrev(DoubleNode refNode)
	{
		if (refNode == header)
		{
			System.out.println("No previous node before Header");
			return header;
		}	
		else
			return refNode.getPrev();
	}
	
	public DoubleNode getNext(DoubleNode refNode)
	{
		if (refNode == trailer)
		{
			System.out.println("No previous node after trailer");
			return trailer;
		}	
		else
			return refNode.getNext();
	}
	
	public void addBefore(DoubleNode refNode, DoubleNode newNode)
	{
		//DoubleNode tempNode = getPrev(refNode);
		DoubleNode tempNode = refNode.getPrev();
		newNode.setNext(refNode);
		newNode.setPrev(tempNode);
		refNode.setPrev(newNode);
		tempNode.setNext(newNode);
		size++;
	}
	
	public void addAfter(DoubleNode refNode, DoubleNode newNode)
	{
		DoubleNode temp = refNode.getNext();
		newNode.setPrev(refNode);
		newNode.setNext(temp);
		temp.setPrev(newNode);
		refNode.setNext(newNode);
		size++;
	}
	
	public void addFirst(DoubleNode newNode)
	{
		addAfter(header, newNode);
	}
	
	public void addLast(DoubleNode newNode)
	{
		addBefore(trailer, newNode);
	}
	
	public void remove(DoubleNode removeNode)
	{
		DoubleNode prev = removeNode.getPrev();
		DoubleNode next = removeNode.getNext();
		
		prev.setNext(next);
		next.setPrev(prev);
		
		removeNode.setNext(null);
		removeNode.setPrev(null);
		
		size--;
	}
	
	public boolean hasPrev(DoubleNode refNode)
	{
		return refNode!=header;
	}
	
	public boolean hasNext(DoubleNode refNode)
	{
		return refNode!=trailer;
	}
	
	public String toString()
	{
		String s = "[ ";
		DoubleNode tempNode = header.getNext();
		while(tempNode!=trailer)
		{
			s += tempNode.getElement();
			tempNode = tempNode.getNext();
			if(tempNode != trailer)
				s += " , ";
		}	
		s += " ]";
		return s;
	}
	
	public static void main(String args[])
	{
		DoublyLinkedList dll = new DoublyLinkedList();
		
		DoubleNode newNode1 = new DoubleNode("Element1", null, null);
		DoubleNode newNode2 = new DoubleNode("Element2", null, null);
		DoubleNode newNode3 = new DoubleNode("Element3", null, null);
		DoubleNode newNode4 = new DoubleNode("Element4", null, null);
		
		dll.addFirst(newNode1);
		dll.addAfter(newNode1, newNode2);
		dll.addAfter(newNode2, newNode3);
		dll.addAfter(newNode3, newNode4);
		
		System.out.println(dll.toString());
		
		dll.remove(newNode3);
		
		System.out.println(dll.toString());
		
		dll.remove(newNode2);
		
		System.out.println(dll.toString());
	}
}
