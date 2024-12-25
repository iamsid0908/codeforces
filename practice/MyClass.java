import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- != 0) {
            int n = scanner.nextInt();
            long[] ans = new long[100001];
            ans[1] = 1;
            ans[2] = 2;
            ans[3] = 2;
            ans[4] = 2;

            int cnt = 3;
            for (int i = 5; i <= 100000; i = i * 2 + 1) {
                for (int j = i; j <= Math.min(2 * i, 100000); j++) {
                    ans[j] = cnt;
                }
                cnt++;
            }
            System.out.println(Arrays.toString(ans));
            // System.out.println();

        }
    }
}
