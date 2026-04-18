/*
   Problem:
   Next Greater Element (Right Side)

   For each element, find the next greater element on its right.
   If none exists → return -1
*/

/*
   Approach:
   Traverse from right to left using stack.

   Stack stores indices of elements.

   Steps:
   1. Start from last element
   2. For each element:
        - Pop elements from stack while they are <= current element
        - If stack empty → no greater element → -1
        - Else → top of stack is next greater
   3. Push current index into stack
*/

/*
   Time Complexity:
   O(n) → each element pushed & popped once
*/

/*
   Space Complexity:
   O(n)
*/

package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}

/*
 * Base Code: Next Greater Element on RIGHT (NGR)
 * 
 * Apply these small changes to get other variations
 */

/*
 * Next Greater Element on LEFT (NGL)
 * 
 * Changes:
 * - Change loop direction:
 * from → (n-1 to 0)
 * to → (0 to n-1)
 * 
 * - Condition remains SAME:
 * while (!s.isEmpty() && s.peek() <= arr[i])
 * 
 * - Rest of the code remains same
 */

/*
 * Next Smaller Element on RIGHT (NSR)
 * 
 * Changes:
 * - Loop remains SAME (right → left)
 * 
 * - Change condition:
 * while (!s.isEmpty() && s.peek() >= arr[i])
 * 
 * - Rest of the code remains same
 */

/*
 * Next Smaller Element on LEFT (NSL)
 * 
 * Changes:
 * - Change loop direction:
 * from → (n-1 to 0)
 * to → (0 to n-1)
 * 
 * - Condition:
 * while (!s.isEmpty() && s.peek() >= arr[i])
 * 
 * - Rest of the code remains same
 */

/*
 * Shortcut:
 * - LEFT → loop (0 → n-1)
 * - RIGHT → loop (n-1 → 0)
 * 
 * - GREATER → pop <=
 * - SMALLER → pop >=
 */