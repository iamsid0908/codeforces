
import java.util.Scanner;

public class BXORAverage {

    public static void main(String[] args) {
        // int n=Sc
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            if (n % 2 == 1) {
                for (int i = 1; i <= n; i++) {
                    if (i != n) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.println(1);
                    }
                }
            } else {
                System.out.print((1) + " " + (3) + " ");
                for (int i = 0; i < n - 2; i++) {
                    if (i != n - 3) {
                        System.out.print(2 + " ");
                    } else {
                        System.out.println(2);
                    }
                }
            }
        }
    }
}
