/*
   Problem:
    Implement a Stack (LIFO) using Linked List in Java
*/

/*
    Approach:
      Use head as top of stack
      ~Push:
        Insert at beginning
      ~Pop:
        Remove from beginning
      ~Peek:
        Return head data
      ~isEmpty:
        head == null
*/

/*
    Time Complexity:
        ~push: O(1)
        ~pop: O(1)
        ~peek: O(1)
        ~isEmpty: O(1)
*/

/*
    Space Complexity:
        ~O(n)
*/
package Stack;

public class linkedListUsingStack {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // push
        public static void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
