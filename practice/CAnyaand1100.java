import java.util.ArrayList;
import java.util.Scanner;

public class CAnyaand1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            String s1 = sc.next();
            StringBuilder s = new StringBuilder(s1);
            int q = sc.nextInt();
            int count = 0;
            ArrayList<String> al = new ArrayList<>();
            for (int i = 0; i <= s.length() - 4; i++) {
                if (s.substring(i, i + 4).equals("1100")) {
                    count++;
                }
            }
            for (int i = 0; i < q; i++) {
                int idx = sc.nextInt();
                char c = sc.next().charAt(0);
                idx--;
                for (int j = idx - 3; j <= idx; j++) {
                    if (fun(j, s)) {
                        count--;
                    }
                }
                s.setCharAt(idx, c);
                for (int j = idx - 3; j <= idx; j++) {
                    if (fun(j, s)) {
                        count++;
                    }
                }
                if (count > 0) {
                    al.add("Yes");
                } else {
                    al.add("No");
                }
            }
            // System.out.println(al);
            for (String ele : al) {
                System.out.println(ele);
            }

        }
    }

    public static boolean fun(int index, StringBuilder s) {
        int N = s.length();
        return 0 <= index && index + 4 <= N && s.substring(index, index + 4).equals("1100");
    }
}
