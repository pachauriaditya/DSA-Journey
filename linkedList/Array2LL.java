public class Array2LL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node convertArr2LL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }
    private static int length(Node head){
        int count = 0;
        Node temp = head;
        while( temp != null){
            temp = temp.next;
            count++;
        }
        return count;

    }

    private static int checkifPresent(Node head, int value){
        Node temp = head;
        while (temp != null) {
            if(temp.data == value){
                return 1;
            } 
                temp = temp.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        Node head = convertArr2LL(arr);
        System.out.println(head.data);
        Node temp = head;
        while( temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("Length of linked list: " + length(head));
        int valueToCheck = 8;
        int isPresent = checkifPresent(head, valueToCheck);
        System.out.println("Is " + valueToCheck + " present in the linked list? " + (isPresent == 1 ? "Yes" : "No"));
    }
}