public class rotateLL {
    public static class Node{
        int data; 
        Node next ;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private static Node findNthNode(Node temp , int k){
        int count = 1;
        while (temp != null) {
            if( count == k) return temp;
            count++;
            temp = temp.next;
        }
        return temp;
    }

    private static Node rotated(Node head , int k){
        if( head == null || head.next != null || k == 0 ) return head;

        Node tail = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len +=1;
        }

        if( k % len == 0) return head;

        k = k % len;

        tail.next = head;
        Node newTail = findNthNode(head, len-k);

        head = newTail.next;
        newTail.next = null;

        return head;
    }

    private static void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printLL(head);

        int k = 2;

        head = rotated(head, k);

        System.out.println("After rotating by " + k + " places:");
        printLL(head);
    }
}

