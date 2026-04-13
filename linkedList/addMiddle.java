// Problem: Insert a node at a given position in Linked List
// Approach: Traverse to (index - 1) and adjust pointers
// Time Complexity: O(n)
// Space Complexity: O(1)
public class addMiddle {

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

    // add node by add first
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

    // add node in the middle
    public void addMiddle(int indx, int data) {

        // ✅ IMPORTANT FIX
        if (head == null || indx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while (i < indx - 1 && temp.next != null) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
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
        addMiddle ll = new addMiddle();

        ll.addMiddle(0, 1);
        ll.addMiddle(1, 2);
        ll.addMiddle(2, 3);

        ll.printll(); // 1 -> 2 -> 3 -> null
    }
}