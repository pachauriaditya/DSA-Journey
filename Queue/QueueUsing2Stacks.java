/*
   Problem:
   Implement Queue using Two Stacks

   Queue follows FIFO (First In First Out)
   Stack follows LIFO (Last In First Out)

   Goal:
   Use stack operations to perform queue operations
*/

/*
   Approach Used in This Code:
   Two stacks are used:
   ~ s1 → Main stack that always keeps queue order
   ~ s2 → Temporary helper stack

   add(data):
   1. Move all elements from s1 → s2
   2. Push new data into s1
   3. Move all elements back from s2 → s1

   This makes sure:
   ~ Oldest element stays on top of s1
   ~ Front element is always ready for remove()

   remove():
   ~ Directly pop from s1

   peek():
   ~ Directly return top of s1
*/

/*
   Example:
   add(1), add(2), add(3)

   After operations:
   s1 top → 1, 2, 3

   remove():
   ~ Removes 1 first

   Thus FIFO order is maintained
*/

/*
   Time Complexity:
   ~ add()    → O(n) because all elements shift
   ~ remove() → O(1)
   ~ peek()   → O(1)

   This version makes insertion costly
   but removal fast
*/

/*
   Alternative Approach:
   ~ O(1) add
   ~ O(n) remove
   (Transfer elements only when required)
*/

/*
   Other Queue Implementations:
   ~ Array
   ~ Circular Queue
   ~ Linked List
   ~ Java Collection Framework (LinkedList / ArrayDeque)
   ~ Two Stacks
*/

package Queue;

import java.util.Stack;

public class QueueUsing2Stacks {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    // Check if queue is empty
    public boolean isEmpty() {
        return s1.isEmpty();
    }

    // Add element
    public static void add(int data) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // Remove element
    public static int remove() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.pop();
    }

    public int peek() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.peek();
    }

    public static void main(String[] args) {
        QueueUsing2Stacks q = new QueueUsing2Stacks();
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
