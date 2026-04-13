// Problem: Check if Linked List is Palindrome
// Approach: Find middle, reverse second half, compare both halves
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

    // find middle (slow-fast)
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // reverse linked list
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // check palindrome
    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // step 1: find middle
        Node mid = findMid(head);

        // step 2: reverse second half
        Node secondHalfStart = reverse(mid.next);

        // break first half
        mid.next = null;

        // step 3: compare both halves
        Node left = head;
        Node right = secondHalfStart;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    // print list
    public void printll() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Palindrome ll = new Palindrome();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.printll();

        System.out.println(ll.checkPalindrome());
    }
}