package linkedList;

 // Problem: Find First Node of Cycle in Linked List
// LeetCode 142
// Approach: Floyd's Cycle Detection Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

public class firstNodeOfCycle {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
         public Node(int data , Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private static Node detectCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
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

        Node startNode = detectCycle(head);

        if (startNode != null) {
            System.out.println("First Node of Cycle: " + startNode.data);
        } else {
            System.out.println("No Cycle");
        }
    }
} 
    
