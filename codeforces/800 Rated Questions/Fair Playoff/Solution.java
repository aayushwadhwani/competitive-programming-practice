import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int max_1 = Integer.MIN_VALUE;
            int max_2 = Integer.MIN_VALUE;
            int max_11 = -1;
            int max_12 = -1;
            for (int i = 0; i < 4; i++) {
                int n = sc.nextInt();
                if (i == 0)
                    max_11 = n;
                else if (i == 1)
                    max_11 = Math.max(max_11, n);
                else if (i == 2)
                    max_12 = n;
                else if (i == 3)
                    max_12 = Math.max(max_12, n);

                if (n >= max_1) {
                    max_2 = max_1;
                    max_1 = n;
                } else if (n >= max_2) {
                    max_2 = n;
                }
            }
            if ((max_11 + max_12) - (max_1 + max_2) == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}