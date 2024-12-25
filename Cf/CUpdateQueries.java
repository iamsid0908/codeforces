import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CUpdateQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), l = 0;
            String[] s = sc.next().split(""), c;
            Set<Integer> set = new TreeSet<>();
            for (int i = 0; i < m; i++)
                set.add(sc.nextInt());
            c = sc.next().split("");
            Arrays.sort(c);
            for (Integer a : set)
                s[a - 1] = c[l++];
            for (String value : s)
                System.out.print(value + "");
            System.out.println();

        }

    }
}
