/* 
   we use "Lexicographic oder"  which means we compare letter 
   which comes first in alphabetical orders
   and the letter which comes firstbis considered as small and which comes later considered as large
*/

// Problem: Find the lexicographically largest string in an array
// Approach: Initialize with first element, then compare using compareTo() and update largest
// Time Complexity: O(n)
// Space Complexity: O(1)

package String;

public class largestString {
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "pineapple" };
        String largest = fruits[0]; // apple is considered as largest initially

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}

/*
 * note: 1. str1.compareTo(str2) - used for lexicographic order and it doesn't
 * consider small and capital alphabets same.
 * 2. str1.comparetoIgnoreCase(str2) - it considered both small and capital
 * alphabets as same.
 */
