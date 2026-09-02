import java.util.Arrays;
public class secondLargest {

    
      //      ----> brute force approach <-----
        public static int getSecondLargest1(int[] arr) { 
            Arrays.sort(arr);
            int largest = arr[arr.length - 1];
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] != largest) {
                   return arr[i];
                }
            }
            return -1; 
        }
    

     
    
    //           ----> better Approach <-----
        public static int getSecondLargest2(int [] arr){
            int largest = Integer.MIN_VALUE;
            for( int i = 0 ; i < arr.length ; i++){
                if( arr[i] > largest){
                    largest = arr[i];
                }
            }

            int secondLargest = Integer.MIN_VALUE;
            for( int i = 0 ; i < arr.length ; i++){
                if( arr[i] > secondLargest && arr[i] != largest){
                    secondLargest = arr[i];
                }
            }
            return secondLargest;
        }
    
     
    
    //        ----> optimal approach <-----
    
   public static int getSecondLargest( int [] arr){
    int largest = arr[0];
    int secondLargest = Integer.MIN_VALUE;

    for( int i = 1 ; i < arr.length ; i++){
        if( arr[i] > largest){
            secondLargest = largest;
            largest = arr[i];
        }
        else if( arr[i] < largest && arr[i] > secondLargest){
            secondLargest = arr[i];
        }
    }
    return secondLargest;
   }

    public static void main(String[] args) {

        int[] arr = {10, 5, 8, 20, 15};
            System.out.println(getSecondLargest1(arr));
            System.out.println(getSecondLargest2(arr));
        System.out.println(getSecondLargest(arr));
    }
}