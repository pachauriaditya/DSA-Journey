// Problem Name: Kadane’s Algorithm (Maximum Subarray Sum)

/*
Approach:
- Traverse the array and keep a running current sum.
- If current sum becomes negative, reset it to 0.
- Keep updating maximum sum found so far.
- This works only when at least one positive number exists.
- For all-negative arrays, this version may fail (needs extra handling if required).
*/

public class kadanesAlgo {

    public static void kadanes(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println("Max subarray sum = " + maxSum);
    }

    public static void main(String[] args) {
        int nums[] = { -2, -3, 4, -1, 1, 5, -3 };
        kadanes(nums);
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */