public class tillingProblem {

    public static int tilling_Problem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical choice
        int fnm1 = tilling_Problem(n - 1);

        // horizontal choice
        int fnm2 = tilling_Problem(n - 2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(tilling_Problem(4));
    }
}

/*
 * Problem Name: Tiling Problem (2 x n board)
 * 
 * Approach:
 * - If we place tile vertically, reduce problem to (n-1).
 * - If we place tile horizontally, reduce problem to (n-2).
 * - Total ways = ways(n-1) + ways(n-2).
 * - Base case: n == 0 or n == 1 return 1.
 * 
 * Time Complexity: O(2^n)
 * Space Complexity: O(n) (recursion stack)
 */