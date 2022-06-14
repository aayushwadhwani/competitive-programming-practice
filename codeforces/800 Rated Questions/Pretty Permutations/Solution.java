import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                for (int i = 1; i <= n; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + 1 + " ");
                    } else {
                        System.out.print(i - 1 + " ");
                    }
                }
            } else {
                int m = n / 2 - 1;
                for (int i = 1; i <= 2 * m; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + 1 + " ");
                    } else {
                        System.out.print(i - 1 + " ");
                    }
                }
                System.out.print(n + " ");
                for (int i = 2 * m + 1; i < n; i++) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}