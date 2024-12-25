import java.util.HashMap;
import java.util.Scanner;

public class BLargeAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            String s = Long.toString(n);
            int half = s.length() - 1;
            StringBuilder sb = new StringBuilder();
            StringBuilder sbmax = new StringBuilder();
            for (int i = 1; i <= half; i++) {
                sb.append("5");
            }
            for (int i = 1; i <= half; i++) {
                sbmax.append("9");
            }
            // System.out.println(sb);
            // System.out.println(sbmax);
            long min = Long.parseLong(sb.toString());
            long max = Long.parseLong(sbmax.toString());
            System.out.println(min);
            System.out.println(max);
            HashMap<Long, Long> map = new HashMap<>();
            long x = 0;
            long y = 0;
            for (long i = min; i <= max; i++) {
                String ss = Long.toString(i);
                if (ss.contains("1") || ss.contains("2") || ss.contains("3") || ss.contains("4")) {
                    continue;
                } else {
                    if (map.containsKey(n - i)) {
                        // System.out.println();
                        x = map.get(n - i);
                        y = i;
                        break;
                    } else {
                        map.put(i, i);
                    }
                }
            }
            System.out.println(x + " " + y);
        }
    }
}
