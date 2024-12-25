import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DVerDifferentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            ArrayList<Long> a = new ArrayList<>();
            ArrayList<Long> b = new ArrayList<>();
            for (int w = 0; w < n; w++) {
                a.add(sc.nextLong());
            }
            for (int w = 0; w < m; w++) {
                b.add(sc.nextLong());
            }

            Collections.sort(a);
            Collections.sort(b);
            Collections.reverse(b);
            // System.out.println(b);

            int i = 0;
            int j = a.size() - 1;
            int x = 0;
            int y = b.size() - 1;
            long max = 0;
            while (i <= j) {
                long diff = Math.abs(a.get(i) - b.get(x));
                long diff1 = Math.abs(a.get(j) - b.get(y));
                if (diff >= diff1) {
                    max = max + diff;
                    i++;
                    x++;
                } else {
                    max = max + diff1;
                    j--;
                    y--;
                }
            }
            System.out.println(max);
        }
    }
}

// 3 6 7 9 10
// 2 3 5 9 9