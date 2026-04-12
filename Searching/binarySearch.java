import java.util.*;

public class binarySearch {

    public static int binary_Search(int nums[], int key) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == key) {
                return mid;
            }

            if (nums[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;

        System.out.println("The index of the key:" + binary_Search(nums, key));
    }
}

/*
 * Problem Name: Binary Search (Iterative)
 * 
 * Approach:
 * - Take two pointers: start and end.
 * - Find middle element.
 * - If mid == key, return index.
 * - If key is smaller, search left half.
 * - If key is larger, search right half.
 * - Repeat until start > end.
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */