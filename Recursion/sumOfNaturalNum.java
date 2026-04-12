import java.util.*;
public class sumOfNaturalNum{
    public static int calcSum( int n){
        if( n == 1){
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        System.out.println(calcSum(n));

    }
}