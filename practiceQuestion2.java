/* 
     Delete N Nodes After M Nodes of a Linked List :
          We have a linked list and two integers M and N. Traverse the linked list such that you 
          retain M nodes then delete next N nodes, continue the same till end of the linked list.  
          Sample Input 1 : M=2 N=2 LL: 1->2->3->4->5->6->7->8 
          Sample Output 1 : 1->2->5->6 
*/

/*
  Approad : 
       1. Start from the head of the linked list.
       2. Use a pointer curr to traverse the list.
       3. While curr is not null:
             ~Move curr forward by M−1 nodes (to reach Mth node).
             ~If curr becomes null, stop.
             ~Store temp = curr.next.
             ~Move temp forward by N nodes (these nodes will be deleted).
             ~Link curr.next = temp.
             ~Move curr = temp and repeat.
*/

public class practiceQuestion2 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteMafterN(Node head, int M, int N) {
        if (head == null)
            return null;

        Node curr = head;

        while (curr != null) {
            // skip M nodes
            for (int i = 1; i < M && curr != null; i++) {
                curr = curr.next;
            }
            if (curr == null)
                break;

            // delete next N nodes
            Node temp = curr.next;
            for (int i = 1; i <= N && temp != null; i++) {
                temp = temp.next;
            }
            // link Mth node with M+N+1 nodes
            curr.next = temp;

            // move curr head
            curr = temp;
        }
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("Null");
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

        head = deleteMafterN(head, 2, 2);
        print(head);
    }
}

/*
 * Complexity:
 * ~ Time Complexity : O(n)
 * b~ Space Complexity : O(1)
 */