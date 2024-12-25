
import java.util.Scanner;

public class BDoremyPerfectMathClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            int tmp = 0;

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                tmp = gcd(tmp, a[i]);
            }
            // System.out.println(tmp);

            System.out.println(a[n] / tmp + (a[1] == 0 ? 1 : 0));
            // System.out.println(hs);
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
