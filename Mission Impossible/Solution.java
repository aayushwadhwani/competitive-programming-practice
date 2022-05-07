import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // ArrayList<Byte> ans = new ArrayList<>();
        for(int T=1; T<=n; T++)
        {
            LinkedList<Character> ans = new LinkedList<>();
            int numOfRows = sc.nextInt();
            for(int i=0;i<numOfRows;i++)
            {
                int largest = Integer.MIN_VALUE;
                for(int j=0; j<=4;j++)
                {
                    int c = sc.nextInt();
                    if(c > largest){
                        largest = c;
                    }
                }
                String largest_s = Integer.toString(largest);
                int l = largest_s.length();
                for(int j=0; j<l;j++)
                {
                    ans.add(largest_s.charAt(j));
                }
            }
            int l_a = ans.size();
            for(int j=l_a-1; j>=0; j--)
                System.out.print(ans.get(j));
            System.out.println();
        }
        sc.close();
    }
}