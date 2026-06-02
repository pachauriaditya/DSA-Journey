// Problem Name: Swap Two Elements in an ArrayList

/*
Approach:
1. Create an ArrayList and add elements to it.
2. Select two indices whose elements need to be swapped.
3. Store the first element in a temporary variable.
4. Replace the first element with the second element.
5. Replace the second element with the temporary value.
6. Print the updated ArrayList.

Original ArrayList:
[1, 2, 3, 4, 5, 6]

Indices to Swap:
indx1 = 1
indx2 = 5

Elements to Swap:
2 and 6

After Swapping:
[1, 6, 3, 4, 5, 2]
*/

/*
Methods Used:

1. get(index)
   - Returns the element present at the given index.

2. set(index, element)
   - Replaces the element at the specified index
     with a new value.

3. swap()
   - User-defined method used to exchange
     two elements of the ArrayList.
*/

/*
Time Complexity:

1. get() → O(1)
2. set() → O(1)

Total Operations are constant.

TC = O(1)
*/

/*
Space Complexity:

- Only one extra variable 'temp' is used.

SC = O(1)
*/

import java.util.ArrayList;
public class swapping {

    public static void swap(ArrayList<Integer>list, int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int  indx1 = 1 , indx2 = 5;

        System.out.println("Original list : " + list);
        swap(list, indx1, indx2);
        System.out.println("Swapped list :" + list);
    }
}
