import java.util.Arrays;
import java.util.Scanner;

public class CRobinHoodinTown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (n <= 2) {
                System.out.println(-1);
                continue;
            }
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + arr[i];
            }
            long r = sum;
            long halfavg = sum / (n * 2);
            double d = (double) n / 2;
            int halfpop = (int) Math.ceil(d);
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] < halfavg) {
                    count++;
                }
            }
            // System.out.println("halfpop " + halfpop);
            Arrays.sort(arr);
            if (n % 2 == 1) {
                halfpop = halfpop - 1;
            }
            long halfidx = arr[n / 2];
            if (count > halfpop) {
                System.out.println(0);
            } else if (count <= halfpop) {
                // for (int i = 0; i < 1000001; i++) {
                // double val = (double) (r + i) / (n * 2);
                // if (val == (double) halfidx) {
                // System.out.println(i);
                // break;
                // }
                // }
                int val1 = fun(halfidx, r, n);
                if (val1 <= 0) {
                    System.out.println(0);
                } else {
                    System.out.println(val1 + 1);
                }
                // System.out.println(Math.max(0, (val1 + 1)));
            }
        }
    }

    public static int fun(long tt, long sum, int n) {
        int left = 0, right = 1000001, result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            double val = (double) (sum + mid) / (n * 2);

            if (val >= (double) tt) { // If condition satisfies
                result = mid; // Store the possible answer
                right = mid - 1; // Try to minimize further
            } else {
                left = mid + 1; // Increase mid to find a valid result
            }
        }

        return result;
    }
}
