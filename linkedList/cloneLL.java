public class cloneLL{
    public static class Node{
        int data;
         Node next;
         Node random;

         public Node(int data){
            this.data = data;
            this.next = null;
            this.random = null;
         }
    }

    private static void insertCopyInBetween(Node head){
        Node temp = head;
        while (temp != null) {
            Node nextElement = temp.next;
            Node copy = new Node(temp.data);
            
            copy.next = nextElement;
            temp.next = copy;
            temp = nextElement;
        }
    }

    private static void connectRandomPointers(Node head){
        Node temp = head;
        while ( temp != null) {
            Node copyNode = temp.next;

            if( temp.random != null){
                copyNode.random = temp.random.next;
            }else{
                copyNode.random = null;
            }
            temp = temp.next.next;
        }
    }

    private static Node getDeepCopyList(Node head){
        Node temp = head;
        Node dummyNode = new Node(-1);
        Node res = dummyNode;

        while( temp != null){
            res.next = temp.next;
            res = res.next;

            temp.next = temp.next.next;
            temp = temp.next;
        }
        return dummyNode.next;
    }
    private static Node cloneLL( Node head){
        if( head == null) return null;
        insertCopyInBetween(head);
        connectRandomPointers(head);
        return getDeepCopyList(head);
    }

     private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            int randomData = (temp.random != null) ? temp.random.data : -1;
            System.out.println("Node: " + temp.data + "  Random: " + randomData);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Random pointers
        head.random = head.next.next;          // 1 -> 3
        head.next.random = head;               // 2 -> 1
        head.next.next.random = head.next.next.next; // 3 -> 4
        head.next.next.next.random = head.next;      // 4 -> 2

        System.out.println("Original List:");
        printList(head);

        Node clonedHead = cloneLL(head);

        System.out.println("\nCloned List:");
        printList(clonedHead);
    }
}

