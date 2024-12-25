import java.util.Scanner;

public class BStalinSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long max = 0;
            for (int i = 0; i < n; i++) {
                long count = 0;
                for (int j = i; j < n; j++) {
                    if (arr[j] <= arr[i]) {
                        count++;
                    }
                }
                max = Math.max(max, count);
            }
            System.out.println(n - max);
        }
    }
}
