public class findMiddleofLL {
    public static class Node{
        int data ;
         Node next;

         public Node( int data , Node next){
            this.data = data;
            this.next = next;
         }

         public Node(int data){
            this.data = data;
            this.next = null;
         }
    }

    private static Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;

        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node temp = head;
        while( temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");

       Node middle =  findMidNode(head);
        System.out.println("Middle Node : " + " " + middle.data);
    }
}


