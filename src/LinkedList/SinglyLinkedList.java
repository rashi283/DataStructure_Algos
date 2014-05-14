package LinkedList;

public class SinglyLinkedList 
{
	protected Node head;
	protected Node tail;
	protected long size;
	
	public SinglyLinkedList()
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
	
	//Removing element from the Head node
	public void removeFirst()
	{
		if (head == null)
			System.out.println("List is empty");
		else
		{
			Node temp = head;
			head = head.getNext();
			temp.setNext(null);
			size = size - 1;
		}	
	}
	
	//Main Class to Test the functionality of SinglyLinkedList
	public static void main(String args[])
	{
		SinglyLinkedList sll = new SinglyLinkedList();
		Node newNode1 = new Node("Element1", null);
		Node newNode2 = new Node("Element2", null);
		Node newNode3 = new Node("Element3" , null);
		Node newNode4 = new Node("Element4", null);
		
		//Adding the nodes at the beginning
		sll.addFirst(newNode1);
		sll.addFirst(newNode2);
		sll.addFirst(newNode3);
		sll.addFirst(newNode4);
		
		System.out.println("Singly Linked List after adding :");
		printSinglyLinkedList(sll);
		
		sll.removeFirst();
		
		System.out.println("Singly Linked List after removing first :");
		printSinglyLinkedList(sll);
		
	}
	
	public static void printSinglyLinkedList(SinglyLinkedList sll)
	{
		System.out.println(sll.head.getElement());
		Node temp = sll.head.getNext();
		do
		{
			System.out.println(temp.getElement());
			temp = temp.getNext();
		}
		while(temp != null);
	}
}
