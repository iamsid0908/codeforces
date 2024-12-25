import java.util.ArrayList;
import java.util.Scanner;

public class CYetAnotherCardDeck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        int[] b = new int[q];
        for (int i = 0; i < q; i++) {
            b[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int val : b) {
            // int idx=al.get(i)
            for (int j = 0; j < al.size(); j++) {
                if (al.get(j) == val) {
                    ans.add(j + 1);
                    int val2 = al.get(j);
                    al.remove(j);
                    al.add(0, val2);
                    break;
                }
            }
        }
        // System.out.println(ans);
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // }
    }
}
