// Problem Name: Sorting an ArrayList in Java

/*
Approach:
1. Create an ArrayList of Integer type.
2. Add elements to the ArrayList.
3. Print the original ArrayList.
4. Sort the ArrayList in ascending order using Collections.sort().
5. Print the sorted ArrayList.
6. Sort the ArrayList in descending order using
   Collections.sort(list, Collections.reverseOrder()).
7. Print the sorted ArrayList.

Original ArrayList:
[1, 5, 9, 6, 8]

After Ascending Order Sorting:
[1, 5, 6, 8, 9]

After Descending Order Sorting:
[9, 8, 6, 5, 1]
*/

/*
Methods Used:

1. Collections.sort(list)
   - Sorts the ArrayList in ascending order.

2. Collections.reverseOrder()
   - Returns a comparator that sorts elements
     in descending order.

3. Collections.sort(list, Collections.reverseOrder())
   - Sorts the ArrayList in descending order.
*/

/*
Time Complexity:

1. Ascending Sort:
   Collections.sort(list) → O(n log n)

2. Descending Sort:
   Collections.sort(list, Collections.reverseOrder())
   → O(n log n)

Overall Time Complexity:
O(n log n)
*/

/*
Space Complexity:

- Sorting may require extra space internally.
- For n elements:

SC = O(n)
*/

import java.util.*;
public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(5);
         list.add(9);
         list.add(6);
         list.add(8);
         System.out.println("Original ArrayList : " + list);

         //ascending order
         Collections.sort(list);
         System.out.println("Sorted ArrayList(Ascending Order) : " + list);

         //descending order
         Collections.sort(list, Collections.reverseOrder());
         System.out.println("Sorted ArrayList(Ascending Order):" + list);
    }
}
