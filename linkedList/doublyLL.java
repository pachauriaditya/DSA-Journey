public class doublyLL{
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

    private static  Node arr2DLL(int arr[]){
        Node head = new Node(arr[0]);  // Node head = new Node(arr[0], null , null) ----> we didn't use this cuz the value of next and prev are already null in the second constructor 
                                       // and we can also use it , referencing the first constructor
        Node prev = head;

        for( int i = 1 ; i < arr.length ; i++){
            Node temp = new Node(arr[i], null , prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void print(Node head){
        while (head != null) {
            System.out.print(head.data + "<->");
            head = head.next;
        }
        System.out.println("null");
    }
    
    private static Node removeHead(Node head){
        if( head == null || head.next == null){
            return null;
        }
        Node prev = head;
        head = head.next;
        head.prev = null;
        prev.next = null;
        return head;
    }

    private static Node removetail( Node head){
        if( head == null || head.next == null){
            return null;
        }

        Node tail = head;
        while( tail.next != null ){
            tail = tail.next;
        }
        Node newTail = tail.prev;
        newTail.next = null;
        tail.prev = null;
        
        return head;
    }

    private static Node removeatK(Node head , int k){

        if( head == null){
            return null;
        }

        Node temp = head;
        int count = 0;

        while( temp != null){
            count++;
            if( count == k){
                break;
            }
            temp = temp.next;
        }
        Node back = temp.prev;
        Node front = temp.next;

        if( back == null && front == null){
          return null;
        }
        else if( back == null){
            return removeHead(head);
        }
        else if( front == null){
            return removetail(head);
        }
        back.next = front;
        front.prev = back;
        temp.next = null;
        temp.prev = null;

        return head;
    }

    private static void deleteNode(Node temp) {

    Node back = temp.next;
    Node front = temp.prev;

    if (front == null) {
        back.prev = null;
        temp.next = null;
        return;
    }

    if (back == null) {
        front.next = null;
        temp.prev = null;
        return;
    }

    back.prev = front;
    front.next = back;

    temp.next = null;
    temp.prev = null;
}
   

    private static Node addBeforeHead(Node head , int val){
        Node newHead = new Node(val,head , null);
        head.prev = newHead;
        return newHead;
    }

   private static Node addAfterHead(Node head , int val){
        Node newNode = new Node(val);
        
        newNode.next = head.next;
        newNode.prev = head;
        
        if(head.next != null){
            head.next.prev = newNode;
        }
        head.next = newNode;

        return head;
    }

    private static Node addBeforeTail(Node head, int val){
       if(head.next == null){
        return addBeforeHead(head, val);
       }
        Node tail = head;
        while( tail.next != null){
            tail = tail.next;
        }
        Node back = tail.prev;

        Node newNode = new Node(val , tail,back);
        back.next = newNode;
        tail.prev = newNode;
        return head;
    }

    private static Node addAfterTail(Node head , int val){
        if( head == null){
              return new Node(val);
        }

        Node tail = head;

        while( tail.next != null){
            tail = tail.next;
        }

        Node newNode = new Node(val);
        newNode.prev = tail;
        newNode.next = null;

        tail.next = newNode;

        return head;
    }

    private static Node addBeforeK(Node head , int k , int val){
        if(k == 1){
            return addBeforeHead(head, val);
        }
        Node temp = head;
        int count = 0;

        while( temp != null){
            count++;
            if( count == k)
                break;

            temp = temp.next;
        }
            Node back = temp.prev;
            Node newNode = new Node(val,temp,back);
            back.next = newNode;
            temp.prev = newNode;

            return head;
        
    }

    private static void addbeforeNode(Node node , int val){
        Node back = node.prev;
        Node newNode = new Node(val, node , back);
        back.next = newNode;
        node.prev = newNode;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5,6,7};
        Node head = arr2DLL(arr);
        print(head);
        head = removeHead(head);
        print(head);

        head = removetail(head);
        print(head);

        head = removeatK(head,2);
        print(head);

        Node temp = head.next;
        deleteNode(temp);
        print(head);
        head = addBeforeHead(head, 10);
        print(head);
        head = addAfterHead(head, 21);
        print(head);

        head = addBeforeTail(head, 12);
        print(head);

        head = addAfterTail(head, 8);
        print(head);
        head = addBeforeK(head, 2, 22);
        print(head);

        addbeforeNode(head.next, 100);
        print(head);
    }
}