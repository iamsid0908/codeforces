import java.util.Scanner;

public class BTeawithTangerines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans += (((a[i] - 1) / (2 * a[0] - 1)));
            }
            System.out.println(ans);
        }
    }
}
