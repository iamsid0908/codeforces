import java.lang.reflect.Array;
import java.util.*;

public class CAssemblyviaRemainders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            n--;
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }

            ArrayList<Integer> al = new ArrayList<>();

            int max = 0;
            for (int ele : a) {
                max = Math.max(max, ele);
            }
            int val = max + 100;
            al.add(val);
            for (int i = 0; i < a.size(); i++) {
                val = val + a.get(i);
                al.add(val);
            }
            for (int ele : al) {
                System.out.print(ele + " ");
            }
            System.out.println();

        }
    }
}
