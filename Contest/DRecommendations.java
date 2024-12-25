package Contest;

import java.util.Arrays;
import java.util.Scanner;

public class DRecommendations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[][] a = new long[(int) n][2];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    a[i][j] = sc.nextLong();
                }
            }
            Arrays.sort(a, (a1, b) -> {
                long rangeA = a1[1] - a1[0] + 1;
                long rangeB = b[1] - b[0] + 1;
                return Long.compare(rangeB, rangeA);
            });

            for (int i = 1; i < a.length; i++) {
                long a1 = a[i][0];
                long b1 = a[i][1];
                long c1 = a[i - 1][0];
                long d1 = a[i - 1][1];
                if (c1 <= a1 && d1 >= b1) {

                }
            }
        }
    }
}
