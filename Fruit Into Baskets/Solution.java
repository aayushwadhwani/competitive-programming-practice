public class Solution {

    public static int totalFruit(int[] fruits) {
        int first = -1;
        int second = -1;
        
        int max = Integer.MIN_VALUE;
        int curr_max = 0;
        int temp = 0;
        for(int fruit: fruits) {
            if(fruit == first || fruit == second) {
                curr_max += 1;
            } else {
                curr_max = temp + 1;
            }

            if(second == fruit) {
                temp++;
            } else {
                temp = 1;
                first = second;
                second = fruit;
            }
            max = Math.max(curr_max, max);
        }
        
        return max;
    }

    public static void main(String[] args) {
        System.out.println(totalFruit(new int[]{0,1,6,6,4,4,6}));
    }
}