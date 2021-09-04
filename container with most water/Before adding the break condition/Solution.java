class Solution {
    public int maxArea(int[] height) {
       int length = height.length;
        int maximum_water = 0;
        int start = 0;
        int end = length-1;
        if(end-start == 1) return (Math.min(height[start],height[end])*1);
        while(start != end){
            int current_water = Math.min(height[start],height[end])*(end-start);
            if(maximum_water < current_water) maximum_water = current_water;
            if(height[start] < height[end]) start++; 
            else if(height[start] > height[end]) end--;
            else {
               if(height[start+1] > height[end]) start++;
                else end --;
            }
        }
        return maximum_water;
    }
}