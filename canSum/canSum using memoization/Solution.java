import java.util.*;
class Solution
{
    public static boolean canSum(int number, int[] numbers, HashMap<Integer,Boolean> memo)
    {
        if(memo.containsKey(number)){
            return memo.get(number);
        }
        if(number == 0)
            return true;
        if(number<0)
            return false;
        
        for (int i : numbers) {
            int remainder = number - i;
            if(canSum(remainder, numbers, memo)){
                memo.put(number, true);
                return true;
            }
        }
        memo.put(number,false);
        return false;
    }
    public static void main(String[] args) 
    {
        System.out.println(canSum(7, new int[]{2,4}, new HashMap<Integer,Boolean>()));
        System.out.println(canSum(7, new int[]{2,3}, new HashMap<Integer,Boolean>()));
        System.out.println(canSum(7, new int[]{5,3,4,7}, new HashMap<Integer,Boolean>()));
        System.out.println(canSum(8, new int[]{2,3,5}, new HashMap<Integer,Boolean>()));
        System.out.println(canSum(300, new int[]{7,14}, new HashMap<Integer,Boolean>()));
    }
}