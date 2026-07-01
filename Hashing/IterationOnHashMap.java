package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IterationOnHashMap {
    public static void main(String[] args) {

        /*
         * Topic : Iteration on HashMap
         *
         * Approach:
         * There are two common ways to iterate over a HashMap:
         *
         * 1. keySet()
         *    - Returns all keys present in the HashMap.
         *    - Each key is then used with get(key) to access its value.
         *
         * 2. entrySet()
         *    - Returns all key-value pairs (Map.Entry objects).
         *    - Both key and value can be accessed directly.
         *    - More efficient than keySet() because it avoids an extra get() lookup.
         *
         * Time Complexity:
         * keySet() iteration  -> O(n)
         * entrySet()          -> O(n)
         *
         * Space Complexity:
         * O(n)
         * (The Set returned is a view of the map's entries/keys.)
         */

        // Create a HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("England", 70);
        hm.put("Germany", 80);

        // =====================================================
        // Method 1 : Iterate using keySet()
        // =====================================================

        // keySet() returns all keys of the HashMap.
        Set<String> keys = hm.keySet();

        // Prints all keys.
        System.out.println(keys);

        // Traverse each key.
        for (String k : keys) {

            // hm.get(k) returns the value corresponding to key k.
            System.out.println("Key = " + k + " , Value = " + hm.get(k));
        }


        // =====================================================
        // Method 2 : Using entrySet()
        // =====================================================

        // entrySet() returns all key-value pairs.
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();

        // Prints entries in the form:
        // [India=100, China=150, ...]
        System.out.println(entries);

        /*
         * Recommended way to iterate using entrySet():
         *
         * for (Map.Entry<String, Integer> entry : hm.entrySet()) {
         *     System.out.println(entry.getKey() + " -> " + entry.getValue());
         * }
         *
         * Here,
         * entry.getKey()   -> Returns the key.
         * entry.getValue() -> Returns the value.
         */
    }
}