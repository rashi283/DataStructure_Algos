package Tree;

/**
 * This is a demo class in java <br />
 * Implementing Binary Tree Traverse Level By Level with BFS and DFS. <br /> 
 * All of the algorithm I implemented use O(N) time, N here represents the number of nodes in the tree.
 * 
 */
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Antonio081014
 * @since Aug 13, 2013, 9:22:40 AM
 */
public class Solution {

 public static void main(String[] args) {
  Solution main = new Solution();
  Node root = main.new Node("3");
  root.left = main.new Node("9");
  root.right = main.new Node("20");
  root.right.left = main.new Node("15");
  root.right.right = main.new Node("7");
  main.printLevelOrder_Option0(root);
  System.exit(0);
 }

 /**
  * Tree node structure;
  * */
 class Node {
  String value;
  Node left;
  Node right;

  public Node(String v) {
   value = v;
   left = null;
   right = null;
  }
 }

 /**
  * This is the answer I gave when I was in the interview.<br />
  * Basically, track the number of children we counted, if all the children
  * in that level is counted, then we print a newline and increase the tree
  * level; The flaw of this algorithm is it can not take too many levels,
  * since integer in java can't exceed 2^32; which means we maximumly will
  * have 32 levels, even if we use long instead of int, this one is still not
  * a good choice.
  * */
 private void printLevelOrder_Option0(Node root) {
  if (root == null)
   return;
  Queue<Node> queue = new LinkedList<Node>();
  int level = 1;
  int count = 0;
  queue.add(root);
  while (!queue.isEmpty()) {
   Node node = queue.poll();
   if (count == 0)
    System.out.print(node.value);
   else
    System.out.print(" " + node.value);

   if (node.left != null)
    queue.add(node.left);
   if (node.right != null)
    queue.add(node.right);
   count += 2;

   if (count == (int) Math.pow(2, level)) {
    System.out.println();
    level++;
    count = 0;
   }
  }
 }

 /**
  * Generally, this algorithm uses BFS, which involves two queues keep tracks
  * of node in current level and nodes in next leve;<br />
  * Basically,<br />
  * 1, When a node is extracted, we print it, while adding its children to
  * the next level if they are not null;<br />
  * 2, When current level queue is empty, which means all of the current
  * nodes are extracted and printed, also all the children of current level
  * nodes are added to the next level queue. So we could just copy every
  * single node in next level queue and add it to the current queue, and
  * print the newline.
  * */
 private void printLevelOrder_Option1(Node root) {
  if (root == null)
   return;
  Queue<Solution.Node> currentLevel = new LinkedList<Solution.Node>();
  Queue<Solution.Node> nextLevel = new LinkedList<Solution.Node>();
  currentLevel.add(root);
  while (!currentLevel.isEmpty()) {
   Solution.Node node = currentLevel.poll();
   System.out.print(node.value + " ");
   if (node.left != null)
    nextLevel.add(node.left);
   if (node.right != null)
    nextLevel.add(node.right);
   if (currentLevel.size() == 0) {
    System.out.println();
    while (!nextLevel.isEmpty()) {
     currentLevel.add(nextLevel.poll());
    }
   }
  }
 }

 /**
  * For this algorithm, we use two counters to keep track of number of nodes
  * in current level, and the number of nodes in next level; <br />
  * This idea is very similar with printLevelOrder_Option1(Node root),
  * however, it uses less memory and doesn't need to copy each node from one
  * queue to another.
  * */
 private void printLevelOrder_Option2(Node root) {
  if (root == null)
   return;
  Queue<Node> queue = new LinkedList<Node>();
  int nodesInCurrentLevel = 0;
  int nodesInNextLevel = 0;
  queue.add(root);
  nodesInCurrentLevel++;
  while (!queue.isEmpty()) {
   Node node = queue.poll();
   System.out.print(" " + node.value);
   nodesInCurrentLevel--;
   if (node.left != null) {
    queue.add(node.left);
    nodesInNextLevel++;
   }
   if (node.right != null) {
    queue.add(node.right);
    nodesInNextLevel++;
   }
   if (nodesInCurrentLevel == 0) {
    System.out.println();
    nodesInCurrentLevel = nodesInNextLevel;
    nodesInNextLevel = 0;
   }
  }
 }

 /**
  * This algorithm uses a trick of BFS.<br />
  * Since we are using BFS to traverse this binary tree level by level in a
  * very nature way. We just add a newline node at the very beginning, then
  * if this newline node is reached, that means all of nodes of current nodes
  * has been visited, so we are going to move to the next level, then print
  * the newline here.
  * 
  * This trick uses the nature of BFS in binary, very smart. I think the
  * interviewee was trying to ignite me to this solution. Somehow, I didn't
  * get it. For this algorithm, user could replace this newline node with
  * other flag node for other purposes.
  * */
 private void printLevelOrder_Option3(Node root) {
  if (root == null)
   return;
  Queue<Node> queue = new LinkedList<Node>();
  queue.add(new Node("\n"));
  queue.add(root);
  while (queue.size() > 1) {
   Node node = queue.poll();
   System.out.print(node.value + " ");
   if (node.value.compareTo("\n") == 0) {
    queue.add(node);
    continue;
   }
   if (node.left != null)
    queue.add(node.left);
   if (node.right != null)
    queue.add(node.right);
  }
 }

 /**
  * This algorithm uses DFS;<br />
  * 1, Get the height from root tree node.<br />
  * 2, For each level, print the nodes on that level with a newline.
  * 
  * Although the DFS solution traverse the same node multiple times, it is
  * not another order slower than the BFS solution. Here is the proof that
  * the DFS solution above runs in O(N) time, where N is the number of nodes
  * in the binary tree and we assume that the binary tree is balanced.
  * 
  * We first compute the complexity of printLevel for the kth level:
  * 
  * T(k) <br />
  * = 2T(k-1) + c <br />
  * = 2k-1 T(1) + c <br />
  * = 2k-1 + c
  * 
  * Assuming it’s a balanced binary tree, then it would have a total of lg N
  * levels. Therefore, the complexity of printing all levels is:
  * 
  * T(1) + T(2) + ... + T(lg N) = 1 + 2 + 22 + ... + 2lg N-1 + c = O(N)
  * Finding the maximum height of the tree also takes O(N) time, therefore
  * the overall complexity is still O(N).
  * */
 private void printLevelOrder_Option4(Node root) {
  int height = treeLevel(root);
  for (int i = 1; i <= height; i++) {
   printLevel(root, i);
   System.out.println();
  }
 }

 /**
  * Print the nodes on Level: level.
  * */
 private void printLevel(Node root, int level) {
  if (root == null)
   return;
  if (level == 1) {
   System.out.print(root.value + " ");
  } else {
   printLevel(root.left, level - 1);
   printLevel(root.right, level - 1);
  }
 }

 private int treeLevel(Node root) {
  if (root == null)
   return 0;
  return 1 + Math.max(treeLevel(root.left), treeLevel(root.right));
 }
}
