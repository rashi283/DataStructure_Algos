package Tree;

import java.util.LinkedList;
import java.util.Queue;

import LinkedList.Node;


public class PrintLevelOrderTree 
{
	
	
//	public void printInLevelOrder ()
//	{
//		Queue <Node> queue = new LinkedList <Node> ();
//		Queue <Node> temp = new LinkedList <Node> (); 
//		queue.add(root);
//		
//		while (!queue.isEmpty()){
//			Node cur = queue.poll();
//			System.out.println(cur.value);
//			if (cur.left!=null){
//				temp.add(cur.left);
//			}
//			if (cur.right!=null){
//				temp.add(cur.right);
//			}
//			
//			if (queue.isEmpty ()){
//				System.out.println("new level");
//				while (!temp.isEmpty()){
//					queue.add(temp.poll());
//				}
//				
//			}
//
//		}
//
//	}
	
//	void print(Node root)
//	{ 
//
//		if(root != null){ 
//
//		LinkedList queue = new LinkedList(); 
//		queue.add(root); 
//		int level = 0 
//		queue.add(new Integer(level++)); 
//
//		while(!queue.isEmpty()){ 
//
//		if(queue.peek() instanceof Node){ 
//
//		Node n = (Node)queue.pop(); 
//
//		for(Node child:n.getChildren()) 
//		queue.add(child); 
//
//		System.out.print("-"+n.data+"-"); 
//
//		}else{ 
//
//		Integer i = (Integer)queue.pop(); 
//
//		System.out.println("-Finished Line: "+i) 
//
//		if(!queue.isEmpty()) 
//		queue.add(new Integer(level++)); 
//		} 
//		} 
//		} 
//	}


//	public static void levelOrderPrint(Node root){
//	    Queue<Node> que = new LinkedList<Node>();
//	    Node mark = new Node();
//	    if(root != null){
//	        que.add(root);
//	        que.add(mark);
//	    }
//	    while(!que.isEmpty()){
//	        Node temp = que.poll();
//	        if(temp != mark)
//	        System.out.print(temp.key);
//	        if(temp == mark){
//	            if(que.peek() == mark || que.isEmpty()){
//	                return;
//	            }
//	            que.add(mark);
//	            System.out.println();
//	        }
//	        if(temp.left != null){
//	            que.add(temp.left);
//	        }
//	        if(temp.right != null){
//	            que.add(temp.right);
//	        }
//	    }
//	}
}
