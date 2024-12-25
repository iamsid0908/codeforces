import java.util.ArrayList;
import java.util.Scanner;

public class BXORSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            ArrayList<Long> al = new ArrayList<>();
            ArrayList<Long> al2 = new ArrayList<>();

            for (int i = 1; i < 100; i++) {
                al.add((int) i ^ x);
            }
            for (int i = 1; i < 100; i++) {
                al2.add((int) i ^ y);
            }
            System.out.println(al);
            System.out.println(al2);

        }
    }
}
