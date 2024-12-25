import java.util.Arrays;
import java.util.Scanner;

public class AGreedyMonocarp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long[] arr = new long[(int) n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long sum = 0;
            long sum2 = 0;

            for (int i = arr.length - 1; i >= 0; i--) {
                sum = sum + arr[i];
                if (sum == k) {
                    break;
                }
            }
            if (sum == k) {
                System.out.println(0);
                continue;
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                if (sum2 + arr[i] > k) { // Check if adding arr[i] exceeds k
                    break; // Exit the loop
                }
                sum2 = sum2 + arr[i];
            }
            System.out.println(Math.abs(k - sum2));
        }
    }
}
