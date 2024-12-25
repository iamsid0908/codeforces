import java.util.Scanner;

public class ADefiniteGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        long n = sc.nextInt();
        long h = 0;
        for (long i = n - 1; i > 0; i--) {
            if (n % i != 0) {
                h = i;
                break;
            }
        }
        System.out.println(n - h);
        // }
    }
}
