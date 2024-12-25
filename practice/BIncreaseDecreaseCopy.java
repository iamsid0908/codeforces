import java.util.Scanner;

public class BIncreaseDecreaseCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = n + 1;
            long a[] = new long[(int) n];
            long b[] = new long[(int) m];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextLong();
            }
            long ans = 0;
            long max = 0;
            long min = Long.MAX_VALUE;
            long min1 = 0;

            long val = b[m - 1];

            // System.out.println(max);
            // System.out.println(min);
            for (int i = 0; i < n; i++) {
                if ((val >= a[i] && val <= b[i]) || (val <= a[i] && val >= b[i])) {
                    min1 = 1;
                    break;
                }

            }
            // System.out.println("min1 " + min1);
            // System.out.println("val " + val);

            if (min1 != 1) {
                for (int i = 0; i < n; i++) {

                    min = Math.min(min, Math.abs(a[i] - val));
                    min = Math.min(min, Math.abs(b[i] - val));
                    // System.out.println("minn " + min);
                }
            }
            // System.out.println("min " + min);

            if (min == Long.MAX_VALUE && min1 == 0) {
                ans = 0;
            } else if (min1 == 1 && min == Long.MAX_VALUE) {
                ans = 1;
            } else {
                ans = min + 1;
            }
            // System.out.println(ans);

            for (int i = 0; i < n; i++) {
                ans = ans + Math.abs(a[i] - b[i]);
            }
            System.out.println(ans);
        }
    }
}
