// Problem: Extract substring from a given string
// Approach: Use built-in substring(start, end) method
// It returns characters from index start to end-1
// Time Complexity: O(n)
// Space Complexity: O(1)
//Optimised Approach
package String;

public class substring {
    public static void main(String[] args) {
        String str = "Aditya Pachauri";
        System.out.println(str.substring(0, 6));
    }
}
