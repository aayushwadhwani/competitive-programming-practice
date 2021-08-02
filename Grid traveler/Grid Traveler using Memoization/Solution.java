import java.util.HashMap;

class Solution
{
    static HashMap<String,Long> memo = new HashMap<>();
    static long grid_traveler(int m, int n)
    {
        String key = m+","+n;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        if( m == 1 && n == 1)
            return 1;
        if( m == 0 || n == 0)
            return 0;
        memo.put(key, grid_traveler(m-1, n) + grid_traveler(m, n-1));
        return memo.get(key);
    }
    public static void main(String[] args) 
    {
        System.out.println(grid_traveler(1,1));
        System.out.println(grid_traveler(2,3));
        System.out.println(grid_traveler(3,2));
        System.out.println(grid_traveler(3,3));
        System.out.println(grid_traveler(18,18));
    }
}
