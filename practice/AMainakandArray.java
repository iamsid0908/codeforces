import java.util.Scanner;

public class AMainakandArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (n == 1) {
                System.out.println(0);
                continue;
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int minidx = 0;
            int max2 = Integer.MIN_VALUE;
            int min2 = Integer.MAX_VALUE;

            for (int i = 1; i < n; i++) {
                max2 = Math.max(max2, arr[i]);
            }
            max = Math.max(max, (max2 - arr[0]));
            for (int i = 0; i < n - 1; i++) {
                min = Math.min(min, arr[i]);
            }
            max = Math.max(max, (arr[n - 1] - min));

            // System.out.println(max2);
            // max = Math.max(max, (max2 - arr[0]));

            // System.out.println(max);
            for (int i = 0; i < n - 1; i++) {
                max = Math.max(max, (arr[i] - arr[i + 1]));
            }

            System.out.println(max);
        }
    }
}
