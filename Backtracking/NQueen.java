/*
 * Problem Name: N-Queens Problem
 *
 * Problem Statement:
 * Place N queens on an N × N chessboard such that
 * no two queens attack each other.
 *
 * Conditions:
 * 1. No two queens can be placed in the same row.
 * 2. No two queens can be placed in the same column.
 * 3. No two queens can be placed on the same diagonal.
 *
 * Approach:
 * 1. Use Backtracking to place queens row by row.
 * 2. For each row, try placing a queen in every column.
 * 3. Before placing, check whether the position is safe.
 * 4. If safe:
 *      - Place the queen.
 *      - Recursively solve for the next row.
 * 5. If a solution is found:
 *      - Print the board configuration.
 *      - Increment the solution counter.
 * 6. Backtrack by removing the queen and try the next column.
 * 7. After exploring all possibilities, the counter stores
 *    the total number of valid arrangements.
 *
 * Output:
 * - Prints all valid N-Queens configurations.
 * - Prints the total number of possible solutions.
 *
 * Time Complexity:
 * O(N!)
 *
 * Space Complexity:
 * O(N)
 * (Recursion Stack)
 *
 * Algorithm Used:
 * Backtracking
 */

package Backtracking;

public class NQueen {

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

    public static void nQueens( char board[][] , int row){
        //base case 
        if( row == board.length){
            printBoard(board);
            count++;
            return;
        }

        //column loop
        for( int j = 0 ; j < board.length ; j++){
            if( isSafe(board,row,j)){
            board[row][j] = 'Q';
            nQueens(board, row+1);   //function call
            board[row][j] = 'x';     //backtracking step
            }
        }
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
        nQueens(board, 0);
        System.out.println("Total number of ways to place " + n + " queens is : " + count); 
    }
}