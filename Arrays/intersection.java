import java.util.ArrayList;
public class intersection {

/// ----> Brute Force Approach <----

// Time Complexity : O(n * m)
// Space Complexity : O(m)
    public static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        ArrayList<Integer> temp = new ArrayList<>();
        boolean visited[] = new boolean[arr2.length];

        for( int i = 0 ; i < arr1.length ; i++){
            for( int j = 0 ; j < arr2.length ; j++){
                if( arr1[i] == arr2[j] && !visited[j]){
                    temp.add(arr1[i]);
                    visited[j] = true;
                    break;
                }
            }
        }
        return temp;
    }

//---------------------------------------------------------------------------------------------

    
    // ----> Optimal Approach <----
    // Time Complexity : O(n + m)
    // Space Complexity : O(min(n, m))
    public static ArrayList<Integer> intersectionOptimal(int arr1[], int arr2[]) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0, j = 0;

        while( i < arr1.length && j < arr2.length){
            if( arr1[i] < arr2[j]){
                i++;
            }
            else if( arr1[i] > arr2[j]){
                j++;
            }
            else{
                temp.add(arr2[j]);
                i++;
                j++;
            }
        }
        return temp;
    }
//--------------------------------------------------------------------------------------------
     public static void main(String[] args) {

        int arr1[] = {1, 2, 2, 3, 4};
        int arr2[] = {2, 2, 3, 5};

        System.out.println(intersection(arr1, arr2));
        System.out.println(intersectionOptimal(arr1, arr2));
    }
}

