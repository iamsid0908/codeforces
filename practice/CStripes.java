import java.util.ArrayList;
import java.util.Scanner;

public class CStripes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            String[][] c = new String[8][8];
            ArrayList<String> al = new ArrayList<>();
            for (int i = 0; i < 8; i++) {
                al.add(sc.next());
            }
            int cnt = 0;
            for (int i = 0; i < al.size(); i++) {
                if (al.get(i).equals("RRRRRRRR")) {
                    cnt++;
                }
            }
            if (cnt >= 1) {
                System.out.println("R");
            } else {
                System.out.println("B");
            }
            // for (int i = 0; i < c.length; i++) {
            // for (int j = 0; j < c[0].length; j++) {
            // if (sc.hasNext()) { // Check if there's more input
            // c[i][j] = sc.next();
            // } else {
            // System.out.println("Insufficient input data.");
            // return;
            // }
            // }
            // }

            // boolean red = false;

            // for (String[] row : c) {
            // int count = 0;
            // for (String cell : row) {
            // if (cell.equals(".")) {
            // break;
            // }
            // if (cell.equals("R")) {
            // count++;
            // }
            // }
            // if (count == 8) {
            // // System.out.println();
            // red = true;
            // break;
            // }
            // }
            // if (red == true) {
            // System.out.println("R");
            // } else {
            // System.out.println("B");
            // }
        }
    }
}

// R R R R R R B B
// . B . B . . B B
// R R R R R R B B
// . B . B . . B B
// . B . B . . B B
// R R R R R R B B
// . B . B . . B B
// . B . B . . B B

// . . . . . . . .
// . . . . . . . .
// . . . . . . . .
// R R R R R R R R
// . . . . . . . .
// . . . . . . . .
// . . . . . . . .
// . . . . . . . .