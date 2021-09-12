import java.util.*;
public class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int len = a.length();
        char[] ans = new char[len];
        for(int i=0; i<len; i++)
        {
            if(a.charAt(i) == b.charAt(i)){
                ans[i] = '0';
            }else{
                ans[i] = '1';
            }
        }
        for (char c : ans) {
            System.out.print(c);
        }
    }
}