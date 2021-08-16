import java.util.*;

class Solution {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        sc.next();
        for (int i = 1; i <= t; i++) {
            int n = 0, ans = 0;
            n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                if (map.containsKey(arr[j]))
                    map.put(arr[j], map.get(arr[j]) + 1);
                else
                    map.put(arr[j], 1);
            }
            int value = 0;
            for (int j = 0; j < n; j++) {
                if (map.get(arr[j]) != 0) {
                    map.put(arr[j], map.get(arr[j]) - 1);
                    for (Map.Entry<Integer, Integer> mapElement : map.entrySet()) {
                        int key = (int) mapElement.getKey();
                        if (key != arr[j])
                            if ((int) mapElement.getValue() != 0)
                                value += 1;
                    }
                }
            }
            System.out.println(value*2);
        }
    }
}