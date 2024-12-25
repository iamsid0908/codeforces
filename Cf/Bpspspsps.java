
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Bpspspsps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            String s = sc.next();
            ArrayList<String> al = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                sb.append(i);
                al.add(Integer.toString(i));
            }
            // System.out.println(sb);
            boolean val1 = fun(s, sb, al);
            sb.reverse();
            Collections.reverse(al);
            boolean val2 = fun(s, sb, al);
            if (val1 || val2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean fun(String s, StringBuilder sb, ArrayList<String> al) {
        boolean loose = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                continue;
            } else if (s.charAt(i) == 'p') {
                HashSet<String> al1 = new HashSet<>();

                for (int a = 0; a <= i; a++) {
                    // s1.append(al.get(a));
                    al1.add(al.get(a));
                }
                boolean val = fun(al1);
                if (!val) {
                    loose = false;
                    break;
                }
            } else {
                HashSet<String> al1 = new HashSet<>();
                for (int a = i; a < s.length(); a++) {
                    // s1.append(al.get(a));
                    al1.add(al.get(a));
                }

                // String s1 = sb.substring(i, s.length());
                boolean val = fun(al1);
                if (!val) {
                    loose = false;
                    break;
                }
            }

        }
        return loose;
    }

    public static boolean fun(HashSet<String> al) {
        // System.out.println(al);
        int val = al.size();
        boolean loose = true;
        for (int i = 1; i <= val; i++) {
            String c = Integer.toString(i);
            if (al.contains(c)) {
                continue;
            } else {
                loose = false;
                break;
            }
        }
        return loose;
    }
}