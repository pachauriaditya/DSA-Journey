public class secondSmallest {
    public static  int getSecondSmallest(int [] arr){
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        
        for( int i = 1 ; i < arr.length ; i++){
            if( arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if( arr[i] != smallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        int nums[] = { 18, 17, 7, 45, 77 };
        System.out.println(getSecondSmallest(nums));
    }
}
