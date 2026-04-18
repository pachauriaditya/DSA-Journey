/*
   Problem:
    Implement Stack using Java Collection Framework
*/

/*
    Approach:
      Use Java's built-in Stack (LIFO - Last In First Out)

      ~Push:
        Add element at top → push()

      ~Pop:
        Remove and return top element → pop()

      ~Peek:
        View top element without removing → peek()

      ~isEmpty:
        Check if stack is empty → isEmpty()
*/

/*
    Time Complexity:
        ~push: O(1)
        ~pop: O(1)
        ~peek: O(1)
        ~isEmpty: O(1)
*/

/*
    Space Complexity:
        ~O(n)
*/

package Stack;

import java.util.*;

public class stackUsingCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
