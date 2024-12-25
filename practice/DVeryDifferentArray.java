import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DVeryDifferentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            for (int i = 0; i < m; i++) {
                b.add(sc.nextInt());
            }
            Collections.sort(a);
            Collections.sort(b);
            Collections.reverse(b);
            ArrayList<Integer> al = new ArrayList<>();
            int i=0;
            int j=0;
            while(i<n){
                
            }

        }
    }
}
