public class printPowXN2 {

    public static int optimisedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPow = optimisedPower(a, n / 2);
        int halfPowSq = halfPow * halfPow;

        // n is odd
        if (n % 2 != 0) {
            halfPowSq = a * halfPowSq;
        }

        return halfPowSq;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(optimisedPower(a, n));
    }
}

/*
 * Problem Name: Optimized Power (Exponentiation by Squaring)
 * 
 * Approach:
 * - Divide exponent into half using recursion.
 * - Compute power for n/2 only once.
 * - Square the result to get full power.
 * - If n is odd, multiply once more with base 'a'.
 * - Reduces repeated calculations.
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(log n) (recursion stack)
 */