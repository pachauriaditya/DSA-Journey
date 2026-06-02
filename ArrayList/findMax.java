// Problem Name: Find Maximum Element in an ArrayList

/*
Approach:
1. Create an ArrayList and add elements to it.
2. Initialize a variable 'max' with Integer.MIN_VALUE.
3. Traverse the ArrayList using a loop.
4. Compare each element with the current maximum value.
5. Update 'max' whenever a larger element is found.
   (Using Math.max() method)
6. After traversal, print the maximum element.

ArrayList:
[1, 5, 9, 6, 8]

Comparisons:
max = max(-2147483648, 1) → 1
max = max(1, 5) → 5
max = max(5, 9) → 9
max = max(9, 6) → 9
max = max(9, 8) → 9

Maximum Element:
9
*/

/*
Methods Used:

1. Math.max(a, b)
   - Returns the larger value between a and b.

2. size()
   - Returns the total number of elements
     present in the ArrayList.

3. get(index)
   - Accesses the element at the specified index.
*/

/*
Time Complexity:

- The loop traverses all n elements once.
- Each comparison takes O(1) time.

TC = O(n)
*/

/*
Space Complexity:

- Only one extra variable 'max' is used.

SC = O(1)
*/

import java.util.ArrayList;
public class findMax {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(5);
         list.add(9);
         list.add(6);
         list.add(8);
         int max = Integer.MIN_VALUE;
 
        for( int i = 0 ; i < list.size(); i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }  
        System.out.println("Max Element : " + max);
    }
}
