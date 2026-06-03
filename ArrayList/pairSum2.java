// Problem Name: Pair Sum in a Sorted and Rotated ArrayList

/*
Approach:

1. Find the breaking point (bp),
   where an element is greater than its next element.
   This is the point where the sorted ArrayList is rotated.

2. Initialize:
   - lp = bp + 1 (smallest element)
   - rp = bp     (largest element)

3. Use a circular two-pointer approach.

4. If pair.get(lp) + pair.get(rp) == target,
   return true.

5. If sum < target,
   move lp forward circularly:
   lp = (lp + 1) % n

6. If sum > target,
   move rp backward circularly:
   rp = (n + rp - 1) % n

7. Continue until lp == rp.

8. If no valid pair is found,
   return false.

Example:

Sorted & Rotated ArrayList:
[11, 15, 6, 8, 9, 10]

Target:
16

Valid Pair:
6 + 10 = 16

Output:
true
*/

/*
Concept:

Breaking Point:
11 15 6 8 9 10
      ↑
      bp = 1

Largest Element:
15 (index 1)

Smallest Element:
6 (index 2)

Then apply two-pointer technique
in a circular manner.
*/

/*
Methods Used:

1. get(index)
   - Accesses elements from the ArrayList.

2. size()
   - Returns the total number of elements.

3. Modulo Operator (%)
   - Used for circular traversal of the ArrayList.
*/

/*
Time Complexity:

1. Finding Breaking Point:
   O(n)

2. Circular Two Pointer Traversal:
   O(n)

Overall TC:
O(n)
*/

/*
Space Complexity:

- Only a few extra variables are used:
  bp, lp, rp, n

SC = O(1)
*/

/*
Input:
[11, 15, 6, 8, 9, 10]

Target = 16

Output:
true
*/


import java.util.ArrayList;

public class pairSum2 {
    public static boolean pairSum( ArrayList<Integer> pair, int target){
        int bp = -1; //breaking point where the list get rotated
        int n = pair.size();
        for( int i = 0 ; i< pair.size()-1; i++){
            if( pair.get(i) > pair.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1;  //smallest number
        int rp = bp; // largest number

    while( lp != rp){
        //case 1
        if( pair.get(lp) + pair.get(rp) == target){
            return true;
        }

        //case 2
        if( pair.get(lp) + pair.get(rp) < target){
            lp = ( lp + 1)% n;
        }else{
            rp = ( n + rp - 1)% n;
        }
    }
    return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer>pair = new ArrayList<>();
        pair.add(11);
        pair.add(15);
        pair.add(6);
        pair.add(8);
        pair.add(9);
        pair.add(10);

        int target = 16;
        System.out.println(pairSum(pair, target));
    }

}
