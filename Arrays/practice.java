Package Arrays;
import java.util.*;
public class practice {
    // public static void findLargest(int []arr){
    //     int largest = arr[0];
    //     for( int i = 1 ; i < arr.length ; i++){
    //         if( arr[i] > largest){
    //             largest = arr[i];
    //         }
    //     }
    //     System.out.println("The largest element is: " + largest);
    // }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8,9 };
        // findLargest(arr);
        findSecondLargestByBruteForce(arr);
    }

    public static void findSecondLargestByBruteForce(int[] arr){
        Arrays.sort(arr);
        int largest = arr[n-1];
        for( int i = n-2 ; i >= 0 ; i--){
            if( arr[i] != largest){
                int secondLargest = arr[i];
                break;
            }
        }
        System.out.println("Second Largest is " + secondLargest);
    }
}
