// Problem: Search an element in Linked List (Recursive)
// Approach: Recursively traverse each node and compare data with key
// Time Complexity: O(n)
// Space Complexity: O(n) -> recursion stack space
public class recursiveSearch {

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

    // recursive search helper
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);

        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        recursiveSearch ll = new recursiveSearch();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.printll(); // 3 -> 2 -> 1 -> null

        System.out.println(ll.recSearch(2));
    }
}