/*
 * Problem Name: N-Queens Problem (Find One Valid Solution)
 *
 * Problem Statement:
 * Given an N × N chessboard, place N queens such that
 * no two queens can attack each other.
 *
 * A queen can attack:
 * 1. Vertically
 * 2. Horizontally
 * 3. Diagonally
 *
 * Objective:
 * Find and print any one valid arrangement of N queens.
 * If no arrangement exists, print that the solution
 * does not exist.
 *
 * Approach:
 * 1. Use Backtracking to place queens row by row.
 * 2. For each row, try placing a queen in every column.
 * 3. Before placing a queen, check whether the position
 *    is safe by verifying:
 *      - Vertical Up
 *      - Upper Left Diagonal
 *      - Upper Right Diagonal
 * 4. If the position is safe:
 *      - Place the queen.
 *      - Recursively solve for the next row.
 * 5. If a recursive call returns true, a valid solution
 *    has been found, so stop further exploration.
 * 6. Otherwise, remove the queen (Backtracking) and
 *    try the next column.
 * 7. If all rows are successfully processed, return true.
 *
 * Output:
 * - Prints one valid N-Queens configuration.
 * - Prints whether a solution exists or not.
 *
 * Time Complexity:
 * O(N!)
 *
 * Space Complexity:
 * O(N)
 * (Recursion Call Stack)
 *
 * Algorithm Used:
 * Backtracking
 */

package Backtracking;

public class NQueens{

    public static boolean isSafe( char board[][] , int row , int col){
        //vertical up
        for( int i = row-1; i>=0 ; i--){
            if( board[i][col] == 'Q'){
                return false;
            }
        }

        //diagonally left up;
        for( int i= row-1 , j = col-1; i>=0 && j >=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //diagonally right up
        for( int i = row-1 , j = col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens( char board[][] , int row){
        //base case 
        if( row == board.length){
            count++;
            return true;
        }

        //column loop
        for( int j = 0 ; j < board.length ; j++){
            if( isSafe(board,row,j)){
            board[row][j] = 'Q';
           if(nQueens(board, row+1))
             return true;   //function call
            board[row][j] = 'x';     //backtracking step
            }
        }
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("------------Chess Board----------");
        for( int i = 0; i< board.length ; i++){
            for( int j = 0 ; j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0 ;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        //initialize
        for( int i = 0; i < n; i++){
            for( int j = 0 ; j<n ; j++){
                board[i][j] = 'x';
            }
        }
        if(nQueens(board, 0)){
            System.out.println("Solution is possible"); 
            printBoard(board);
        }
        else{
            System.out.println("Solution does not exist");
        }
    }
}
