/*
 * Problem: Find sum of all elements of an array using Recursion
 *
 * Optimized Approach:
 * 1. Pass the current index as a parameter.
 * 2. Add current element to the sum of remaining elements.
 * 3. No new array is created.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * (Recursive call stack)
 */

public class SumWithRecursion {

    public static int arraySum(int arr[], int idx) {

        // Base Case
        if (idx == arr.length) {
            return 0;
        }

        // Recursive Case
        return arr[idx] + arraySum(arr, idx + 1);
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 7, 9};

        System.out.println(arraySum(arr, 0));
    }
}