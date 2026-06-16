// Problem: Demonstrate Backtracking on an Array

// Approach:
// 1. Fill the array using recursion.
// 2. Assign the current value at index i.
// 3. Recursively fill the remaining array.
// 4. While returning from recursion,
//    modify the current element.
// 5. This modification while coming back
//    is called Backtracking.

// Time Complexity: O(n)
// Explanation:
// Each index is visited once during recursion
// and once during backtracking.

// Space Complexity: O(n)
// Explanation:
// Recursive call stack can go up to n levels.

package Backtracking;

public class arraysBacktracking {

    public static void changeArr( int []arr,int i, int val){
        //base case
        if( i == arr.length){
            printArray(arr);
            return;
        }

        //recursion
         arr[i] = val;
        changeArr(arr, i+1,val+1);
        arr[i] = arr[i] -2;  //backtracking step
      }

    public static void printArray(int [] arr){
        for( int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

      public static void main(String[] args){
        int arr[] = new int[5];
        changeArr(arr,0,1);
        printArray(arr);
      }
}
