// Problem: Implementation of Doubly Linked List (Insertion & Deletion)
// Approach: Maintain prev and next pointers, perform operations (add/remove) at beginning, end, and middle using pointer manipulation
// Time Complexity: O(1) for addFirst/addLast/removeFirst/removeLast, O(n) for addMiddle/removeMiddle
// Space Complexity: O(1)

public class doublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    // add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    // add middle
    public void addMiddle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        newNode.next = slow.next;
        slow.next.prev = newNode;
        slow.next = newNode;
        newNode.prev = slow;
        size++;
    }

    // remove first
    public void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    // remove last
    public void removeLast() {
        if (head == null) {
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    // remove middle
    public void removeMiddle() {
        if (head == null) {
            return;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.prev.next = slow.next;
        slow.next.prev = slow.prev;
        size--;
    }

    // print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        doublyLL dll = new doublyLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addMiddle(5);
        dll.print();
        dll.removeFirst();
        dll.removeLast();
        dll.removeMiddle();
        dll.print();
    }
}
