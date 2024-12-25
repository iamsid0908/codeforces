import java.util.HashMap;
import java.util.Scanner;

public class BMaximizeMex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            // System.out.println(1 % 2);
            HashMap<Long, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            }
            long val = 0;
            while (map.containsKey(val)) {
                if (map.get(val) > 1) {
                    map.put(val + x, map.getOrDefault(val + x, 0) + map.get(val) - 1);
                }
                val++;
            }
            System.out.println(val);

        }
    }
}
