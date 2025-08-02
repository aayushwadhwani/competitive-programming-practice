import java.util.*;

class Solution {

    public static long minCost(int[] basket1, int[] basket2) {
        HashMap<Integer,Integer> basket1count = new HashMap<>();
        HashMap<Integer,Integer> basket2count = new HashMap<>();

        for(int i=0; i<basket1.length; i++) {
            basket1count.put(basket1[i],basket1count.getOrDefault(basket1[i], 0)+1);
            basket2count.put(basket2[i],basket2count.getOrDefault(basket2[i], 0)+1);
        }

        Set<Integer> all_fruits = new HashSet<>(basket1count.keySet());
        all_fruits.addAll(basket2count.keySet());

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        int min = Integer.MAX_VALUE;
        for (int val: all_fruits) {
            min = Math.min(min,val);

            int diff = basket1count.getOrDefault(val,0) - basket2count.getOrDefault(val,0);
            if(diff%2 != 0) {
                return -1;
            }

            if(diff > 0) {
                for(int i=0; i<diff/2;i++)
                    list1.add(val);
            } else if(diff < 0) {
                for(int i=0; i< -diff/2;i++)
                    list2.add(val);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2, Collections.reverseOrder());

        long ans = 0;
        for (int i=0; i< list1.size(); i++) {
            ans += Math.min((long)Math.min(list1.get(i), list2.get(i)), 2L * min);
        }
        return ans;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(minCost(new int[]{4,4,4,4,3}, new int[]{5,5,5,5,3}));
    }
}