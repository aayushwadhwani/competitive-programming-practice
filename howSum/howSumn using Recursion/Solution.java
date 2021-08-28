import java.util.ArrayList;
import java.util.List;
class Solution
{
    public static ArrayList<Integer> howSum(int targetSum, int[] numbers)
    {
        if(targetSum == 0){
            return new ArrayList<Integer>();
        }
        if(targetSum < 0){
            return null;
        }

        for (int number : numbers) {
            int remainder = targetSum - number;
            ArrayList<Integer> ans = howSum(remainder, numbers);
            if(ans != null){
                // System.out.println(ans);
                ans.add(number);
                return ans;
            }
        }
        return null;
    }
    public static void main(String[] args) 
    {
        System.out.println(howSum(7,new int[]{2,3}));
        System.out.println(howSum(7,new int[]{5,3,4,7}));
        System.out.println(howSum(8,new int[]{2,3,5}));
        System.out.println(howSum(7,new int[]{2,4}));
    }
}