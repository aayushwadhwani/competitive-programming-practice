import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    private static final String HashMap = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int T = 0; T < t; T++) {
            int z = sc.nextInt();
            sc.nextLine();
            String a = sc.nextLine();
            HashMap<Character, Boolean> map = new HashMap<>();
            int i;
            for (i = 0; i < a.length(); i++) {
                char curr = a.charAt(i);
                if (map.containsKey(curr)) {
                    System.out.println("NO");
                    break;
                }
                map.put(curr, true);
                while (i != a.length() && a.charAt(i) == curr)
                    i++;
                i--;
            }
            // System.out.println(i);
            if (i == a.length())
                System.out.println("YES");

            // System.out.println(t);
        }
    }
}