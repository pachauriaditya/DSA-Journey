 // Problem: Find All Permutations of a String

    /*
     * Approach:
     * 1. Pick each character one by one.
     * 2. Remove the picked character from the string.
     * 3. Add it to the answer string.
     * 4. Recursively generate permutations for the remaining characters.
     * 5. When the original string becomes empty, print the answer.
     */

    /*
     * Time Complexity: O(n × n!)
     *
     * Explanation:
     * - Total permutations = n!
     * - Creating new strings using substring takes O(n)
     * - Therefore O(n × n!)
     *
     * Space Complexity: O(n)
     *
     * Explanation:
     * - Maximum recursion depth = n
     * - Ignoring output storage
     */

package Backtracking;

public class findPermutation {
    public static void findPermute(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            findPermute(newStr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermute(str, "");
    }
}
