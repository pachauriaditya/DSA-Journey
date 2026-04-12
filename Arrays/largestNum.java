// Problem Name: Find Largest Element in Array

/*
Approach:
- Initialize a variable 'largest' with minimum possible integer value.
- Traverse the array from start to end.
- If current element is greater than 'largest', update it.
- Finally return the largest value found.
*/

public class largestNum {

    public static int getLargest(int nums[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 6, 3, 5 };
        System.out.println(getLargest(nums));
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */