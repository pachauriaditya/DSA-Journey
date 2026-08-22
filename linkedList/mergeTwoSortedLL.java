public class mergeTwoSortedLL {
    public static class Node{
        int data;
        Node next;

        public Node( int data){
            this.data = data;
            this.next = null;
        }
    }

    private static Node mergedLL(Node head1 , Node head2){
        Node t1 = head1;
        Node t2 = head2;

        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        while (t1 != null && t2 != null ) {
            if(t1.data < t2.data){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1 != null){
            temp.next = t1;
        }else{
            temp.next = t2;
        }
        return dummyNode.next;
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

        // List 1: 1 -> 3 -> 5
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        // List 2: 2 -> 4 -> 6
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        Node mergedHead = mergedLL(head1, head2);

        System.out.println("Merged Linked List:");
        printLL(mergedHead);
    }
}

