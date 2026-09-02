import java.util.Arrays;

public class largestNum {

    // ----> Brute Force Approach <----
    public static int getLargestBrute(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    // ----> Optimal Approach <----
    public static int getLargest(int[] nums) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int nums[] = {1, 2, 6, 3, 5};

        System.out.println(getLargestBrute(nums));
        System.out.println(getLargest(nums));
    }
}

/*
 * Brute Force:
 * Time Complexity: O(n log n)
 * Space Complexity: O(1) auxiliary
 *
 * Optimal:
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */