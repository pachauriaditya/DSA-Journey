// Problem: Check whether a given string is a palindrome or not
// Approach: Compare characters from start and end moving towards the center
// If any mismatch found, string is not a palindrome
// Time Complexity: O(n)
// Space Complexity: O(1)
package String;

public class palindrome {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) == str.charAt(n - 1 - i)) {
                System.out.println("It is a Palindrome");
                return true;
            }
        }
        System.out.println("Not a Palindrome");
        return false;
    }

    public static void main(String[] args) {
        String Word = "racecar";
        System.out.println(isPalindrome(Word));
    }
}
