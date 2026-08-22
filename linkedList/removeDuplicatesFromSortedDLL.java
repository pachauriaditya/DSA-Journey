public class removeDuplicatesFromSortedDLL {
    public static class  Node {
        int data ;
        Node next , prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private static Node removeDuplNode(Node head){
        Node temp = head;
        while (temp != null && temp.next != null) {
            Node nextNode = temp.next;
            while (nextNode != null && nextNode.data == temp.data) {
                nextNode = nextNode.next;
            }
            temp.next = nextNode;

            if( nextNode != null){
                nextNode.prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }

    private static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node n2 = new Node(1);
        Node n3 = new Node(2);
        Node n4 = new Node(3);
        Node n5 = new Node(3);
        Node n6 = new Node(4);
        Node n7 = new Node(4);
        Node n8 = new Node(5);

        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = n5;
        n5.prev = n4;
        n5.next = n6;
        n6.prev = n5;
        n6.next = n7;
        n7.prev = n6;
        n7.next = n8;
        n8.prev = n7;

        head = removeDuplNode(head);

        print(head);
    }
}
    

