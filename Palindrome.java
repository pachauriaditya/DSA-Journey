// Problem: Palindrome Linked List
// Approach: Find middle + Reverse second half + Compare
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Palindrome {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // Print Linked List
    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse Linked List
    private static Node reverseLL(Node head) {
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    // Check Palindrome
    private static boolean isPalindrome(Node head) {

        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newHead = reverseLL(slow.next);

        Node first = head;
        Node second = newHead;

        while (second != null) {
            if (first.data != second.data) {
                slow.next = reverseLL(newHead); // Restore list
                return false;
            }
            first = first.next;
            second = second.next;
        }

        slow.next = reverseLL(newHead); // Restore list
        return true;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        print(head);

        System.out.println(isPalindrome(head));

        print(head); // List remains unchanged
    }
}