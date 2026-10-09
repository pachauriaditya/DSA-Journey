public class findMissingNum {
    public static void findNum( int [] arr){
        for( int i = 0; i<= arr.length ; i++){
            int flag = 0;
            for( int j = 0; j < arr.length ; j++){
                if( arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if( flag == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,7,8,9,10};
        findNum(arr);
    }
}
