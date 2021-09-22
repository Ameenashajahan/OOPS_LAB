import java.util.*;
import java.io.*;
public class DeQueueDemo
 {
    public static void main(String[] args) 
    {
        //Declare Deque object
        Deque<String> deque = new LinkedList<String>();
        // add elements to the queue using various methods
        deque.add("One");           //add ()
        deque.addFirst("Two");      //addFirst ()
        deque.addLast("Three");     //addLast ()
        deque.push("Four");         //push ()
        deque.offer("Five");        //offer ()
        deque.offerFirst("Six");    //offerFirst ()
        deque.offerLast("Seven");   //offerLast ()
        System.out.println("Initial Dequeue:");
        System.out.print(deque + " ");

       // Iterate using standard iterator
        System.out.println("\n\nDequeue contents using Standard Iterator:");
        Iterator iterator = deque.iterator();
        while (iterator.hasNext())
            System.out.print(" " + iterator.next());

       // Pop () method
      System.out.println("\n Dequeue Pop:" + deque.pop());
        System.out.println("\n Dequeue,After pop:" + deque);

        deque.removeFirst();        //removeFirst ()
        deque.removeLast(); //removeLast ()
        System.out.println("\n Dequeue, after removing "  + "first and last elements using removeFirst() & removeLast() method is: " + deque);

         deque.poll();
         System.out.println("\n After removing  an element from the beginning of the Dequeue using poll() method is:" + deque);

        deque.pollLast();
        System.out.println("\n After removing an element from the end (tail) of the Dequeue using pollLast()method is:" + deque);
        deque.pollFirst();
        System.out.println("\n After removing  an element from the beginning of the Dequeue using pollFirst() method is:" + deque);

   }
}
