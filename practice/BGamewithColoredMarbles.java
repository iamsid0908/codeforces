import java.util.HashMap;
import java.util.Scanner;

public class BGamewithColoredMarbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            }
            // System.out.println(map);
            long one = 0;
            long two = 0;
            for (int ele : map.keySet()) {
                int val = map.get(ele);
                if (val == 1) {
                    one++;
                } else {
                    two++;
                }
            }
            long ans = 0;
            if (one % 2 == 1) {
                ans = ans + ((one / 2) + 1) * 2;
            } else {
                ans = ans + (one / 2) * 2;
            }
            ans = ans + two;
            System.out.println(ans);
        }
    }
}
