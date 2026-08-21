package linkedList;

public class deleteMidNode {
    public static class Node{
        int data ;
        Node next;

        public Node(int data , Node next){
            this.data = data;
            this.next = next;
        }
         public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }   

    private static Node deleteMiddle(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;

        fast = fast.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    private static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

        public static void main(String[] args) {

    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);
    head.next.next.next.next = new Node(50);
    head.next.next.next.next.next = new Node(60);
    head.next.next.next.next.next.next = new Node(70);

    head = deleteMiddle(head);
    print(head);
}
}
