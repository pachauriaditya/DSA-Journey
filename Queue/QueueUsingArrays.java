/*
   Problem:
    Implement a Queue (FIFO) using Array in Java with basic operations:
       ~add() → insert element (enqueue)
       ~remove() → delete front element (dequeue)
       ~peek() → view front element
       ~isEmpty() → check queue empty
*/

/*
   Approach:
     Use Array as storage and maintain a variable `rear`
     which always points to the next empty position.

     ~Add (Enqueue):
       Insert element at arr[rear]
       Increment rear

     ~Remove (Dequeue):
       Store front element → arr[0]
       Shift all elements one step left
       Decrement rear

     ~Peek:
       Return arr[0]

     ~isEmpty:
       Check rear == 0
*/

/*
   Time Complexity:
       ~add: O(1)
       ~remove: O(n)   // shifting required
       ~peek: O(1)
       ~isEmpty: O(1)
*/

/*
   Space Complexity:
       ~O(n)
*/

/*
   Note:
     This implementation is not efficient because remove()
     takes O(n) time due to shifting.

     Better approach → Circular Queue (O(1) operations)
*/

package Queue;

public class QueueUsingArrays {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // add
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
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
