public class sortedArray {

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(isSorted(arr, 0));
    }
}

/*
 * Problem Name: Check if Array is Sorted (Recursion)
 * 
 * Approach:
 * - Compare current element with next element.
 * - If any pair is in wrong order, return false.
 * - Otherwise move to next index recursively.
 * - Base case: when last index is reached, array is sorted.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) (recursion stack)
 */