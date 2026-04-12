// Problem Name: Find Smallest Element in Array

/*
Approach:
- Initialize 'smallest' with maximum possible integer value.
- Traverse the array.
- If current element is smaller than 'smallest', update it.
- Return final smallest value.
*/

public class smallestNum {

    public static int getSmallest(int nums[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int nums[] = { 18, 17, 7, 45, 77 };
        System.out.println(getSmallest(nums));
    }
}

/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */