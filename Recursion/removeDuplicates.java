public class removeDuplicates {

    public static int removeDuplicates(int[] arr, int n) {
        // Base case
        if (n == 1 || n == 0)
            return n;

        // Recursive call
        int size = removeDuplicates(arr, n - 1);

        for (int i = 0; i < size; i++) {
            if (arr[i] == arr[n - 1]) {
                return size;
            }
        }

        arr[size] = arr[n - 1];
        return size + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 1, 5 };

        int newSize = removeDuplicates(arr, arr.length);

        // Print result
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
 * Problem Name: Remove Duplicates from Array (Recursion)
 * 
 * Approach:
 * - Recursively process array till size n-1.
 * - Check if last element already exists in processed part.
 * - If yes, ignore it.
 * - If not, add it at the end of unique part.
 * - Return updated size of array.
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(n) (recursion stack)
 */