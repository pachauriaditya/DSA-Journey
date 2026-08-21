package linkedList;

public class findLengthOfLoop {

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

    private static int findLength(Node slow, Node fast) {
        int count = 1;
        fast = fast.next;

        while (slow != fast) {
            count++;
            fast = fast.next;
        }

        return count;
    }

    private static int lengthofLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return findLength(slow, fast);
            }
        }

        return 0;
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

        System.out.println("Length of Loop: " + lengthofLoop(head));
    }
}