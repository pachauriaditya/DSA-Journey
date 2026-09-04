import java.util.ArrayList;

public class moveAllZeroesToEnd {
    
    // ----> Brute Force Approach <----
    // Time Complexity : O(n)
    // Space Complexity : O(n)

    public static void moveZeroes( int arr[] ){
        int n = arr.length;

        ArrayList<Integer> temp = new ArrayList<>();

        for( int i = 0 ; i < n ; i++){
            if( arr[i] != 0){
                temp.add(arr[i]);
            }
        }

        for( int i = 0 ; i < temp.size() ; i++){
            arr[i] = temp.get(i);
        }

        for( int i = temp.size() ; i < n ; i++){
            arr[i] = 0;
        }
    }

    // ---------------------------------------------------------------------------------------------------------
    
    // ----> Optimized Approach <----
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public static void moveZeroesOptimized( int arr[]){
        int j = -1;
        int n = arr.length;
        for( int i = 0 ; i < n ; i++){
            if( arr[i] == 0){
                j = i;
                break;
            }
        }

        if( j == -1){
            return;
        }

        for( int i = j+1; i < n ; i++){
            if( arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    //---------------------------------------------------------------------------------------------------------

    

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 0, 2, 0, 3, 4, 0, 5};
        int[] arr = {1, 0, 2, 0, 3, 4, 0, 5};
        moveZeroes(arr1);
        printArray(arr1);

        moveZeroesOptimized(arr);
        printArray(arr);
    }
}
