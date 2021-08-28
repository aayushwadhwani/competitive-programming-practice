import java.util.ArrayList;
import java.util.HashMap;
class Solution
{
    public static ArrayList<Integer> howSum(int targetSum, int[] numbers, HashMap<Integer, ArrayList<Integer>> memo)
    {
        if(memo.containsKey(targetSum))
        {
            return memo.get(targetSum);
        }
        if(targetSum == 0)
        {
            memo.put(targetSum,new ArrayList<Integer>());
            return memo.get(targetSum);
        }
        if(targetSum < 0)
        {
            memo.put(targetSum,null);
            return memo.get(targetSum);
        }

        for (int number : numbers) 
        {
            int remainder = targetSum - number;
            ArrayList<Integer> ans = howSum(remainder, numbers, memo);
            if(ans != null)
            {
                ans.add(number);
                memo.put(number, ans);
                return memo.get(number);
            }   
        }
        memo.put(targetSum,null);
        return memo.get(targetSum);
    }

    public static void main(String[] args) 
    {
        System.out.println(howSum(7,new int[]{2,3}, new HashMap<Integer,ArrayList<Integer>>()));
        System.out.println(howSum(7,new int[]{5,3,4,7}, new HashMap<Integer,ArrayList<Integer>>()));
        System.out.println(howSum(8,new int[]{2,3,5}, new HashMap<Integer,ArrayList<Integer>>()));
        System.out.println(howSum(7,new int[]{2,4}, new HashMap<Integer,ArrayList<Integer>>()));
        System.out.println(howSum(300,new int[]{7,14}, new HashMap<Integer,ArrayList<Integer>>()));
    }    
}
