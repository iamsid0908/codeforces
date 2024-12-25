import java.math.BigInteger;
import java.util.Scanner;

public class CLongMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            StringBuilder a = new StringBuilder(sc.next());
            StringBuilder b = new StringBuilder(sc.next());
            BigInteger numA = new BigInteger(a.toString());
            BigInteger numB = new BigInteger(b.toString());

            BigInteger diff = numA.subtract(numB).abs(); // Initial difference

            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    // Swap characters temporarily
                    char temp = a.charAt(i);
                    a.setCharAt(i, b.charAt(i));
                    b.setCharAt(i, temp);

                    // Calculate new difference
                    BigInteger newNumA = new BigInteger(a.toString());
                    BigInteger newNumB = new BigInteger(b.toString());
                    BigInteger diff2 = newNumA.subtract(newNumB).abs();

                    if (diff2.compareTo(diff) < 0) {
                        diff = diff2;
                    } else {
                        // Swap back if no improvement
                        char temp1 = a.charAt(i);
                        a.setCharAt(i, b.charAt(i));
                        b.setCharAt(i, temp1);
                    }
                }
            }
            System.out.println(a);
            System.out.println(b);

        }
    }
}
