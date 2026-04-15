/*
    In a system there are two singly linked list. By some programming error, the end node of 
    one of the linked lists got linked to the second list, forming an inverted Y-shaped list.
    Write  a program to get the point where two linked lists merge.
    We have to find the intersection part in this system. 
*/

/*
   Approach : 1. Take two pointers
                 Pointer a → starts from headA
                 Pointer b → starts from headB
              2. Move both one step at a time
              3. If any pointer becomes null
                 Redirect a → headB
                 Redirect b → headA
              4. Continue this process
                  Until a == b
              5. Result
                 If they meet at a node → that is the intersection point
                 If they meet at null → no intersection
*/

public class practiceQuestion1 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node getIntersection(Node headA, Node headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Node a = headA;
        Node b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a; // intersection node or null
    }

    public static void main(String[] args) {

        // Common part (tail)
        Node common = new Node(4);
        common.next = new Node(5);

        // List A
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = common; // attach

        // List B
        Node headB = new Node(6);
        headB.next = new Node(7);
        headB.next.next = common; // attach SAME nodes

        Node intersection = getIntersection(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection at node: " + intersection.data);
        } else {
            System.out.println("No intersection");
        }
    }
}

/*
 * Complexity:
 * ~ Time Complexity : O(n + m)
 * ~ Space Complexity : O(1)
 */