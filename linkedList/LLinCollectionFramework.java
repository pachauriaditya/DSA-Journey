import java.util.LinkedList;

public class LLinCollectionFramework {
    public static void main(String[] args) {
        // create a linked list
        LinkedList<Integer> ll = new LinkedList<>();

        // add elements
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println(ll);

        // remove elements
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
    }

}
