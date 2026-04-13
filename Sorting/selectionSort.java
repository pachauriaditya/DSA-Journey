// Problem: Sort an array using Selection Sort
// Approach: Find the minimum element in unsorted part and place it at correct position
// Time Complexity: O(n^2)
// Space Complexity: O(1)
package Sorting;

public class selectionSort {
    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swapping
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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
        SelectionSort(arr);
        printArray(arr);
    }
}
