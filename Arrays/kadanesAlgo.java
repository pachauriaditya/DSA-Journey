public class kadanesAlgo {
    public static void kadanes( int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum =0;

        for( int i=0; i< nums.length;i++){
            currSum += nums[i];
            if( currSum <0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum); /*if all the elements are zero 
            // then in that case we don't use this line 
            // and  the rest of the code will be same*/
        }
        System.out.println("Max subarrarray sum = " + maxSum);
    }

    public static void main(String[] args) {
        int nums[] = {-2,-3,4,-1,1,5,-3};
        kadanes(nums);
    }
    
}
