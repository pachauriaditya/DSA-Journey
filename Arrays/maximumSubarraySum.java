// Problem Name: Maximum Subarray Sum (Brute Force Approach)

/*
Approach:
- Generate all possible subarrays using 3 nested loops.
- Outer loop decides starting index.
- Middle loop decides ending index.
- Inner loop calculates sum of elements from start to end.
- Keep updating maximum sum while checking each subarray.
*/

public class maximumSubarraySum {

    public static void maxSubarraySum(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int start = i;

            for (int j = i; j < nums.length; j++) {
                int end = j;
                currSum = 0;

                for (int k = start; k <= end; k++) {
                    currSum += nums[k];
                }

                System.out.println(currSum);

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10 };
        maxSubarraySum(nums);
    }
}

/*
 * Time Complexity: O(n^3)
 * Space Complexity: O(1)
 */