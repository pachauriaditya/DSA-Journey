import java.util.*;

public class removeDuplicates {

/*      ---> Brute Force Approach <---
    public static int removeDuplicates(int[] arr) {

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int i = 0;

        for (int num : set) {
            arr[i++] = num;
        }

        return set.size();
    }
*/

    // ---> Optimized Approach <---
    public static int removeDuplicatesOptimized(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 3, 5, 5, 7, 8, 8, 10};

        int kOptimized = removeDuplicatesOptimized(arr);

        System.out.println("Unique elements (Optimized): " + kOptimized);

        for (int i = 0; i < kOptimized; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}