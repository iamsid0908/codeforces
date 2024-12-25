import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DManhattanCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = 0, m = 0;

            // Validate the dimensions
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            }
            if (sc.hasNextInt()) {
                m = sc.nextInt();
            }
            ArrayList<String> al = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                al.add(sc.next());
            }

            // Initialize the matrix
            char[][] arr = convertTo2DArray(al);

            // for (int i = 0; i < n; i++) {
            // for (int j = 0; j < m; j++) {
            // arr[i][j] = sc.next().charAt(0);
            // }
            // }

            int maxRow = 0, maxCol = 0;
            int rowIdx = -1, colIdx = -1;

            // Find the row with the maximum '#'
            for (int i = 0; i < n; i++) {
                int hashCount = 0;
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == '#') {
                        hashCount++;
                    }
                }
                if (hashCount > maxRow) {
                    maxRow = hashCount;
                    rowIdx = i;
                }
            }

            // Find the column with the maximum '#'
            for (int i = 0; i < m; i++) {
                int hashCount = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j][i] == '#') {
                        hashCount++;
                    }
                }
                if (hashCount > maxCol) {
                    maxCol = hashCount;
                    colIdx = i;
                }
            }

            // Output the 1-based row and column index
            System.out.println((rowIdx + 1) + " " + (colIdx + 1));
        }
    }

    public static char[][] convertTo2DArray(List<String> list) {
        int rows = list.size();
        int cols = list.get(0).length(); // Assuming all strings are of equal length
        char[][] array = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            array[i] = list.get(i).toCharArray();
        }

        return array;
    }
}
