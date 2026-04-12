public class lastOccur {

    public static int last_Occur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = last_Occur(arr, key, i + 1);

        if (isFound != -1) {
            return isFound;
        }

        if (arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(last_Occur(arr, 3, 0));
    }
}

/*
 * Problem Name: Last Occurrence in Array (Recursion)
 * 
 * Approach:
 * - Move recursively to end of array first.
 * - While returning back, check if element matches key.
 * - First valid match while backtracking is the last occurrence.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) (recursion stack)
 */