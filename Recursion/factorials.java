import java.util.*;

public class factorial {

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}

/*
 * Problem Name: Factorial using Recursion
 * 
 * Approach:
 * - Base case: if n == 0 return 1.
 * - Recursive call: fact(n-1).
 * - Multiply current n with result of fact(n-1).
 * - Return final result.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) (recursion stack)
 */