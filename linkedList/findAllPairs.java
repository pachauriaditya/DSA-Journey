import java.util.ArrayList;

public class findAllPairs {

    public static class Node {
        int data;
        Node next, prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private static Node findTail(Node head) {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    private static ArrayList<ArrayList<Integer>> findPairs(Node head, int sum) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if (head == null) return ans;

        Node left = head;
        Node right = findTail(head);

        while (left != right && right.next != left) {

            int value = left.data + right.data;

            if (value == sum) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                ans.add(pair);

                left = left.next;
                right = right.prev;

            } else if (value < sum) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(9);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        fourth.next = fifth;
        fifth.prev = fourth;

        ArrayList<ArrayList<Integer>> ans = findPairs(head, 5);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i).get(0) + " " + ans.get(i).get(1));
        }
    }
}