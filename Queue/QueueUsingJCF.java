/*
   Problem:
   Implement Queue using Java Collection Framework (JCF)

   Queue follows FIFO (First In First Out)
   Operations:
   ~ add()    → Insert element at rear
   ~ remove() → Delete front element
   ~ peek()   → View front element
*/

/*
   Why Queue<Integer> q = new LinkedList<>();

   Queue is an interface in Java,
   so we cannot create objects directly from Queue.

   Therefore, we use a class that implements Queue.

   LinkedList is used because:
   ~ Fast insertion at rear → O(1)
   ~ Fast deletion from front → O(1)
   ~ Dynamic size (no fixed capacity)
   ~ Built-in Queue methods supported

   Other options:
   1. ArrayDeque
      ~ Faster than LinkedList in most cases
      ~ No extra node memory
      ~ Better for queue + deque operations

   2. PriorityQueue
      ~ Elements removed based on priority,
        not FIFO order

   3. Custom Queue using:
      ~ Array
      ~ Linked List
      ~ Circular Queue

   Most common:
   ~ LinkedList
   ~ ArrayDeque
*/

/*
   Methods Used:
   ~ add()      → Adds element to rear
   ~ peek()     → Returns front element
   ~ remove()   → Removes front element
   ~ isEmpty()  → Checks if queue is empty
*/

package Queue;

import java.util.*;

public class QueueUsingJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}