import java.util.ArrayList;
import java.util.Scanner;

public class BTransfusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + a[i];
            }
            long val = sum / n;
            // System.out.println("sum," + sum + "n " + n);
            // System.out.println(12 / 4);
            // System.out.println("val " + val);
            ArrayList<Long> al = new ArrayList<>();
            long sum2 = 0;
            for (int i = 0; i < n; i++) {
                sum2 = sum2 + (a[i] - val);
                al.add(a[i] - val);
            }
            System.out.println(al);

            if (sum % n == 0 && sum2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}
