public class deleteNthFromEnd {

    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node deleteNth(Node head , int k){
        Node fast = head;
        Node slow = head;
        for( int i = 0 ; i < k ; i++){
            fast = fast.next;
        }
        if( fast == null){
            return head.next;
        }

        while( fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        Node delNode = slow.next;
        slow.next = slow.next.next;
        return head;
    }
    private static void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original LL:");
        printLL(head);

        head = deleteNth(head, 2);

        System.out.println("After Deletion:");
        printLL(head);
    }
}