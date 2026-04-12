// Problem Name: Diagonal Sum of Matrix (Brute Force Approach)

/*
Approach:
- Traverse the entire matrix using nested loops.
- If i == j, add primary diagonal element.
- If i + j == n - 1, add secondary diagonal element.
- Avoid double counting center element in odd matrix is NOT handled here (brute force keeps it simple).
- Finally print the total sum.
*/

public class DiagonalSum {

    public static void diagonalSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        diagonalSum(matrix);
    }
}

/*
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */