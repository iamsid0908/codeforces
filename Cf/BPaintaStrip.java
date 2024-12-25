import java.util.Scanner;

public class BPaintaStrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            int i = 1;
            int idx = 0;
            while (i <= n) {
                count++;
                idx = i;
                i = (i * 2) + 2;
            }
            if (idx == n) {
                System.out.println(count);
            } else {
                // sout
            }

        }
    }
}
