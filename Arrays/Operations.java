// Problem Name: ArrayList Operations in Java

/*
Approach:
1. Create an ArrayList of Integer type.
2. Add elements using add() method.
3. Insert an element at a specific index.
4. Access an element using get() method.
5. Remove an element using remove() method.
6. Update an element using set() method.
7. Check the presence of an element using contains() method.
8. Find the size of the ArrayList using size() method.
9. Traverse and print all elements using a for loop.
10. Print the results after each operation.

Initial List:
[1, 2, 3, 4, 5]

After Inserting 8 at Index 1:
[1, 8, 2, 3, 4, 5]

Element at Index 1:
8

After Removing Element at Index 2:
[1, 8, 3, 4, 5]

After Updating Index 1 with 17:
[1, 17, 3, 4, 5]

Contains:
2 → false
4 → true

Size of ArrayList:
5

Final Traversal:
1 17 3 4 5
*/

/*
Operations Used:

1. add(element)
   - Adds an element at the end of the ArrayList.

2. add(index, element)
   - Inserts an element at a specific index.

3. get(index)
   - Returns the element present at the given index.

4. remove(index)
   - Removes the element from the specified index.

5. set(index, element)
   - Replaces the existing element at the specified index.

6. contains(element)
   - Checks whether the given element exists in the ArrayList.

7. size()
   - Returns the total number of elements present in the ArrayList.

8. for loop traversal
   - Used to access and print all elements of the ArrayList.
*/

/*
Time Complexity:

1. add(element)         → O(1) (Amortized)
2. add(index, element)  → O(n)
3. get(index)           → O(1)
4. remove(index)        → O(n)
5. set(index, element)  → O(1)
6. contains(element)    → O(n)
7. size()               → O(1)
8. Traversal            → O(n)

Overall Time Complexity:
O(n)
*/

/*
Space Complexity:

- ArrayList stores n elements.

SC = O(n)
*/


import java.util.ArrayList;
public class Operations{
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();

        //add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,8);
        
        System.out.println(list);

        //get element
       int index = list.get(1);
       System.out.println(index);

        //remove element
        list.remove(2);
        System.out.println(list);

        //set element at index
        list.set(1,17);
        System.out.println(list);

        //contains element --> check whether an element is present in the array or not
        System.out.println(list.contains(2));
        System.out.println(list.contains(4));

        //size of the  ArrayList
        System.out.println(list.size());

        //print the array list
        for(int i = 0 ; i < list.size(); i++){
         System.out.print(list.get(i) + " ");
        }
    }
}