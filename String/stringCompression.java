// Problem: Compress a string by replacing consecutive repeated characters with character + count
// Example: aaabbcccdd -> a3b2c3d2
// Approach: Traverse string, count consecutive same characters, append char + count
// Time Complexity: O(n)
// Space Complexity: O(n)
package String;

public class stringCompression {
    public static String compreString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbccccdd";
        System.out.println(compreString(str));
    }
}
