public class firstOccur {
    public static int first_Occur( int arr[], int key, int i){
        if( i == arr.length){
            return -1;
        }
        if( arr[i] == key){
            return i;
        }
        return first_Occur(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = { 8,3,6,9,5,10,2,5,3,5,6,7,8};
        System.out.println(first_Occur(arr, 7, 0));
    }
}
