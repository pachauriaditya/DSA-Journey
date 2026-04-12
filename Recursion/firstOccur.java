public class firstOccur {

    public static int first_Occur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return first_Occur(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3, 5, 6, 7, 8 };
        System.out.println(first_Occur(arr, 7, 0));
    }
}

/*
 * Problem Name: First Occurrence in Array (Recursion)
 * 
 * Approach:
 * - Start from index 0.
 * - If current index goes beyond array length, return -1.
 * - If element matches key, return index immediately.
 * - Otherwise move to next index recursively.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) (recursion stack)
 */