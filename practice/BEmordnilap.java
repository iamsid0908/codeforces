
import java.util.Scanner;

public class BEmordnilap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long n = sc.nextInt();
            long fact = fun(n);
            fact = fact % 1000000007;
            long sumfact = calculateSum(n);
            sumfact = sumfact * 2;
            sumfact = sumfact % 1000000007;

            System.out.println((sumfact * fact) % 1000000007);
        }
    }

    public static long fun(long n) {
        long result = 1;
        long mod = 1000000007;
        for (long i = 2; i <= n; i++) {
            result = (result * i) % mod;
        }
        return result;
    }

    public static long calculateSum(long n) {
        long cnt = 0;
        for (long i = (int) n - 1; i > 0; i--) {
            cnt += i;
        }
        return cnt;
    }
}
