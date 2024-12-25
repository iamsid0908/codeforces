import java.util.Scanner;

public class EInsaneProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int k = sc.nextInt();
            long l1 = sc.nextLong();
            long r1 = sc.nextLong();
            long l2 = sc.nextLong();
            long r2 = sc.nextLong();
            long count = 0;
            long help = 0;
            long ok = 0;
            // long count = 0;
            long power = 1;

            while (power <= r2) {

                long start = Math.max(l1, (l2 + power - 1) / power);
                long end = Math.min(r1, r2 / power);

                if (start <= end) {
                    count += (end - start + 1);
                }

                if (power > r2 / k) {
                    break;
                }
                power *= k;
            }

            System.out.println(count);

        }
    }
}
