// Problem: Reverse Linked List
// Approach: Iterative (3-Pointer Method)
// Time Complexity: O(n)
// Space Complexity: O(1)
public class iterativeWaytoReverseLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Print Linked List
    public static void printll(Node head) {
        Node temp = head;

        if (temp == null) {
            System.out.println("LL is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse Linked List
    private static Node reverseLL(Node head) {
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static void main(String[] args) {

        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(3);

        head = reverseLL(head);

        printll(head);
    }
}