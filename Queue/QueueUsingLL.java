/*
   Problem:
   Implement Queue using Linked List in Java

   Queue follows FIFO (First In First Out)
   Operations:
   ~ add()    → Insert element at rear
   ~ remove() → Delete front element
   ~ peek()   → View front element
*/

/*
   Approach:
   1. Create Node class:
      - data stores value
      - next stores next node reference

   2. Maintain:
      - head → front of queue
      - tail → rear of queue

   3. add():
      - Create new node
      - If queue empty → head = tail = new node
      - Else tail.next = new node, move tail

   4. remove():
      - If empty → return -1
      - Store head data
      - Move head forward
      - If only one element → head = tail = null

   5. peek():
      - Return head data

   Time Complexity:
   ~ add()    → O(1)
   ~ remove() → O(1)
   ~ peek()   → O(1)
*/

package Queue;

public class QueueUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // isEmpty
        public static boolean isEmpty() {
            return head == null & tail == null;
        }

        // add
        public static void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
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
