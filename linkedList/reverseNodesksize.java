public class reverseNodesksize {
    public static class Node{
        int data ;
         Node next;
         public Node(int data){
            this.data = data ;
            this.next = null;
         }
    }

    private static Node reverse(Node temp){
        if( temp == null || temp.next == null){
            return temp;
        }
        Node prev = null;
        while( temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    private static Node getkthNode(Node temp , int k){
        k = k - 1;
        while( temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;
    }

    private static Node reverseNodeofKsize(Node  head , int k){
        Node temp = head;
        Node prevLast = null;

        while( temp != null){
            Node kthNode = getkthNode(temp, k);
            if( kthNode == null){
                if(prevLast != null){
                    prevLast.next = temp;
                    break;
                }
            }

            Node nextNode = kthNode.next;
            kthNode.next = null;
            reverse(temp);

            if( temp == head){
                head = kthNode;
            }else{
                prevLast.next = kthNode;
            }
            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }
    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        System.out.print("Original: ");
        print(head);

        head = reverseNodeofKsize(head, 3);

        System.out.print("Reversed: ");
        print(head);
    }
}
