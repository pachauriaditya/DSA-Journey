public class lastOccur {
    public static int last_Occur( int arr[], int key, int i){
        if( i == arr.length){
            return -1;
        }
        int isFound = last_Occur(arr, key, i+1);
        if( isFound != -1){
            return isFound;
        }

        if( arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1,1,2,2,3,3,4};
        System.out.println(last_Occur(arr, 3, 0));
    }
}
