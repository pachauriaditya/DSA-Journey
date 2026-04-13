// Problem: Convert first letter of each word in a string to uppercase
// Approach: 
// 1. Convert first character to uppercase
// 2. Traverse string
// 3. If space found, capitalize next character
// Time Complexity: O(n)
// Space Complexity: O(n)
package String;

public class upperCase {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));

        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) { // for spaces between string
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); // string's first letter will capitalize comes next to
                                                                 // space
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = " Hii, i'm aditya pachauri";
        System.out.println(toUpperCase(str));
    }
}
