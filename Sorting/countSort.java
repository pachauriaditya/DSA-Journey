// Problem: Sort an array using Counting Sort
// Approach: Count frequency of each element, then rebuild the array in sorted order
// Time Complexity: O(n + k)  (n = array size, k = range of max element)
// Space Complexity: O(k)
package Sorting;

public class countSort {
    public static void countsort(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1]; // we use +1 because we also include 0

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 4, 3, 2 };
        countsort(arr);
        printArray(arr);
    }
}
