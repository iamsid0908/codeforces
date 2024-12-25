import java.util.Scanner;

public class CGoodPrefixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long max = 0;
            long ans = 0;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                sum = sum + arr[i];
                if ((sum - max) == max) {
                    ans++;
                }
                // System.out.println("sum " + sum);
                // System.out.println("max " + max);
            }
            System.out.println(ans);
        }
    }
}
