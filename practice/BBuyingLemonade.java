import java.util.Arrays;
import java.util.Scanner;

public class BBuyingLemonade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long sum = 0;
            long count = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (sum >= k) {
                    break;
                }
                sum = sum + a[i];
                count++;
            }
            System.out.println(sum);

        }
    }
}
