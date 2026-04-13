// Problem: Count the number of lowercase vowels in a given string
// Approach: Traverse the string and check each character against vowels (a, e, i, o, u)
// Time Complexity: O(n)
// Space Complexity: O(1)
package String;

import java.util.*;

public class occurVowels {
    public static void main(String[] args) {
        System.out.print("Enter any word : " + " ");
        String str = new Scanner(System.in).next();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
