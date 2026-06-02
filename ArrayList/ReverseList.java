// Problem Name: Reverse Printing an ArrayList

/*
Approach:
1. Create an ArrayList and add elements to it.
2. Start traversing from the last index
   (list.size() - 1).
3. Access each element using get(i).
4. Decrease the index after every iteration.
5. Continue until index becomes 0.
6. Print elements in reverse order.

Original ArrayList:
[1, 2, 3, 4, 5]

Reverse Order:
5 4 3 2 1
*/

/*
Methods Used:

1. add(element)
   - Adds an element to the end of the ArrayList.

2. size()
   - Returns the total number of elements
     present in the ArrayList.

3. get(index)
   - Retrieves the element at the specified index.
*/

/*
Time Complexity:

- The loop visits each element exactly once.

TC = O(n)

where n = number of elements in the ArrayList.
*/

/*
Space Complexity:

- No extra data structure is used.
- Only loop variable 'i' is used.

SC = O(1)
*/

import java.util.ArrayList;
public class ReverseList {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();

        //add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // reverse print
        for( int i = list.size()-1 ; i>= 0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
