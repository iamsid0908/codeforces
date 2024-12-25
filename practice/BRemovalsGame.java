import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BRemovalsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            ArrayList<Long> al1 = new ArrayList<>();
            ArrayList<Long> al2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                al1.add(sc.nextLong());
            }
            for (int i = 0; i < n; i++) {
                al2.add(sc.nextLong());
            }
            if (al1.equals(al2)) {
                System.out.println("Bob");
                continue;
            }
            Collections.reverse(al1);

            if (al1.equals(al2)) {
                System.out.println("Bob");
                continue;
            }
            System.out.println("Alice");
        }
    }
}
