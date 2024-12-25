import java.util.HashSet;
import java.util.Scanner;

public class CEvenPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            String s1 = sc.next();
            StringBuilder s = new StringBuilder(s1);
            s.setCharAt(0, '(');
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == '_') {
                    if (s.charAt(i - 1) == ')') {
                        s.setCharAt(i, '(');
                    } else if (s.charAt(i - 1) == '(') {
                        s.setCharAt(i, ')');
                    }
                }
            }
            // System.out.println(s);
            int ans = 0;
            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    for (int j = i + 1; j < s.length(); j++) {
                        if (s.charAt(j) == ')' && !hs.contains(j)) {
                            ans = ans + (j - i);
                            hs.add(j);
                            break;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
