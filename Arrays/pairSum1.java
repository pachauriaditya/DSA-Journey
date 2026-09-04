// Problem Name: Pair Sum in a Sorted ArrayList

/*
Approach 1: Brute Force

1. Traverse the ArrayList using two loops.
2. Select every possible pair of elements.
3. Check if their sum equals the target value.
4. If a valid pair is found, return true.
5. If no pair is found after checking all pairs,
   return false.

Example:
ArrayList:
[1, 2, 3, 4, 5, 6]

Target:
5

Valid Pair:
1 + 4 = 5
or
2 + 3 = 5

Output:
true
*/

/*
Approach 2: Two Pointers (Optimized)

1. Place one pointer at the beginning (lp)
   and another at the end (rp).
2. Calculate the sum of elements at both pointers.
3. If sum equals target, return true.
4. If sum is smaller than target,
   move the left pointer forward.
5. If sum is greater than target,
   move the right pointer backward.
6. Continue until both pointers meet.
7. If no pair is found, return false.

Since the ArrayList is sorted,
we can efficiently adjust pointers.
*/

/*
Methods Used:

1. get(index)
   - Returns the element at the specified index.

2. size()
   - Returns the total number of elements
     in the ArrayList.
*/

/*
Time Complexity:

Brute Force Approach:
- Outer loop runs n times.
- Inner loop runs approximately n times.

TC = O(n²)

Two Pointer Approach:
- Each pointer moves at most n times.

TC = O(n)
*/

/*
Space Complexity:

Brute Force Approach:
SC = O(1)

Two Pointer Approach:
SC = O(1)

(No extra data structure is used.)
*/

/*
Input:
[1, 2, 3, 4, 5, 6]

Target = 5

Output:
true
true
*/


import java.util.ArrayList;

//brute force approach
public class pairSum1 {
    public static boolean pairSum(ArrayList<Integer> pair, int target){
        
        for( int i = 0 ; i < pair.size();i++){
            for( int j = i+1 ; j < pair.size(); j++){

                if( pair.get(i) + pair.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    //two pointers approach
      public static boolean pairSum0( ArrayList<Integer> pair, int target){
        int lp = 0;
        int rp = pair.size()-1;

        while( lp != rp){
        if(pair.get(lp) + pair.get(rp) == target){
            return true;
        }
        if((pair.get(lp) + pair.get(rp) < target)){
            lp++;
        }else{
            rp--;
        }
    }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer>pair = new ArrayList<>();
        pair.add(1);
        pair.add(2);
        pair.add(3);
        pair.add(4);
        pair.add(5);
        pair.add(6);

        int target = 5;
        System.out.println(pairSum(pair, target));
        System.out.println(pairSum0(pair, target));
    }

}
