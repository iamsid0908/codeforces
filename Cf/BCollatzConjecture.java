import java.util.*;

public class BCollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(fun(x, y, k));

        }
    }

    public static long fun(long x, long y, long k) {
        x++;
        k--;
        while (x != y) {
            if (x % y == 0) {
                while (x % y == 0) {
                    x = x / y;
                }
            }
            if (k == 0) {
                return x;
            }
            long temp = y - x % y;
            if (temp <= k) {
                x = x + temp;
                x = x - temp;
            } else {
                return x + k;
            }
        }
        return x + k % (y - 1);
    }
}
