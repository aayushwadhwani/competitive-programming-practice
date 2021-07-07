import java.util.Scanner;

public class Solution{

    public static int calculateJewels(String jewels, String stones)
    {
        int count = 0;
        for(int stone=0; stone<stones.length(); stone++)
        {
            char isStone = stones.charAt(stone);
            for(int jewel=0; jewel<jewels.length();jewel++)
            {
                if(jewels.charAt(jewel) == isStone)
                {
                    count++;
                    continue;
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String jewels = sc.nextLine();
        String stones = sc.nextLine();
        System.out.println(calculateJewels(jewels, stones));
    }
}