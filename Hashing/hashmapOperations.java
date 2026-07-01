package Hashing;

import java.util.HashMap;

public class hashmapOperations {
    public static void main(String[] args) {

        /*
         * Topic : HashMap Operations in Java
         *
         * Approach:
         * - Create a HashMap.
         * - Perform all basic operations:
         *      1. put()         -> Insert key-value pair
         *      2. get()         -> Retrieve value using key
         *      3. containsKey() -> Check if a key exists
         *      4. remove()      -> Delete a key-value pair
         *      5. size()        -> Count total entries
         *      6. clear()       -> Remove all entries
         *      7. isEmpty()     -> Check whether HashMap is empty
         *
         * Time Complexity:
         * put()         -> O(1)
         * get()         -> O(1)
         * containsKey() -> O(1)
         * remove()      -> O(1)
         * size()        -> O(1)
         * clear()       -> O(n)
         * isEmpty()     -> O(1)
         *
         * Space Complexity:
         * O(n)   (n = number of key-value pairs stored)
         */

        // Create an empty HashMap
        // Syntax: HashMap<KeyType, ValueType> map = new HashMap<>();
        HashMap<String, Integer> hm = new HashMap<>();


        // ================= INSERT =================
        // put(key, value)
        // Adds a new key-value pair.
        // If key already exists, its value gets updated.

        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("US", 50);

        System.out.println(hm);


        // ================= GET =================
        // get(key)
        // Returns the value associated with the key.
        // Returns null if key is not present.

        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("England"));   // null


        // ================= CONTAINS =================
        // containsKey(key)
        // Returns true if key exists.
        // Returns false otherwise.

        System.out.println(hm.containsKey("India"));     // true
        System.out.println(hm.containsKey("England"));   // false


        // ================= REMOVE =================
        // remove(key)
        // Removes the key-value pair.
        // Returns removed value.
        // Returns null if key doesn't exist.

        System.out.println(hm.remove("china"));
        System.out.println(hm);


        // ================= SIZE =================
        // size()
        // Returns total number of key-value pairs.

        System.out.println(hm.size());


        // ================= CLEAR =================
        // clear()
        // Removes all entries from the HashMap.

        hm.clear();


        // ================= IS EMPTY =================
        // isEmpty()
        // Returns true if HashMap has no elements.

        System.out.println(hm.isEmpty());
    }
}