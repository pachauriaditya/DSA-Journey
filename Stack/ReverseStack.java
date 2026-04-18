/*
   Problem:
   Reverse a stack using recursion
*/

/*
   Approach:
   1. Remove top element from stack
   2. Recursively reverse remaining stack
   3. Insert removed element at bottom

   Helper Function (pushAtBottom):
   - If stack is empty → push element
   - Else:
        pop top
        call recursively
        push back popped element
*/

/*
   Time Complexity:
   O(n^2) → for each element, pushAtBottom takes O(n)
*/

/*
   Space Complexity:
   O(n) → recursion stack
*/

package Stack;

import java.util.Stack;

public class ReverseStack {

    // Push element at bottom using recursion
    public static void pushatBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushatBottom(s, data);
        s.push(top);
    }

    // Reverse stack using recursion
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop(); // remove top
        reverseStack(s); // reverse remaining stack
        pushatBottom(s, top); // insert at bottom
    }

    // Print stack (this will empty the stack)
    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);// 5,4,3,2,1
        reverseStack(s);
        printStack(s);// 1,2,3,4,5
    }
}