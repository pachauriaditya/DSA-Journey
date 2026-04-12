// Problem Name: Print All Subarrays

/*
Approach:
- Fix starting index using outer loop.
- Fix ending index using middle loop.
- Print all elements between start and end using inner loop.
- This generates all possible subarrays.
*/

public class printSubarray {

    public static void subArray(int nums[]) {

        for (int i = 0; i < nums.length; i++) {
            int start = i;

            for (int j = i; j < nums.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k] + " ");
                }

                System.out.println();
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10 };
        subArray(nums);
    }
}

/*
 * Time Complexity: O(n^3)
 * Space Complexity: O(1)
 */