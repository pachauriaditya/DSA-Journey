// Problem: Detect Cycle in Linked List
// LeetCode 141
// Approach: Floyd's Cycle Detection Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

public class detectCycle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Detects whether a cycle exists
    static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(80);

        // Create cycle: 80 -> 30
        head.next.next.next.next.next.next.next.next = head.next.next;

        if (hasCycle(head)) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }
}