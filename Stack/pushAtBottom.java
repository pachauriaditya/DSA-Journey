/*
   Problem:
   Insert an element at the bottom of a stack using Java Collection Framework
*/

/*
   Approach:
   Use recursion to reach the bottom of the stack.

   Steps:
   1. If stack is empty → push the new element (this becomes bottom).
   2. Otherwise:
        - Pop the top element
        - Recursively call function
        - Push the popped element back

   This way, the new element goes to the bottom and order is preserved.
*/

/*
   Time Complexity:
   O(n) → we traverse all elements once
*/

/*
   Space Complexity:
   O(n) → due to recursion stack
*/

package Stack;

import java.util.*;

public class pushAtBottom {
    public static void pushatBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushatBottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
