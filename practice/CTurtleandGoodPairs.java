import java.util.Scanner;

public class CTurtleandGoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int cnt = n;
            int hash[] = new int[26];
            for (char ch : s.toCharArray()) {
                hash[ch - 'a']++;
            }
            StringBuilder str = new StringBuilder("");
            while (cnt > 0) {
                for (int i = 0; i < 26; i++) {
                    if (hash[i] > 0) {
                        str.append((char) (i + 'a') + "");
                        hash[i]--;
                        cnt--;
                    }
                }
            }
            System.out.println(str);
        }
    }
}
