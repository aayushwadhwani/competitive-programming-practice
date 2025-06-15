import java.util.Arrays;

class Solution {
    public static int[] applyOperations(int[] nums) {
        System.out.println("here");
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }

        int f = 0;
        int s = 1;
        while(f < nums.length-1) {
            if (nums[f] != 0) {
                f++;
                s++;
                continue;
            }
            while(s < nums.length && nums[s] == 0) {
                s++;
            }
            if (s == nums.length)
                break;
            int temp = nums[f];
            nums[f] = nums[s];
            nums[s] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(applyOperations(nums)));
    }
}