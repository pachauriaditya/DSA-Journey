/*
    Odd Even Linked List: 
   We have a Linked List of integers, write a function to modify the linked list such that all 
   even numbers appear before all the odd numbers in the modified linked list. Also, keep the 
   order of even and odd numbers same. 
           Sample Input 1 : 8->12->10->5->4->1->6->NULL 
           Sample Output 1 : 8->12->10->4->6->5->1->NULL 
           Sample Input 2 : 1->3->5->7->NULL 
           Sample Output 2 : 1->3->5->7->NULL 
*/

/*
  Approach : 
       1. Traverse the linked list once.
       2. Create two separate lists:
            ~Even list (for even nodes)
            ~Odd list (for odd nodes)
       3. Maintain pointers:
            ~evenStart, evenEnd
            ~oddStart, oddEnd
       4. For each node:
            ~If value is even → attach to even list
            ~If value is odd → attach to odd list
       5. After traversal:
            ~If even list is empty → return odd list
            ~If odd list is empty → return even list
            ~Otherwise connect:
                ~evenEnd.next = oddStart
                ~oddEnd.next = null
                ~Return evenStart
*/
public class practiceQuestion4 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node oddEven(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node evenStart = null, evenEnd = null;
        Node oddStart = null, oddEnd = null;

        Node curr = head;

        while (curr != null) {
            if (curr.data % 2 == 0) {
                if (evenStart == null) {
                    evenStart = evenEnd = curr;
                } else {
                    evenEnd.next = curr;
                    evenEnd = curr;
                }
            } else {
                if (oddStart == null) {
                    oddStart = oddEnd = curr;
                } else {
                    oddEnd.next = curr;
                    oddEnd = curr;
                }
            }
            curr = curr.next;
        }
        // if no even nodes
        if (evenStart == null)
            return oddStart;

        // if no odd nodes
        if (oddStart == null)
            return evenStart;

        // join even and odd lists
        evenEnd.next = oddStart;
        oddEnd.next = null;

        return evenStart;
    }

    // print list
    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println("Original list:");
        print(head);

        head = oddEven(head);

        System.out.println("List after rearranging:");
        print(head);
    }
}

/*
 * Complexity:
 * ~ Time Complexity : O(n)
 * ~ Space Complexity : O(1)
 */