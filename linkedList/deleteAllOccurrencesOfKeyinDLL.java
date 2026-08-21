package linkedList;

public class deleteAllOccurrencesOfKeyinDLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data , Node next , Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private static Node deleteAllOccur(Node head , int key){
        Node temp = head;

        while( temp != null){
            if( temp.data == key){
                //if this is the head of the LL
                //Then post deletion of the head will be updated
                if( temp == head){
                    head = head.next;
                }
                Node nextNode = temp.next;
                Node prevNode = temp.prev;

                if( nextNode != null){
                    nextNode.prev = prevNode;
                }
                if(prevNode != null){
                    prevNode.next = nextNode;
                }

                temp = nextNode;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }

    private static void print(Node head) {
    Node temp = head;

    while (temp != null) {
        System.out.print(temp.data + " <-> ");
        temp = temp.next;
    }

    System.out.println("null");
}
    public static void main(String[] args) {
         Node head = new Node(10);
         Node second = new Node(20);
         Node third = new Node(10);
         Node fourth = new Node(30);
         Node fifth = new Node(10);
         Node sixth = new Node(40);

         head.next = second;
         second.prev = head;

         second.next = third;
         third.prev = second;

         third.next = fourth;
         fourth.prev = third;

         fourth.next = fifth;
         fifth.prev = fourth;
         fifth.next = sixth;
         sixth.prev = fifth;

        System.out.println("Original DLL:");
    print(head);

    head = deleteAllOccur(head, 10);

    System.out.println("After Deletion:");
    print(head);
    }
}
