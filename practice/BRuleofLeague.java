import java.util.ArrayList;
import java.util.Scanner;

public class BRuleofLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n1 = n + 1;
            if (x != 0 && y != 0) {
                System.out.println(-1);
                // brecoak;
                continue;
            } else if (x == 0 && y == 0) {
                System.out.println(-1);
                // break;
                continue;
            }
            int val = Math.max(x, y);
            // if (n1 % val != 0) {
            // System.out.println(-1);
            // // break;
            // continue;
            // }
            // for (int i = 0; i < val; i++) {
            // System.out.print(1 + " ");
            // }
            ArrayList<Integer> al = new ArrayList<>();
            int j = 2;
            boolean lose = false;
            while (j <= n) {
                int val2 = val;
                int d = j;
                while (val2-- != 0) {
                    // System.out.print(d + " ");
                    al.add(d);
                    if (j > n) {
                        lose = true;
                        break;
                    }
                    j++;
                }
            }
            if (lose) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < al.size(); i++) {
                    if (i != al.size() - 1) {
                        System.out.print(al.get(i) + " ");
                    } else {
                        System.out.println(al.get(i));
                    }
                }
            }
        }
    }
}
