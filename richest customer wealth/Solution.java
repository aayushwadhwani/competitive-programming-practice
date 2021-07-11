import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static int maximumWealth(int[][] accounts)
    {
        int sum = 0;
        int temp = sum;
        for (int[] account : accounts) 
        {
            for (int bank : account) 
            {
                sum += bank;
            }
            if(temp <sum)
            {
                temp = sum;
            }  
            sum = 0;          
        }
        return temp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));        
    }
}