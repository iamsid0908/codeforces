import java.util.ArrayList;
import java.util.Scanner;

public class ABinaryCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> res = new ArrayList<Integer>();
            while (n > 0) {
                if ((n & 1) > 0) {
                    if ((n & 2) > 0) {
                        res.add(-1);
                        n += 2;
                    } else {
                        res.add(1);
                    }
                } else {
                    res.add(0);
                }
                n >>= 1;
            }
            System.out.println(res.size());
            for (int i : res)
                System.out.print(i + " ");
            System.out.println();
        }
        sc.close();

    }
}
