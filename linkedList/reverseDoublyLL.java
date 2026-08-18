// Problem: Reverse a Doubly Linked List
// Time Complexity: O(n)
// Space Complexity: O(1)

public class reverseDoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public Node(int data , Node next , Node prev){
            this.data = data;
            this.next = next;           
            this.prev = prev;
        }
    }

    private static Node reverseDLL(Node head){
        if( head == null || head.next == null){
            return head;
        }
        Node prev = null;
        Node curr = head;

        while( curr != null){
            prev = curr.prev;
            curr.prev = curr.next;                                          

            curr.next = prev;

            curr = curr.prev;
        }
        return prev.prev;
    }

    // print
  private static void print(Node head){
        while (head != null) {
            System.out.print(head.data + "<->");
            head = head.next;
        }                                          
        System.out.println("null");                                     
    }

    public static void main(String[] args) {

    Node head = new Node(1);
    Node second = new Node(2, null, head);
    Node third = new Node(3, null, second);
    Node fourth = new Node(4, null,third);

    head.next = second;
    second.next = third;
    third.next = fourth;

    head = reverseDLL(head);
    print(head);
}
}