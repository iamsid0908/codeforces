
import java.util.*;

public class BReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            StringBuilder s = new StringBuilder(sc.next());
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }
            int max = 0;
            int min = Integer.MAX_VALUE;
            String minstring = "";
            String maxstring = "";
            for (char c : map.keySet()) {
                char c1 = c;
                int val = map.get(c1);
                if (val >= max) {
                    max = val;
                    maxstring = String.valueOf(c1);
                }
                if (val < min) {
                    min = val;
                    minstring = String.valueOf(c1);
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == minstring.charAt(0)) {
                    s.setCharAt(i, maxstring.charAt(0));
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
