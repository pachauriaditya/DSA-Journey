/*
   Problem:
    Implement a Stack (LIFO) using ArrayList in Java with basic operations:
       ~push() → insert element
       ~pop() → remove top element
       ~peek() → view top element
       ~isEmpty() → check stack empty
 */

/*
    Approach:
      Use ArrayList as dynamic storage and treat last index as top of stack.
      ~Push:
        Add element at end → list.add(data)
      ~Pop:
        Get last element → list.get(size-1)
        Remove last element → list.remove(size-1)
      ~Peek:
        Return last element without removing
      ~isEmpty:
        Check list.size() == 0
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

import java.util.ArrayList;

public class arrayListUsingStack {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
