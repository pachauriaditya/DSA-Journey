public class mergeSort{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data  = data;
            this.next  = null;
        }
    }

    private static Node findMidNode(Node head){
        Node slow = head;
        Node  fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node mergeTwoSortedLL(Node list1 , Node list2){
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        while ( list1 != null && list2 != null) {
            if( list1.data < list2.data){
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }

        if(list1 != null){
            temp.next = list1;
        }else{
            temp.next = list2;
        }
        return dummyNode.next;
    }

    private static Node sortLL(Node head){
        if( head == null || head.next == null) return head;

        Node middle = findMidNode(head);
        Node  right = middle.next;
        middle.next = null;
        Node left = head;

        left = sortLL(left);
        right = sortLL(right);
        return mergeTwoSortedLL(right, left);
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

        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printLL(head);

        head = sortLL(head);

        System.out.println("Sorted Linked List:");
        printLL(head);
    }
}