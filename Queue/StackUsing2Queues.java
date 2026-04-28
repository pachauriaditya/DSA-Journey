/*
   Problem:
   Implement Stack using Two Queues

   Stack follows:
   ~ LIFO (Last In First Out)

   Queue follows:
   ~ FIFO (First In First Out)

   Goal:
   Simulate stack behavior using queue operations
*/

/*
   Data Structures Used:
   ~ q1 → Primary queue
   ~ q2 → Secondary/helper queue

   Rule:
   ~ At any time, only one queue stores all elements
   ~ Other queue is used for transfer
*/

/*
   isEmpty():
   ~ Returns true if both queues are empty
   ~ Stack is empty only when no elements exist

   Time Complexity:
   ~ O(1)
*/

/*
   push(data):
   ~ If q1 has elements → insert into q1
   ~ Else → insert into q2

   Why?
   ~ Keeps insertion simple
   ~ No shifting required
   ~ Push operation becomes efficient

   Time Complexity:
   ~ O(1)
*/

/*
   pop():
   ~ Remove elements from active queue
   ~ Transfer all except last element
     to helper queue
   ~ Last remaining element is popped

   Why?
   ~ Last inserted element must be removed first
   ~ This ensures LIFO order

   Example:
   q1: 1 2 3 4 5
   Transfer: 1 2 3 4 → q2
   Pop: 5

   Time Complexity:
   ~ O(n)
*/

/*
   peek():
   ~ Similar to pop()
   ~ Transfer all elements
   ~ Track last element as top
   ~ Return top element without deletion

   Why?
   ~ Needed to view current top
   ~ Stack remains unchanged

   Time Complexity:
   ~ O(n)
*/

/*
   Example Working:
   push(1)
   push(2)
   push(3)

   Active Queue:
   Front → 1 2 3

   peek():
   ~ Returns 3

   pop():
   ~ Removes 3

   Remaining:
   Front → 1 2
*/

/*
   Time Complexity Summary:
   ~ push() → O(1)
   ~ pop()  → O(n)
   ~ peek() → O(n)
*/

/*
   Advantages:
   ~ Efficient insertion
   ~ Simple implementation
   ~ Good for understanding stack simulation
*/

/*
   Disadvantages:
   ~ pop() and peek() are slower
   ~ Requires extra queue space
*/

/*
   Other Stack Implementations:
   ~ Array
   ~ ArrayList
   ~ Linked List
   ~ Java Stack Class
   ~ Deque
   ~ Two Queues
*/

/*
   Queue Implementation Options:
   ~ LinkedList
   ~ ArrayDeque (often faster)
*/

package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {

    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // Check if stack is empty
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push element
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop element
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();

                    if (q1.isEmpty()) {
                        break;
                    }

                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();

                    if (q2.isEmpty()) {
                        break;
                    }

                    q1.add(top);
                }
            }

            return top;
        }

        // Peek top element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}