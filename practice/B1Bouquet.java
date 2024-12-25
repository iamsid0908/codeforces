import java.util.Arrays;
import java.util.Scanner;

public class B1Bouquet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long[] arr = new long[(int) n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long max = 0;
            long currentSum = 0;
            long start = 0;

            for (long end = 0; end < n; end++) {
                currentSum += (long) arr[(int) end];

                while ((start < n && arr[(int) end] - arr[(int) start] > 1) || currentSum > m) {
                    currentSum -= arr[(int) start];
                    start++;
                }

                max = Math.max(max, currentSum);

            }
            System.out.println(max);
        }
    }
}
