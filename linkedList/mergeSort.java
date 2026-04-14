// Problem: Merge Sort on Linked List
// Approach: Use divide and conquer — find middle using slow-fast pointer, recursively sort left and right halves, then merge both sorted lists
// Time Complexity: O(n log n)
// Space Complexity: O(log n) (recursive stack)

public class mergeSort {
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
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1 step
            fast = fast.next.next; // +2 steps
        }
        return slow; // slow is our middleNode
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node MergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = MergeSort(head);
        Node newRight = MergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    // helper to print LL
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        mergeSort list = new mergeSort();

        head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        print(head);

        head = list.MergeSort(head);

        print(head);
    }
}
