
import java.util.Scanner;

public class AHossamandCombinatorics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                min = Math.min(arr[i], min);
                max = Math.max(arr[i], max);
            }
            if (max == min) {
                System.out.println((long) n * (n - 1));
                continue;
            }
            long minc = 0;
            long maxc = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == min) {
                    minc++;
                }
                if (arr[i] == max) {
                    maxc++;
                }
            }
            System.out.println((minc * maxc) * 2);
        }
    }
}
