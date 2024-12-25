import java.util.Scanner;
import java.util.Stack;

public class BUgu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long n = sc.nextInt();
            String s1 = sc.next();
            StringBuilder s = new StringBuilder(s1);

            Stack<Character> st = new Stack<>();
            st.push(s.charAt(0));
            for (int i = 1; i < s.length(); i++) {
                if (!st.isEmpty() && st.peek() != s.charAt(i)) {
                    st.push(s.charAt(i));
                }
            }
            Stack<Character> tempStack = new Stack<>();
            String s2 = "";

            while (!st.isEmpty()) {
                tempStack.push(st.pop());
            }

            while (!tempStack.isEmpty()) {
                s2 = s2 + tempStack.pop();
            }
            int count = 0;
            int count10 = 0;
            for (int i = 0; i < s2.length() - 1; i++) {
                if (s2.charAt(i) == '1' && s2.charAt(i + 1) == '0') {
                    count10++;
                }
            }
            for (int i = 0; i < s2.length() - 2; i++) {
                if (s2.charAt(i) == '1' && s2.charAt(i + 1) == '0' && s2.charAt(i + 2) == '1') {
                    count++;
                }
            }
            char one = s2.charAt(s2.length() - 1);
            if (one == '1' && count != 0) {
                System.out.println(count * 2);
            } else if (one == '0' && count10 != 0) {
                System.out.println((count10 * 2) - 1);
            } else {
                System.out.println(0);
            }
        }
    }
}
