// Problem: Zig-Zag Linked List
// Approach: Find middle using slow-fast pointer, reverse second half, then merge both halves alternately
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ZigZag {
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

    // find the middle of LL (Slow-Fast Approach)
    public void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1 step
            fast = fast.next.next; // +2 steps
        }
        Node mid = slow; // slow is our middleNode

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head; // left half head
        Node nextL, nextR;

        // step 3: check left half & right half
        while (left != null && right != null) {
            nextL = left.next;
            nextR = right.next;

            left.next = right;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ZigZag list = new ZigZag();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        print(head);

        list.zigZag();

        print(head);
    }
}
