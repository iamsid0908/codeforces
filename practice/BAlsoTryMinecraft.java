import java.util.ArrayList;
import java.util.Scanner;

public class BAlsoTryMinecraft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- != 0) {
        long n = sc.nextInt();
        long m = sc.nextInt();
        long[] arr = new long[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();

        }
        long[] forw = new long[(int) n];
        long[] back = new long[(int) n];

        for (int i = 1; i < n; i++) {
            forw[i] = forw[i - 1] + Math.max(0, arr[i - 1] - arr[i]);
        }

        for (int i = (int) n - 2; i >= 0; i--) {
            back[i] = back[i + 1] + Math.max(0, arr[i + 1] - arr[i]);
        }
        // System.out.println(Arrays.toString(forw));
        // System.out.println(Arrays.toString(back));

        ArrayList<Long> al = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            a--;
            b--;

            if (a < b) {
                al.add(forw[b] - forw[a]);
            } else if (a > b) {
                al.add(back[b] - back[a]);
            }
        }
        // System.out.println(al);
        for (int i = 0; i < al.size(); i++) {
            if (i != al.size() - 1) {
                System.out.print(al.get(i) + " ");
            } else {
                System.out.println(al.get(i));
            }
        }
        // }
    }
}
