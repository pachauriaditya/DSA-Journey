public class similarNum {
    public static boolean SimilarNum( int nums[]){
        int n = nums.length;

        for( int i = 0 ; i < n ; i++){
          int  num1 = nums[i];
          for( int j = i+1; j< n; j++){
            int num2 = nums[j];
          
          if( num1 == num2){
            return true;
          }
        }
    }
    return false;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2,3,3,5,6};
        System.out.println(SimilarNum(nums));
    }
}

