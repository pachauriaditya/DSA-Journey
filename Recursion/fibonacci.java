public class fibonacci {

  public static int fibonacciSeries(int n) {
    if (n == 0 || n == 1) {
      return n;
    }

    int Snm1 = fibonacciSeries(n - 1);
    int Snm2 = fibonacciSeries(n - 2);
    int Sn = Snm1 + Snm2;

    return Sn;
  }

  public static void main(String[] args) {
    int n = 10;

    System.out.println(fibonacciSeries(9));
    System.out.println(fibonacciSeries(10));
    System.out.println(fibonacciSeries(11));
    System.out.println(fibonacciSeries(12));
    System.out.println(fibonacciSeries(13));
    System.out.println(fibonacciSeries(14));
  }
}

/*
 * Problem Name: Fibonacci Series (Recursion)
 * 
 * Approach:
 * - Base case: if n == 0 or n == 1 return n.
 * - For other cases, sum of previous two Fibonacci numbers.
 * - Recursive calls: f(n-1) + f(n-2).
 * 
 * Time Complexity: O(2^n)
 * Space Complexity: O(n) (recursion stack)
 */