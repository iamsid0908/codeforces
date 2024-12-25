import java.util.Arrays;
import java.util.Scanner;

public class B1TheStrictTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int q = sc.nextInt();
            int[] a = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }
            int qpos = sc.nextInt();
            int minval = Math.min(a[0], a[1]);
            int maxval = Math.max(a[0], a[1]);
            if (qpos < a[0] && qpos < a[1]) {
                System.out.println(minval - 1);
            } else if (qpos > a[0] && qpos > a[1]) {
                System.out.println(n - maxval);
            } else {
                Arrays.sort(a);
                // int ans = (a[1] - qpos - 1) + (qpos - a[0] - 1);
                System.out.println((a[1] - a[0]) / 2);
            }
        }
    }
}
