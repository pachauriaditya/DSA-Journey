// Problem Name: Container With Most Water

/*
Approach 1: Brute Force

1. Consider every possible pair of lines.
2. Calculate:
   - Height = minimum of both lines.
   - Width = distance between the lines.
3. Water Stored = Height × Width.
4. Keep track of the maximum water stored.
5. Return the maximum water.

Example:
Height Array:
[1,8,6,2,5,4,8,3,7]

Maximum Water:
49
*/

/*
Approach 2: Two Pointers (Optimized)

1. Place one pointer at the beginning (lp)
   and another at the end (rp).
2. Calculate current water area.
3. Update maximum water if needed.
4. Move the pointer having smaller height:
   - If left height < right height → lp++
   - Else → rp--
5. Continue until lp < rp.
6. Return the maximum water.

Reason:
Moving the taller line cannot increase area
if the shorter line remains the limiting factor.
*/

/*
Methods Used:

1. Math.min(a, b)
   - Returns the smaller value.
   - Used to determine container height.

2. Math.max(a, b)
   - Returns the larger value.
   - Used to update maximum water area.

3. get(index)
   - Accesses elements of the ArrayList.

4. size()
   - Returns the number of elements in the ArrayList.
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
[1,8,6,2,5,4,8,3,7]

Output:
49
49

(Both approaches produce the same answer.)
*/


import java.util.ArrayList;

public class containerWithMostWater {
    //Brute Force Approach
    public static int storeWater1(ArrayList<Integer> height){
        int maxWater = 0;

        for(  int i = 0; i< height.size();i++){
            for( int j = i+1; j< height.size();j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht*width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    //two pointers approach
    public static int storeWater2(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while( lp < rp){
            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max( maxWater, currWater);

            //update pointers
            if( height.get(lp) < height.get(rp) ){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }


    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
         System.out.println(storeWater1(height));
         System.out.println(storeWater2(height));
    }

}
