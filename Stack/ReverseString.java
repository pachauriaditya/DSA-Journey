/*
   Problem:
   Reverse a string using Stack (Java Collection Framework)
*/

/*
   Approach:
   Use stack (LIFO property) to reverse the string.

   Steps:
   1. Traverse the string and push each character into stack.
   2. Pop characters one by one from stack.
   3. Append popped characters to result.
   4. Return the final reversed string.

   Since stack returns elements in reverse order, string gets reversed.
*/

/*
   Time Complexity:
   O(n) → one traversal for push + one for pop
*/

/*
   Space Complexity:
   O(n) → extra stack used
*/

package Stack;

import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "aditya";
        System.out.println(reverseString(str));
    }
}
