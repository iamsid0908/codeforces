import java.util.ArrayList;
import java.util.Scanner;

public class BBANBAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int i = 1;
            int j = (3 * n);
            ArrayList<Integer> al = new ArrayList<>();
            while (i < j) {

                // System.out.print(" " + (i) + " " + (j) + " ");
                al.add(i);
                al.add(j);
                i = i + 3;
                j = j - 3;

            }
            System.out.println(al.size() / 2);
            for (int g = 0; g < al.size(); g++) {
                if (g != al.size() - 1) {
                    System.out.print(al.get(g) + " ");
                } else {
                    System.out.println(al.get(g));
                }
            }

        }
    }
}
