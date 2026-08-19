// Problem: Iterative Search in Linked List
// Approach: Traverse and compare
// Time Complexity: O(n)
// Space Complexity: O(1)

public class iterativeSearch {

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

    // iterative search
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public static void main(String[] args) {
        iterativeSearch ll = new iterativeSearch();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.printll(); // 3 -> 2 -> 1 -> null

        System.out.println(ll.itrSearch(2)); // index
    }
}