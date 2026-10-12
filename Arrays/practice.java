
import java.util.*;

public class practice {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        findSecondLargestByBruteForce(arr);
    }

    public static void findSecondLargestByBruteForce(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int largest = arr[n - 1];
        int secondLargest = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondLargest == -1) {
            System.out.println("Second largest does not exist");
        } else {
            System.out.println("Second Largest is " + secondLargest);
        }
    }
}
