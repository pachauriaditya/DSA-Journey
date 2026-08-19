// Problem: Remove First Node
// Approach: Move head forward
// Time Complexity: O(1)
// Space Complexity: O(1)

public class removeFirst {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // remove the node (first)
    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // print linked list
    public void printll() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        removeFirst ll = new removeFirst();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        size = 3;

        ll.removeFirst();
        ll.printll(); // 2 -> 3 -> null
    }
}