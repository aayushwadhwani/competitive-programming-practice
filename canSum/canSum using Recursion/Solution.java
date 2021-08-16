class Solution 
{
    public static boolean canSum(int total,int[] numbers)
    {
        if(total == 0){
            return true;
        }
        if(total<0)
            return false;
        for (int num : numbers) 
        {
            int remainder = total-num;
            if(canSum(remainder, numbers)){
                return true;
            } 
        }
        return false;
    }
    public static void main(String[] args) 
    {
        System.out.println(canSum(7,new int[]{2,4}));
    }   
}
