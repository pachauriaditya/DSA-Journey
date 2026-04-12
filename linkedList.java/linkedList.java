// add data in linked list and then print the linked list
public class linkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add node by add first
    public void addFirst(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 = newNode = head
        newNode.next = head;
        // step 3 = head = newNode
        head = newNode;
    }

    // add node by add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // print a linked list
    public void printll() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add node in the middle of the linked list
    public void addMiddle(int indx, int data) {
        if (indx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < indx - 1) {
            temp = temp.next;
            i++;
        }
        // i = indx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove the node
    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove the node
    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : indx = size -2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // searching of element using iterative search
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // search of element using recurive method
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        if (indx == -1) {
            return -1;
        }
        return indx + 1;

    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // reverse a linked list
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // find and remove Nth node from end
    public void deleteNthFromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next; // remove first or head
            return;
        }

        // size -n -> node tp delete se just phle wala index
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // check if LL is a Palindrome
    // step 1: find the middle of LL (Slow-Fast Approach)
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1 step
            fast = fast.next.next; // +2 steps
        }
        return slow; // slow is our middleNode
    }

    public boolean checkPalindrome() {
        if (head == null || head.next != null) {
            return true;
        }
        // step 1 : find mid
        Node midNode = findMid(head);

        // step 2: reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head; // left half head

        // step 3: check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.printll();
        ll.addFirst(1);
        // ll.printll();
        ll.addFirst(2);
        // ll.printll();
        ll.addLast(2);
        // ll.printll();
        ll.addLast(1);
        // ll.addMiddle(2, 9);
        ll.printll();
        // System.out.println("Size of ll is: " + ll.size);
        // ll.removeFirst();
        // ll.printll();
        // ll.removeLast();
        // ll.printll();
        // System.out.println(ll.size);

        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.itrSearch(10));
        // ll.printll();
        // ll.reverse();
        // ll.printll();
        // ll.deleteNthFromEnd(2);
        // ll.printll();

        System.out.println(ll.checkPalindrome());
    }

}
