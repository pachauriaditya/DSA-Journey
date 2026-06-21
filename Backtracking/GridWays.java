/*
 * Problem: Grid Ways
 *
 * Given an N x M grid, find the total number of ways
 * to reach the bottom-right cell from the top-left cell.
 *
 * Allowed Moves:
 * 1. Right
 * 2. Down
 *
 * Recursive Approach:
 * - Explore all possible paths recursively.
 * - If destination is reached, return 1.
 * - If boundary is crossed, return 0.
 * - Total ways = Down ways + Right ways.
 *
 * Time Complexity: O(2^(n+m))
 * Space Complexity: O(n+m)
 *
 * Optimal Mathematical Formula:
 *
 * Total Moves = (n-1) + (m-1)
 *
 * Grid Ways = (n+m-2)! / ((n-1)! * (m-1)!)
 *
 * This is based on combinations:
 * Choosing (n-1) Down moves from total (n+m-2) moves.
 *
 * Time Complexity: O(n+m)
 * Space Complexity: O(1)
 */

package Backtracking;

public class GridWays {
    
    public  static int gridWays( int i , int j , int n , int m){
        //base case
        if( i == n-1 && j == m-1){  //condition for last cell
            return 1;
        }else if( i == n || j == n){  // boundary cross condition
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1+w2;     // w1 = way1 and w2 = way2 
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(gridWays(0,0,n,m));
    }
}
