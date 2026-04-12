import java.util.*;

public class printNumInIncreasingOrder {

    public static void printInc(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInc(n);
    }
}

/*
 * Problem Name: Print Numbers in Increasing Order (Recursion)
 * 
 * Approach:
 * - First go till base case using recursion (n-1).
 * - Then print while returning back.
 * - Base case: when n == 1, print and stop recursion.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) (recursion stack)
 */