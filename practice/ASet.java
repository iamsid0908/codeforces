import java.util.Scanner;

public class ASet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long l = sc.nextInt();
            long r = sc.nextInt();
            long k = sc.nextInt();
            long count = 0;
            // for (int i = l; i <= r; i++) {
            // if (i * k > r) {
            // break;
            // }
            // if (r / i >= k) {
            // count++;
            // }
            // }
            long val = r / k;
            // for (int i = (int) l; i <= val; i++) {
            // if (i <= val) {
            // count++;
            // }
            // }
            long ans = val - l + 1;
            if (ans <= 0) {
                System.out.println(0);
            } else {
                System.out.println(ans);
            }

            // System.out.println(val - l + 1);
        }
    }
}
