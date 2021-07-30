import java.util.*;
class Solution
{
    static HashMap <Integer,Long> memo = new HashMap<>();

    static long fibo(int n){
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n <= 2)
            return 1;
        else
           memo.put(n,fibo(n-1) + fibo(n-2));
           return memo.get(n);
    }
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        System.out.println( "fibo("+n+") = "+fibo(n));
    }
}
