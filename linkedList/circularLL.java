// Problem: Circular Linked List (Insertion, Deletion, Print)
// Approach: Maintain head and tail pointers such that tail.next always points to head. 
// In insertion, update tail and link it back to head.
// In deletion, adjust head/tail carefully while preserving circular structure.
// Print using do-while loop until we reach head again.
// Time Complexity: O(n) for print & deleteLast, O(1) for insert & deleteFirst
// Space Complexity: O(1)
public class circularLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    // insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    // delete first
    public void deleteFirst() {
        if (head == null)
            return;

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        tail.next = head;
    }

    // delete last
    public void deleteLast() {
        if (head == null)
            return;

        if (head == tail) {
            head = tail = null;
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = head;
        tail = temp;
    }

    // print list
    public void print() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(head)");
    }

    public static void main(String[] args) {
        circularLL cll = new circularLL();

        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);

        cll.print();

        cll.deleteFirst();
        cll.print();

        cll.deleteLast();
        cll.print();
    }
}
