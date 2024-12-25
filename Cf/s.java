import java.util.*;

public class s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            String s = sc.next();
            int idx = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    idx = i;
                    break;
                }
            }
            if (idx != 0) {
                System.out.println(1 + " " + s.length() + " " + (1) + " " + (s.length() - (idx)));
            } else {
                System.out.println(1 + " " + s.length() + " " + s.length() + " " + s.length());

            }
        }
    }
}