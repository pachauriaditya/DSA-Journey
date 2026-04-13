// Problem: Compare String objects using == vs equals()
// Approach: 
// == compares reference (memory address)
// equals() compares actual content of strings
// Time Complexity: O(n) for equals(), O(1) for ==
// Space Complexity: O(1)
package String;

public class stringFunctionsComparison {
    public static void main(String[] args) {
        String s1 = "Aditya";
        String s2 = "Aditya";
        String s3 = new String("Aditya");

        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        /*
         * if( s1 == s3){
         * System.out.println(" Strings are equal");
         * }else{
         * System.out.println("Strings are not equal");
         * }
         */

        /*
         * In this case, s1 and s3 are not equal because s3 is a new string
         * and it is not equal to s1 on comapring, similarly with s2 too
         */

        // so we use
        if (s1.equals(s3)) {
            System.out.println(" Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
