public class leftRotateArraybyK {

    // ----> Brute Force Approach <----
    // Time Complexity : O(n)
    // Space Complexity : O(k)
    public static void rotateArray(int arr[], int k){
        int n = arr.length;
        k = k % n; // In case k is greater than nsize

        int temp[] = new int[k];
        for( int i = 0 ; i < k ; i++){
            temp[i] = arr[i];
        }

        for( int i = k ; i < n ; i++){
            arr[i-k] = arr[i];
        }

        for( int i = n-k ; i < n ; i++){
            arr[i] = temp[i - ( n-k )];
        }
    } 

    //--------------------------------------------------------------------------------

    // ----> Optimized Approach <----
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public static void reverseArray( int [] arr , int start , int end){
        while( start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotateArrayOptimized( int arr[] , int k){
        int n = arr.length;
        k = k % n;

        //reverse first k elements
        reverseArray(arr, 0 , k-1);;

        //reverse remaining n-k elements
        reverseArray(arr, k , n-1);

        //reverse whole array
        reverseArray(arr, 0 , n-1);
    }
     
//--------------------------------------------------------------------------------


    public static void printArray( int [] arr, int n){
        for(int i = 0 ; i < n ; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
            int arr1[] = {1, 2, 3, 4, 5,6,7,8,9,10};
            int arr2[] = {1, 2, 3, 4, 5,6,7,8,9,10};
        int k = 4;
        rotateArray(arr1, k);
        printArray(arr1, arr1.length);
        rotateArrayOptimized(arr2, k);
        printArray(arr2, arr2.length);
    }
}
