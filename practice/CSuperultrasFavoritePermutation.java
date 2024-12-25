import java.util.ArrayList;
import java.util.Scanner;

public class CSuperultrasFavoritePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long n = sc.nextInt();

            if (n < 5) {
                System.out.println(-1);
                continue;
            }
            ArrayList<Long> al = new ArrayList<>();
            for (long i = 1; i <= n; i = i + 2) {
                if (i != 5) {
                    al.add(i);
                }
            }
            al.add((long) 5);
            al.add((long) 4);
            for (long i = 2; i <= n; i = i + 2) {
                if (i != 4) {
                    al.add(i);
                }
            }
            for (int i = 0; i < al.size(); i++) {
                if (i != al.size() - 1) {
                    System.out.print(al.get(i) + " ");
                } else {
                    System.out.println(al.get(i));
                }
            }

        }
    }
}
