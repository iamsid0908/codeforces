import java.util.Scanner;

public class CTheLegendofFreyatheFrog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            // Read x, y, and k
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(Math.max(2 * ((x + k - 1) / k) - 1, 2 * ((y + k - 1) / k)));

        }
    }
}
