/*
    Swap Nodes in a Linked List:
        Write a program to swap two nodes in a linked list without swapping data.
        Sample Input 1 : 1->2->3->4->5->6->7->8 M=2 N=2 
        Sample Output 1 : 1->2->5->6 
*/

/*
  Approach :
       1.Traverse the linked list and find the two nodes having values x and y.
       2.Keep track of their previous nodes: 
          ~prevX, currX
          ~prevY, currY
       3.If either node is not found → return head.
       4.Update previous node links:
          ~If prevX != null → prevX.next = currY, else update head = currY
          ~If prevY != null → prevY.next = currX, else update head = currX
       5.Swap the next pointers of both nodes.
       6.Return updated head.
*/

public class practiceQuestion3 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node swapNodes(Node head, int x, int y) {
        if (x == y) {
            return head;
        }

        Node prevX = null;
        Node currX = head;
        Node prevY = null;
        Node currY = head;

        // find x
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        // find y
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // if either nor found
        if (currX == null || currY == null) {
            return head;
        }

        // if x is not found
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        // if y is not found
        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        // swapping next pointer
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

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
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(12);
        head.next.next.next = new Node(13);
        head.next.next.next.next = new Node(20);
        head.next.next.next.next.next = new Node(14);

        System.out.println("Original list:");
        print(head);

        head = swapNodes(head, 12, 20);

        System.out.println("List after swapping 12 and 20:");
        print(head);
    }
}

/*
 * Complexity:
 * ~ Time Complexity : O(n)
 * ~ Space Complexity : O(1)
 */