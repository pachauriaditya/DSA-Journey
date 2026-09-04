import java.util.ArrayList;
import java.util.HashSet;

public class union {
    
    // ----> Brute Force Approach <----
    // Time Complexity : O(n + m)
    // Space Complexity : O(n + m)
    
    public static ArrayList<Integer> union( int arr1[] , int arr2[]){
        HashSet<Integer> st = new HashSet<>();

        for( int i = 0 ; i < arr1.length ; i++){
            st.add(arr1[i]);
        }

        for( int i = 0 ; i < arr2.length ; i++){
            st.add(arr2[i]);
        }

        ArrayList<Integer> temp = new ArrayList<>();

        for( int it : st){   //for each loop it print values directly instead of their index numbers.
            temp.add(it);
        }
        return temp;
    }

//---------------------------------------------------------------------------------------------------------
    // ----> Optimized Approach <----
    // Time Complexity : O(n + m)
    // Space Complexity : O(n + m)

    public static ArrayList<Integer> unionOptimized( int arr1[] , int arr2[]){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0;
        int j = 0;

        while( i < arr1.length && j < arr2.length){
            if( arr1[i] <= arr2[j]){
                if( temp.size() == 0 || temp.get(temp.size() -1) != arr1[i]){
                    temp.add(arr1[i]);
                }
                i++;
            }
            else{
                if( temp.size() == 0 || temp.get(temp.size() -1) != arr2[j]){
                    temp.add(arr2[j]);
                }
                j++;
            }
        }

        while( i < arr1.length){
             if( temp.size() == 0 || temp.get(temp.size() -1) != arr1[i]){
                    temp.add(arr1[i]);
                }
                i++;
        }

        while( j < arr2.length){
             if( temp.size() == 0 || temp.get(temp.size() -1) != arr2[j]){
                    temp.add(arr2[j]);
                }
                j++;
        }
        return temp;
    }

//---------------------------------------------------------------------------------------------------------
       public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 4, 6, 7};

        ArrayList<Integer> ans = union(arr1, arr2);

        System.out.println(ans);
         System.out.println(unionOptimized(arr1, arr2));
    }
}

