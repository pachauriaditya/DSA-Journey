// Problem: Extract substring from a given string using manual approach
// Approach: Iterate from start index (si) to end index (ei) and build new string
// Time Complexity: O(n)
// Space Complexity: O(n)
// brute force approach
package String;

public class substring2 {
    public static String subString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "Aditya Pachauri";
        System.out.println(subString(str, 0, 6));
    }
}
