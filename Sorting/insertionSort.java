// Problem: Sort an array using Insertion Sort
// Approach: Take each element and insert it into its correct position in the sorted part
// Time Complexity: O(n^2)
// Space Complexity: O(1)
package Sorting;

public class insertionSort {
    public static void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
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
        insertionsort(arr);
        printArray(arr);
    }
}
