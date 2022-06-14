import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; ++i) {
            int a = sc.nextInt();
            int r = a % 3;
            int q = a / 3;
            if (r == 0)
                System.out.println(q + " " + q);
            else if (r == 1)
                System.out.println((q + 1) + " " + (q));
            else
                System.out.println((q) + " " + (q + 1));
        }
    }
}