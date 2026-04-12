// Problem Name: Print All Pairs in Array

/*
Approach:
- Fix one element using outer loop.
- Pair it with all next elements using inner loop.
- Print each pair (i, j) where j > i.
- Count total number of pairs.
*/

public class pairsInArray {

    public static void pairArray(int[] nums) {
        int tp = 0; // total pairs

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                System.out.println("(" + current + "," + nums[j] + ")");
                tp++;
            }

            System.out.println();
        }

        System.out.println("Total pairs:" + tp);
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10 };
        pairArray(nums);
    }
}

/*
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */