// Problem Name: Spiral Matrix Traversal

/*
Approach:
- Maintain four pointers: startRow, endRow, startCol, endCol.
- Traverse matrix layer by layer in spiral order.
- Step 1: Traverse top row.
- Step 2: Traverse right column.
- Step 3: Traverse bottom row (if not same as top).
- Step 4: Traverse left column (if not same as right).
- After each layer, move boundaries inward.
*/

public class SpiralMmatrix {

    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        spiralMatrix(matrix);
    }
}

/*
 * Time Complexity: O(n × m)
 * Space Complexity: O(1)
 */