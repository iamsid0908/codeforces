import java.util.Scanner;

public class DSlavicExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            String s = sc.next();
            String t1 = sc.next();
            int i = s.length() - 1;
            int j = t1.length() - 1;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb1 = new StringBuilder(s);
            while (i >= 0 && j >= 0) {
                if (s.charAt(i) == t1.charAt(j)) {
                    // sb.append(t1.charAt(j));
                    i--;
                    j--;
                } else if (s.charAt(i) == '?') {
                    sb.append(t1.charAt(j));
                    i--;
                    j--;
                } else {
                    // sb.append(s.charAt(i));
                    i--;
                }
            }
            // sb.reverse();
            // System.out.println(sb.toString());
            int q1 = 0;
            for (int q = sb1.length() - 1; q >= 0 && q1 < sb.length(); q--) {
                if (sb1.charAt(q) == '?') {
                    sb1.setCharAt(q, sb.charAt(q1));
                    q1++;
                }
            }
            // System.out.println(sb1);
            for (int a = 0; a < sb1.length(); a++) {
                if (sb1.charAt(a) == '?') {
                    sb1.setCharAt(a, 'a');
                }
            }
            boolean val = fun(t1, sb1.toString());
            if (val) {
                System.out.println("Yes");
                System.out.println(sb1.toString());
            } else {
                System.out.println("No");
            }
        }

        // }
    }

    public static boolean fun(String s, String t) {
        // System.out.println(s);
        // System.out.println(t);
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        int j = t.length() - 1;
        while (i >= 0 && j >= 0) {
            if (t.charAt(j) == s.charAt(i)) {
                sb.append(s.charAt(i));
                i--;
                j--;
            } else {
                j--;
            }
        }
        // System.out.println(sb);
        sb.reverse();
        if (s.equals(sb.toString())) {
            return true;
        }
        return false;
    }
}
