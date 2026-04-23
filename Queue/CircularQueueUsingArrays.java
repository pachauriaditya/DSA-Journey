/*
   Problem:
    Implement a Circular Queue (FIFO) using Array in Java with basic operations:
       ~add() → insert element (enqueue)
       ~remove() → delete front element (dequeue)
       ~peek() → view front element
       ~isEmpty() → check queue empty
       ~isFull() → check queue full
*/

/*
   Approach:
     Use Array as circular storage and maintain two pointers:
     ~front → points to first element
     ~rear  → points to last element

     Circular nature is handled using modulo (% size)

     ~Add (Enqueue):
       Check if queue is full → (rear + 1) % size == front
       If first element → set front = 0
       Move rear → (rear + 1) % size
       Insert element at arr[rear]

     ~Remove (Dequeue):
       If only one element → reset front = rear = -1
       Else move front → (front + 1) % size
       Return removed element

     ~Peek:
       Return arr[front]

     ~isEmpty:
       Check front == -1 && rear == -1

     ~isFull:
       Check (rear + 1) % size == front
*/

/*
   Time Complexity:
       ~add: O(1)
       ~remove: O(1)
       ~peek: O(1)
       ~isEmpty: O(1)
       ~isFull: O(1)
*/

/*
   Space Complexity:
       ~O(n)
*/

/*
   Advantage over normal queue:
     No shifting required
     Efficient operations (O(1))

   Key Idea:
     Array behaves like a circle using modulo operation...
*/

package Queue;

public class CircularQueueUsingArrays {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];
            // last element deleted
            if (rear == front) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
