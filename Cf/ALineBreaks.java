import java.util.ArrayList;
import java.util.Scanner;

public class ALineBreaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<String> s = new ArrayList<>();
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                s.add(sc.next());
            }
            for (int i = 0; i < s.size(); i++) {
                // s.add(sc.next());
                String s1 = s.get(i);
                al.add(s1.length());
            }
            int sum = 0;
            int ans = 0;
            for (int i = 0; i < al.size(); i++) {
                if (sum >= m) {
                    break;
                }
                ans++;
                sum = sum + al.get(i);
            }
            // System.out.println(sum);
            if (sum <= m) {

                System.out.println(ans);
            } else {
                System.out.println(ans - 1);
            }

        }
    }
}
