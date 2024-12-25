import java.util.Scanner;

public class AKingKeykhosrowMystery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = 2; // sc.nextLong();
            long b = 3;// sc.nextLong();
            long min = Math.min(a, b);

            // long min = Math.min(a, b);
            long lcm = (a * b / gcd(a, b)); // Calculate LCM
            System.out.println(lcm);
            // The result must be at least max(a, b)
            long result = Math.max(min, lcm);
            // System.out.println(result);
            // }
        }
    }

    public static long gcd(long x, long y) {
        while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

}
