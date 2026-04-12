public class stairCaseSearch {

    public static boolean stairCase_search(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == key) {
                System.out.println("Element found at (" + row + "," + col + ")");
                return true;
            }

            else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        System.out.println("Element not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int key = 27;
        stairCase_search(matrix, key);
    }
}

/*
 * Problem Name: Staircase Search in 2D Matrix
 * 
 * Approach:
 * - Start from top-right corner of matrix.
 * - If current element equals key, return found.
 * - If key is smaller, move left (col--).
 * - If key is larger, move down (row++).
 * - Repeat until element is found or bounds end.
 * 
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 */