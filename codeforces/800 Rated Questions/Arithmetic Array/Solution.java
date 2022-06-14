import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }
            if (sum <= 0)
                System.out.println(1);
            else if (n > sum) {
                System.out.println(1);
            } else {
                System.out.println(sum - n);
            }
        }
    }
}