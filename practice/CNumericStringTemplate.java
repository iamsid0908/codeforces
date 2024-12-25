import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CNumericStringTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            ArrayList<String> al = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                al.add(sc.next());
            }
            for (int i = 0; i < m; i++) {
                if (arr.length != al.get(i).length()) {
                    System.out.println("No");
                    continue;
                }
                fun(arr, al.get(i));
            }
        }
    }

    public static void fun(int[] arr, String s) {
        HashMap<Integer, Character> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        boolean ok = true;
        for (int i = 0; i < arr.length; i++) {
            if (!map1.containsKey(arr[i]) && !map2.containsKey(s.charAt(i))) {
                map1.put(arr[i], s.charAt(i));
                map2.put(s.charAt(i), arr[i]);
            } else if ((map1.containsKey(arr[i]) && map1.get(arr[i]) != s.charAt(i))
                    || (map2.containsKey(s.charAt(i)) && !map2.get(s.charAt(i)).equals(arr[i]))) {
                ok = false;
                break;
            }

        }

        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
