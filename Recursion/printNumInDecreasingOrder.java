import java.util.*;

public class printNumInDecreasingOrder {

    public static void printDec(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDec(n);
    }
}

/*
Problem Name: Print Numbers in Decreasing Order (Recursion)

Approach:
- Print current number first.
- Then recursively call function for n-1.
- Base case: when n == 1, print and stop recursion.

Time Complexity: O(n)
Space Complexity: O(n) (recursion stack)
*/