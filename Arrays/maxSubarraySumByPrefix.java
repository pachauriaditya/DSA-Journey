// Problem Name: Maximum Subarray Sum (Prefix Sum Approach)

/*
Approach:
- First build a prefix sum array where prefix[i] stores sum from 0 to i.
- For any subarray (i to j), sum = prefix[j] - prefix[i-1].
- If i == 0, directly use prefix[j].
- Check all possible subarrays using two loops and update maxSum.
*/

public class maxSubarraySumByPrefix {

    public static void maxSubarraySum(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];

        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int start = i;

            for (int j = i; j < nums.length; j++) {
                int end = j;

                currSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];

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
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */