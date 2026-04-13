// Problem: Reverse a Linked List (Iterative)
// Approach: Use 3 pointers (prev, curr, next) and reverse links one by one
// Time Complexity: O(n)
// Space Complexity: O(1)

public class reverse {

    // Node class
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

    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // print list
    public void printll() {
        Node temp = head;

        if (temp == null) {
            System.out.println("ll is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // reverse linked list
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        tail = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public static void main(String[] args) {
        reverse ll = new reverse();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.printll(); // 3 -> 2 -> 1 -> null

        ll.reverse();

        ll.printll(); // 1 -> 2 -> 3 -> null
    }
}