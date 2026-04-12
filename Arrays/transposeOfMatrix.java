// Problem Name: Transpose of a Matrix

/*
Approach:
- Original matrix of size row x col is given.
- Create a new matrix of size col x row.
- Swap rows with columns: transpose[j][i] = matrix[i][j].
- Print both original and transpose matrices.
*/

public class transposeOfMatrix {

    public static void printMatrix(int[][] matrix) {
        System.out.println("the matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 2, col = 3;
        int[][] matrix = { { 2, 3, 7 }, { 5, 6, 7 } };

        // original matrix
        printMatrix(matrix);

        // transpose matrix
        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // print transpose matrix
        printMatrix(transpose);
    }
}

/*
 * Time Complexity: O(n × m)
 * Space Complexity: O(n × m)
 */