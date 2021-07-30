import java.util.Scanner;

class Solution
{
    static int fibo(int n){
        if(n <= 2)
            return 1;
        else
            return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        System.out.println( "fibo("+n+") = "+fibo(n));
        n = sc.nextInt();
        System.out.println( "fibo("+n+") = "+fibo(n));
        n = sc.nextInt();
        System.out.println( "fibo("+n+") = "+fibo(n));

        //this code wont work properly if n>=47
        // so we will have to do some memoization
    }
}
