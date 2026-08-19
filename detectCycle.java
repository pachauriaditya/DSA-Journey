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
    // detecting a cycle in ll
    // floyd's cycle detecting algorithm

    private static boolean isCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if( slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        // Create cycle: 8 → 4
        n8.next = n4;

        System.out.println(isCycle(head));
    }
}

