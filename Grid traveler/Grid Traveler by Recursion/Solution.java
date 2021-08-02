import java.util.HashMap;

class Solution
{
    static long grid_traveler(int m, int n)
    {
        if( m == 1 && n == 1)
            return 1;
        if( m == 0 || n == 0)
            return 0;
        return  grid_traveler(m-1, n) + grid_traveler(m, n-1);
    }
    public static void main(String[] args) 
    {
        System.out.println(grid_traveler(1,1));
        System.out.println(grid_traveler(2,3));
        System.out.println(grid_traveler(3,2));
        System.out.println(grid_traveler(3,3));
        System.out.println(grid_traveler(18,18));
    }

    //given a m by n grid return how many ways are there to go from (1,1) to (m,n)
    //if both m and n are 1 then we are to the destination else if any of m or n is 0 then we are actually not in the grid
    //else we have two choices from m and n either to right(n-1) or down(m-1) and continues.... 

    // as we can see for 18 by 18 grid it will be stuck becase of the same issue of re-working for the grid which has been worked previously
}