import java.util.Scanner;

public class ASplittheMultiset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(fun(n, k));
        }
    }

    public static int fun(int n, int k) {
        if (n == 1) {
            return 0;
        }
        if (n <= k) {
            return 1;
        }
        int val = (int) Math.ceil((double) (n - 1) / (k - 1));
        return val;

    }

}
