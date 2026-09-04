public class Main {
    
    public static int firstStableIndex(int[] nums, int k) {
        int length = nums.length;
        
        int current_min = Integer.MAX_VALUE;
        int current_max = Integer.MIN_VALUE;
        
        int[] min_array = new int[length];

        for(int i = 0; i < length; i++) {
            int from_last_index = length-1-i;
            min_array[from_last_index] = Math.min(current_min, nums[from_last_index]);
            current_min = min_array[from_last_index];
        }

        for(int i = 0; i < length; i++) {
            current_max = Math.max(current_max, nums[i]);
            if((current_max - min_array[i]) <= k) {
                return i;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(firstStableIndex(new int[]{5,0,1,4}, 3)); // Output: 3
    }
}