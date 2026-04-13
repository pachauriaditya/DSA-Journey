// Problem: Check whether two strings are anagrams or not
// Approach: Convert strings to lowercase, compare lengths, sort both strings and check equality
// Time Complexity: O(n log n)
// Space Complexity: O(n)

/*
  Anagram --> if two strings contain the same characters but in a different order.
  exampple: race and care.

  intern() method in String --> it is used to add a string object to the string constant 
  pool or return a reference to an existing string from the  pool if it already exists. 
  It helps in saving memory ny ensuring that identical share the same reference.

  StringBuffer --> it is a mutable class used to create and modify strings.
   Unlike string, objects of StringBuffer can be changed without creating a new 
   object.It is thread safe because it's methods are synchronised.
*/

//check the two strings are anagrams or not?
package String;

import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        // convert strings to lower case so we don't have to check for both lower and
        // upper case

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check if the strings are same or not
        if (str1.length() == str2.length()) {

            // convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // if the sorted array are same then strings are anagram

            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " " + "and" + " " + str2 + " " + "are anagrams of each other");
            } else {
                System.out.println(str1 + " " + "and" + " " + str2 + " " + "are not anagrams of each other");
            }
        }
    }
}
