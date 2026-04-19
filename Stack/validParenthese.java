/*
   Problem:
   Valid Parentheses

   Check if the given string has valid matching brackets:
   (), {}, []
*/

/*
   Approach:
   Use stack

   Steps:
   1. Traverse each character:
        - If opening bracket → push into stack
        - If closing bracket:
            → If stack empty → invalid
            → If top matches → pop
            → Else → invalid
   2. After traversal:
        - If stack empty → valid
        - Else → invalid
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

import java.util.Stack;

public class validParenthese {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '[' && ch == ']')
                        || (s.peek() == '{' && ch == '}')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(isValid(str));
    }
}
