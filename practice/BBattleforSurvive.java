import java.util.Scanner;

public class BBattleforSurvive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            long sum = 0;
            for (int i = 0; i < n - 2; i++) {
                sum = sum + a[i];
            }
            long val = a[n - 2] - sum;

            System.out.println(a[n - 1] - val);
        }
    }
}
