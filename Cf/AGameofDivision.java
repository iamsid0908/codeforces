import java.util.ArrayList;
import java.util.Scanner;

public class AGameofDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean loose = false;
            // int idx1 = 0;

            int i = 0;
            int idx1 = 0;
            while (i < n) {
                int val = a[i];
                int count = 0;
                int idx = 0;
                for (int j = 0; j < a.length; j++) {
                    if (i != j) {
                        if (Math.abs(a[i] - a[j]) % k != 0) {
                            count++;
                            idx = i;
                        } else {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                // System.out.println(count);

                if (count == n - 1) {
                    idx1 = idx;
                    loose = true;
                }
                i++;
            }
            if (loose) {
                System.out.println("yes");
                System.out.println(idx1 + 1);
            } else {
                System.out.println("NO");
            }
        }
    }
}