public class Solution {

    public static int minimumCost(int[] nums) {
        int min1 = nums[0];
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;

        int i = 1;
        int len = nums.length;

        while(i < len) {
            int curr = nums[i];
            if(curr <= min3) {
                min2 = min3;
                min3 = curr;
            } else if(curr <= min2) {
                min2 = curr;
            }
            i++;
        }
        return min1+min2+min3;
    }

    public static void main(String[] args) {
        System.out.println(minimumCost(new int[]{1,2,3,12}));
    }

}