import java.util.Scanner;

public class DBinaryCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            char previousChar = s.charAt(0); // Start with the first character
            sb.append(previousChar); // Add it to the result

            // Iterate through the string from the second character onwards
            for (int i = 1; i < s.length(); i++) {
                char currentChar = s.charAt(i);
                if (currentChar != previousChar) {
                    sb.append(currentChar); // Append only if it's different
                    previousChar = currentChar; // Update previousChar
                }
            }

            boolean flag = fun(sb.toString());
            if (sb.length() == 1) {
                System.out.println(1);
            } else if (flag) {
                System.out.println(sb.length() - 1);
            } else if (!flag) {
                System.out.println(sb.length());
            }

        }
    }

    public static boolean fun(String s) {
        return s.contains("01");
    }
}
