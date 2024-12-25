import java.util.Scanner;

public class CBasilGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long ans = a[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                if (a[i] > ans) {
                    ans = a[i];
                } else if (a[i] <= ans) {
                    ans = ans + 1;
                }
            }
            System.out.println(ans);
        }

    }

}