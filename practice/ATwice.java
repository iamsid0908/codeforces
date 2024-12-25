import java.util.HashMap;
import java.util.Scanner;

public class ATwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (map.containsKey(arr[i])) {
                    int get = map.get(arr[i]);
                    map.put(arr[i], get + 1);
                } else {
                    map.put(arr[i], 1);
                }
            }
            int ans = 0;
            for (int ele : map.values()) {
                if (ele == 1) {
                    continue;
                } else if (ele % 2 == 1) {
                    int val = ele - 1;
                    ans = ans + (val / 2);
                } else {
                    ans = ans + (ele / 2);
                }

            }
            System.out.println(ans);
        }
    }
}
