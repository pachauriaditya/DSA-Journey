public class fibonacci {
    public static int fibonacciSeries( int n){
        if( n == 0 || n == 1){
            return n;
        }
        int Snm1 = fibonacciSeries(n-1);
        int Snm2 = fibonacciSeries(n-2);
        int Sn = Snm1 + Snm2;
        return Sn; 
    }

    public static void main(String[] args) {
        int n = 10;
        System.err.println(fibonacciSeries(9));
          System.err.println(fibonacciSeries(10));
            System.err.println(fibonacciSeries(11));
              System.err.println(fibonacciSeries(12));
                System.err.println(fibonacciSeries(13));
                  System.err.println(fibonacciSeries(14));
    }
}
