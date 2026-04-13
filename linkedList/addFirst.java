// Problem: Add First in Linked List
// Approach: Insert new node at head
// Time Complexity: O(1)
// Space Complexity: O(1)

public class addFirst {

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
        addFirst ll = new addFirst();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.printll(); // 3 -> 2 -> 1 -> null
    }
}