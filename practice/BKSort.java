import java.util.Scanner;

public class BKSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long b[] = new long[n];
            long max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                b[i] = max - arr[i];
            }
            // System.out.println(Arrays.toString(b));
            long ans = 0;
            long maxx = 0;
            for (int i = 0; i < b.length; i++) {
                ans = ans + b[i];
                maxx = Math.max(maxx, b[i]);
            }
            System.out.println(maxx + ans);
        }
    }
}
