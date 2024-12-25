
import java.util.Scanner;

public class ALuckyNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            // int n=sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int maxx=Integer.MIN_VALUE;
            String s2="";
            int minn=Math.max(r-100,l);
            for (int i = minn; i <= r; i++) {
                String s = Integer.toString(i);
                int min = Character.getNumericValue(s.charAt(0));
                int max = Character.getNumericValue(s.charAt(0));

                for (int j = 0; j < s.length(); j++) {
                    int digit = Character.getNumericValue(s.charAt(j));

                    if (digit < min) {
                        min = digit;
                    }

                    if (digit > max) {
                        max = digit;
                    }
                }
                // maxx=Math.max(maxx,Math.abs(max-min));
                if(maxx<Math.abs(max-min)){
                    maxx=Math.abs(max-min);
                    s2=s;
                }
            }
            System.out.println(s2);
        }
    }
}
