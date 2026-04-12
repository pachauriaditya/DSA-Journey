public class smallestNum {
    public static int getSmallest( int nums[]){
        int smallest = Integer.MAX_VALUE;

        for( int i = 0; i< nums.length ; i++){
            if( nums[i] < smallest){
                smallest = nums[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int nums[] = { 18,17,7,45,77};
        System.out.println(getSmallest(nums));
    }
}
