// Problem: Delete Nth Node From End of Linked List
// Approach: First find size, then locate (size-n)th node and delete it
// Time Complexity: O(n)
// Space Complexity: O(1)

public class deleteNthFromEnd {

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

    // delete Nth node from end
    public void deleteNthFromEnd(int n) {
        int sz = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;
            return;
        }

        int iToFind = sz - n;
        Node prev = head;
        int i = 1;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
    }

    public static void main(String[] args) {
        deleteNthFromEnd ll = new deleteNthFromEnd();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.printll(); // 3 -> 2 -> 1 -> null

        ll.deleteNthFromEnd(2);

        ll.printll(); // 3 -> 1 -> null
    }
}