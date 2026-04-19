/*
   Problem:
   Duplicate Parentheses

   Check if expression contains duplicate brackets
   Example:
   ((a+b)) → true (duplicate)
   (a+b)   → false
*/

/*
   Approach:
   Use stack

   Steps:
   1. Traverse string:
        - Push every character into stack
   2. When ')' is found:
        - Count elements until '(' is found
        - If count < 1 → duplicate brackets
        - Else → normal case
*/

/*
   Time Complexity:
   O(n)
*/

/*
   Space Complexity:
   O(n)
*/

package Stack;

import java.util.*;

public class duplicateParentheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate found
                }
            } else {
                s.push(ch); // opnening bracket
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(isDuplicate(str));
        String str2 = "(a+b)";
        System.out.println(isDuplicate(str2));
    }
}
