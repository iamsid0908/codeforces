import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AShohagLovesMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // System.out.println(100 % 6 + " " + 3 % 1);
        while (t-- > 0) {
            int n = sc.nextInt();

            List<Integer> sequence = new ArrayList<>();

            // Generate the sequence
            for (int i = 1; i <= 100; i++) {
                if (isValid(sequence, i)) {
                    sequence.add(i);
                }
                if (sequence.size() == n) {
                    break;
                }
            }

            for (int i = 0; i < sequence.size(); i++) {
                if (i != sequence.size() - 1) {
                    System.out.print(sequence.get(i) + " ");
                } else {
                    System.out.println(sequence.get(i));
                }
            }
        }
    }

    private static boolean isValid(List<Integer> seq, int newElement) {
        int index = seq.size();
        for (int j = 0; j < index; j++) {
            if (seq.get(j) % (j + 1) == newElement % (index + 1)) {
                return false;
            }
        }
        return true;
    }
}
