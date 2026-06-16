// Problem: Find All Subsets of a String

// Approach:
// For every character, we have two choices:
// 1. Include the character in the current subset.
// 2. Exclude the character from the current subset.
//
// Use recursion to explore both choices.
// When we reach the end of the string,
// print the generated subset.

// Time Complexity: O(2^n)
// Explanation:
// Each character has 2 choices (include/exclude),
// resulting in 2^n total subsets.

// Space Complexity: O(n)
// Explanation:
// Maximum recursion depth is n.

package Backtracking;

public class findSubsets {
    public static void findSubset( String str , String ans, int i){
        //base case
        if( i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        //yes choice
        findSubset(str, ans+str.charAt(i), i+1);

        //no choice
        findSubset(str, ans, i+1);

    }

    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
}
