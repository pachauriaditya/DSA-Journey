public class printPowXN2 {
    public static int optimisedPower( int a , int n){
        if( n == 0){
            return 1;
        }
        int halfPow = optimisedPower(a, n/2);
        int halfPowSq = halfPow * halfPow;

        //m is odd
        if( n % 2 != 0){
            halfPowSq = a * halfPowSq;
        }
        return halfPowSq;
    }
    
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(optimisedPower(a, n));
    }
}
