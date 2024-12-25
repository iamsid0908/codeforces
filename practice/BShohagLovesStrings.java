import java.util.HashSet;
import java.util.Scanner;

public class BShohagLovesStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            HashSet<Character> hs = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                hs.add(s.charAt(i));
            }
            if (s.length() == 1) {
                System.out.println(-1);
                continue;

            }
            String ss = "";
            boolean loose = false;
            if (hs.size() == s.length()) {
                if (s.length() >= 3) {
                    System.out.println(s.substring(0, 3));
                } else {
                    System.out.println(-1);
                }
            } else {
                for (int i = 0; i < s.length(); i++) {
                    if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                        String str = String.valueOf(s.charAt(i));
                        String str1 = String.valueOf(s.charAt(i + 1));
                        // System.out.println(str + str1);
                        ss = str + str1;
                        break;
                    } else if (i + 2 < s.length() && s.charAt(i) != s.charAt(i + 1)
                            && s.charAt(i + 1) != s.charAt(i + 2) && s.charAt(i) != s.charAt(i + 2)) {
                        String str = String.valueOf(s.charAt(i));
                        String str1 = String.valueOf(s.charAt(i + 1));
                        String str2 = String.valueOf(s.charAt(i + 2));
                        // String str3 = String.valueOf(s.charAt(i + 3));

                        // System.out.println(str + str1 + str2 + str3);
                        ss = str + str1 + str2;
                        break;
                    } else {
                        loose = true;
                    }
                }
            }
            if (ss.equals("") && loose == true) {
                System.out.println(-1);
            } else {
                System.out.println(ss);
            }

        }
    }

}
