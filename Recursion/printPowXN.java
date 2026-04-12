public class printPowXN {

  public static int power(int x, int n) {
    if (n == 0) {
      return 1;
    }

    return x * power(x, n - 1);
  }

  public static void main(String[] args) {
    System.out.println(power(10, 2));
  }
}

/*
 * Problem Name: Calculate Power x^n (Recursion)
 * 
 * Approach:
 * - Base case: if n == 0 return 1.
 * - Recursive relation: x^n = x * x^(n-1).
 * - Multiply x in each recursive call until n becomes 0.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) (recursion stack)
 */