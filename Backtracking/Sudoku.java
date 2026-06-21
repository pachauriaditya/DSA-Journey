/*
 * Problem: Sudoku Solver
 *
 * Given a partially filled 9x9 Sudoku board,
 * fill all empty cells by following Sudoku rules.
 *
 * Rules:
 * 1. Each row must contain digits 1-9 exactly once.
 * 2. Each column must contain digits 1-9 exactly once.
 * 3. Each 3x3 sub-grid must contain digits 1-9 exactly once.
 *
 * Approach:
 * - Traverse the board cell by cell.
 * - For every empty cell (0), try digits 1 to 9.
 * - Check whether the digit can be placed safely.
 * - If safe, place the digit and recursively solve
 *   the remaining board.
 * - If the current choice leads to no solution,
 *   remove the digit (Backtracking) and try another.
 *
 * Time Complexity: O(9^(n*n)) [Worst Case]
 * Space Complexity: O(n*n)
 *
 * Concepts Used:
 * - Recursion
 * - Backtracking
 * - Constraint Checking
 */

package Backtracking;
public class Sudoku{

    // Checks whether placing digit is valid or not
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {

        // Row Check
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // Column Check
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // 3x3 Grid Check
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {

                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    // Solves Sudoku using Backtracking
    public static boolean solveSudoku(int[][] sudoku, int row, int col) {

        // Base Case -> Entire board filled
        if (row == 9) {
            return true;
        }

        // Calculate next cell
        int nextRow = row;
        int nextCol = col + 1;

        if (col == 8) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // Skip already filled cells
        if (sudoku[row][col] != 0) {
            return solveSudoku(sudoku, nextRow, nextCol);
        }

        // Try digits from 1 to 9
        for (int digit = 1; digit <= 9; digit++) {

            if (isSafe(sudoku, row, col, digit)) {

                // Place digit
                sudoku[row][col] = digit;

                // Recursive call
                if (solveSudoku(sudoku, nextRow, nextCol)) {
                    return true;
                }

                // Backtracking
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    // Prints Sudoku Board
    public static void printSudoku(int[][] sudoku) {

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] sudoku = {
                {0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        if (solveSudoku(sudoku, 0, 0)) {
            System.out.println("Solved Sudoku:");
            printSudoku(sudoku);
        } else {
            System.out.println("No Solution Exists!");
        }
    }
}