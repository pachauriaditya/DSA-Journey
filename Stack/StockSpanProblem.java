/*
   Problem:
   Stock Span Problem

   Find span of stock prices:
   Span[i] = number of consecutive days before i (including i)
             where price <= current price
*/

/*
   Approach:
   Use stack to store indices of previous higher prices.

   Steps:
   1. Push index of first element → span = 1
   2. For each element:
        - Pop elements while current price > price at stack top
        - If stack empty → span = i + 1
        - Else → span = i - index of previous higher element
        - Push current index into stack
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

public class StockSpanProblem {
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }
    }
}
