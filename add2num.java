public class add2num {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private static Node addTwoNum(Node num1, Node num2) {

        Node dummyHead = new Node(-1);
        Node curr = dummyHead;

        Node temp1 = num1;
        Node temp2 = num2;

        int carry = 0;

        while (temp1 != null || temp2 != null) {

            int sum = carry;

            if (temp1 != null) {
                sum += temp1.data;
            }

            if (temp2 != null) {
                sum += temp2.data;
            }

            Node newNode = new Node(sum % 10);
            carry = sum / 10;

            curr.next = newNode;
            curr = curr.next;

            if (temp1 != null) {
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                temp2 = temp2.next;
            }
        }

        if (carry != 0) {
            Node newNode = new Node(carry);
            curr.next = newNode;
        }

        return dummyHead.next;
    }
    public static void main(String[] args) {

    Node num1 = new Node(2);
    num1.next = new Node(4);
    num1.next.next = new Node(3);

    Node num2 = new Node(5);
    num2.next = new Node(6);
    num2.next.next = new Node(4);

    Node result = addTwoNum(num1, num2);

    Node temp = result;

    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}
}