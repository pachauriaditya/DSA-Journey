public class linearSearch{
    public static int search_linear(int nums[],int key){
        for( int i = 0; i< nums.length;i++){
            if(nums[i] == key){
                return i;
            }
        }
            return -1;
        
    }

    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        int index = search_linear(nums, key);
        if( index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is at index:" + index);
        }
    }
}