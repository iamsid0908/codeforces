import java.util.ArrayList;
import java.util.Scanner;

public class ASwapColumnsaPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long a[][] = new long[2][n];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            long max = Long.MIN_VALUE;
            long sum = 0;
            ArrayList<Long> al = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (a[0][i] >= a[1][i]) {
                    sum = sum + a[0][i];
                    al.add(a[1][i]);
                } else {
                    sum = sum + a[1][i];
                    al.add(a[0][i]);
                }
            }

            for (int i = 0; i < al.size(); i++) {
                // sum = sum + al.get(i);
                max = Math.max(max, al.get(i));
            }

            System.out.println(sum + max);
        }
    }
}
