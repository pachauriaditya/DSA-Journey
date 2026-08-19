// Problem: Detect Cycle in Linked List
// Approach: Floyd’s Cycle Detection Algorithm (Slow & Fast Pointer)
// Time Complexity: O(n)
// Space Complexity: O(1)
public class detectCycle {

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

    // detecting a cycle in ll
    // floyd's cycle detecting algorithm
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // cycle exists
            }
        }
        return false; // cycle doesn't exists
    }

    public static void main(String[] args) {

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isCycle());
    }

}