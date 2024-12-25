import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CChamoandMochaArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long a[] = new long[n];
            long max = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            if (n == 2) {
                System.out.println(Math.min(a[0], a[1]));
                continue;
            }
            for (int i = 0; i < n - 2; i++) {
                ArrayList<Long> al = new ArrayList<>();
                for (int j = i; j <= i + 2; j++) {
                    al.add(a[j]);
                    Collections.sort(al);
                }
                max = Math.max(max, al.get(1));
            }
            System.out.println(max);

        }
    }
}
