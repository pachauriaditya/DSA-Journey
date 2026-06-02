// Problem Name: Multi-Dimensional ArrayList in Java

/*
Approach:
1. Create a main ArrayList that stores other ArrayLists.
2. Create the first ArrayList (list1) and add elements.
3. Add list1 to the main ArrayList.
4. Create the second ArrayList (list2) and add elements.
5. Add list2 to the main ArrayList.
6. Traverse the main ArrayList using a nested loop.
7. Access each inner ArrayList and print its elements.
8. Finally print the complete Multi-Dimensional ArrayList.

List1:
[1, 2]

List2:
[3, 4]

Main ArrayList:
[
 [1, 2],
 [3, 4]
]

Output:
1 2
3 4

[[1, 2], [3, 4]]
*/

/*
Operations Used:

1. add(element)
   - Adds an element to an ArrayList.

2. add(ArrayList)
   - Adds an entire ArrayList into another ArrayList.

3. get(index)
   - Retrieves an element or inner ArrayList
     from the specified index.

4. size()
   - Returns the number of elements present
     in the ArrayList.

5. Nested Loops
   - Used to traverse all rows and columns
     of the Multi-Dimensional ArrayList.
*/

/*
Time Complexity:

Let:
m = number of inner ArrayLists
n = average number of elements in each inner ArrayList

Traversal:
Nested loops visit every element once.

TC = O(m × n)

For this example:
m = 2, n = 2
TC = O(4)
*/

/*
Space Complexity:

- Main ArrayList stores all elements.
- Total elements = m × n

SC = O(m × n)

For this example:
SC = O(4)
*/

import java.util.ArrayList;

public class MultiDimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
         ArrayList<Integer>list1 = new ArrayList<>();
         list1.add(1);
         list1.add(2);
         mainlist.add(list1);
         ArrayList<Integer>list2 = new ArrayList<>();
         list2.add(3);
         list2.add(4);
         mainlist.add(list2);

         for( int i = 0; i < mainlist.size(); i++){
            ArrayList<Integer> currList= mainlist.get(i);
            for(int j = 0; j< currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
         }
         System.out.println(mainlist);
    }
}
