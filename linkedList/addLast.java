// Problem: Add Last in Linked List
// Approach: Insert node at tail using tail pointer
// Time Complexity: O(1)
// Space Complexity: O(1)

public class addLast {

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

    // add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        // if list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // attach at end
        tail.next = newNode;
        tail = newNode;
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
        addLast ll = new addLast();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);

        ll.printll(); // 1 -> 2 -> 3 -> null
    }
}