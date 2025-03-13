package CORE_JAVA.JAVA28_CollectionFrameWork_QUEUE;

import java.util.PriorityQueue;

public class Lab112_Q_Intro {

    /*
   1.Queue is an Interface(Less used in Automation).
   2.Interface was added is JAVA5.
   3.Uses First in First Out Method (FIFO).
   4.Priority Queue is most commonly used in subclasses of queue interface
   5.Priority Queue doesn't allow null values.
     */

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer("1"); // offer is just like add fxn
        pq.offer("2");
        pq.offer("3");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek()); //gives first entered value, used just to see value, it doesn't delete the elements
        System.out.println(pq);
        System.out.println(pq.poll()); // deletes elements , first entered element
        System.out.println(pq);
    }

}
