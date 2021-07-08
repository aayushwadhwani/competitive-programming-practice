import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static int[] buildArray(int[] nums)
    {
        int length = nums.length;
        int ans[] = new int[length];
        for(int i=0; i<length; i++)
        {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] nums = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}