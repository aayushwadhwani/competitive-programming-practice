import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static int[] shuffle(int[] nums, int n)
    {
        int ans[] = new int[n*2];
        for(int i=0,j=0; i<n; i++,j+=2)
        {
            ans[j] = nums[i];
            ans[j+1] = nums[i+n];
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[] nums = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
}