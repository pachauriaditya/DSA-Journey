public class tillingProblem {
    public static int tilling_Problem( int n){
        //base case
        if( n == 0 || n == 1){
            return 1;
        }
        //vertical choice
        int fnm1 = tilling_Problem(n-1);

        //horizontal choice
        int fnm2 = tilling_Problem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays; 

    }

    public static void main(String[] args) {
        System.out.println(tilling_Problem(4));
    }
}
