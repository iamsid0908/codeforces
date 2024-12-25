import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class BGamewithDoors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int L = sc.nextInt();
            int R = sc.nextInt();
            HashSet<Integer> hs = new HashSet<>();
            HashSet<Integer> hs2 = new HashSet<>();

            for (int i = l; i <= r; i++) {
                hs.add(i);
                hs2.add(i);
            }
            for (int i = L; i <= R; i++) {
                hs2.add(i);
            }
            // System.out.println(hs2);
            int count = 0;
            HashSet<Integer> hs1 = new HashSet<>();
            for (int i = L; i <= R; i++) {
                if (hs.contains(i)) {
                    hs1.add(i);
                    count++;
                }
            }
            // System.out.println(hs1);
            List<Integer> list = new ArrayList<>(hs1);
            List<Integer> list1 = new ArrayList<>(hs2);
            Collections.sort(list);
            Collections.sort(list1);

            int count2 = 0;
            if (!list.isEmpty()) {
                if (list.get(0) == list1.get(0)) {
                    count2++;
                }
                if (list.get(list.size() - 1) == list1.get(list1.size() - 1)) {
                    count2++;
                }
            }

            System.out.println(count + 1 - count2);
        }
    }
}
