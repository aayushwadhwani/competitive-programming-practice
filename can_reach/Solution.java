import java.util.Scanner;

class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int T=0; T<t; T++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            x = Math.abs(x);
            y = Math.abs(y);
            if(x%k == 0 && y%k == 0)
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }    
    }
}