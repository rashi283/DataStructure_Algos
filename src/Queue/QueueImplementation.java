package Queue;
// Queue.java: queue implementation

public class QueueImplementation {
   private int qMaxSize;// max queue size
   private int fp = 0;  // front pointer
   private int rp = 0;  // rear pointer
   private int qs = 0;  // size of queue
   private char[] q;    // actual queue

   public QueueImplementation(int size) {
      qMaxSize = size;
      fp = 0;
      rp = 0;
      qs = 0;
      q = new char[qMaxSize];
   }

   public char delete() {
      if (!emptyq()) {
         qs--;
         fp = (fp + 1)%qMaxSize;
         return q[fp];
      }
      else {
         System.err.println("Underflow");
         return '?';
      }
   }

   public void insert(char c) {
      if (!fullq()) {
         qs++;
         rp = (rp + 1)%qMaxSize;
         q[rp] = c;
      }
      else
         System.err.println("Overflow\n");
   }

   public boolean emptyq() {
      return qs == 0;
   }

   public boolean fullq() {
      return qs == qMaxSize;
   }
   
   public void printq() {
      System.out.print("Size: " + qs +
         ", rp: " + rp + ", fp: " + fp + ", q: ");
      for (int i = 0; i < qMaxSize; i++)
         System.out.print("q[" + i + "]=" 
            + q[i] + "; ");
      System.out.println();
   }
}
