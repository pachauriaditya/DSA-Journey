/*
   Problem:
   Largest Rectangle in Histogram

   Given an array of bar heights, find the maximum rectangular area
   that can be formed in the histogram.
*/

/*
   Approach:
   Use Next Smaller Left (NSL) and Next Smaller Right (NSR)

   Idea:
   For every bar, assume it is the smallest height of a rectangle.
   Then expand left and right until a smaller bar is found.

   Steps:
   1. Find NSR (Next Smaller Right):
        - Traverse from right to left
        - Pop elements from stack while they are >= current element
        - If stack is empty → no smaller element → nsr[i] = n
        - Else → nsr[i] = index at stack top

   2. Find NSL (Next Smaller Left):
        - Traverse from left to right
        - Pop elements from stack while they are >= current element
        - If stack is empty → no smaller element → nsl[i] = -1
        - Else → nsl[i] = index at stack top

   3. Calculate Area:
        - width = nsr[i] - nsl[i] - 1
        - area = height[i] * width
        - Track maximum area

*/

/*
   Time Complexity:
   O(n) → each element is pushed and popped at most once

   Space Complexity:
   O(n) → stack + NSL and NSR arrays
*/

package Stack;

import java.util.Stack;

public class maxAreaInHistogram {
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length]; // next smaller right
        int nsl[] = new int[arr.length]; // next smaller left

        // next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("Max area in histogram is :" + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 }; // heights of bars
        maxArea(arr);
    }
}
