// Problem: Print all characters of a given string with spaces
// Approach: Traverse the string and print each character using charAt()
// Time Complexity: O(n)
// Space Complexity: O(1)
package String;

public class printLetters {
    public static void print(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String name = "Virat Kohli";
        print(name);
    }
}
