import java.util.Scanner;

public class C1ShohagLovesXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long m = sc.nextLong();
            long count = 0;
            for (long i = 1; i <= Math.min(m, 2 * x); i++) {
                if (x != i) {
                    long val = x ^ i;
                    if (val != 0 && (x % val == 0 || i % val == 0)) {
                        System.out.println(i);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
