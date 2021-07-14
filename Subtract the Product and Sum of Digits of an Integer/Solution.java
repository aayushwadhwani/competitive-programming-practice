class Solution
{
    static int subtractProductAndSum(int n)
    {
        int no = (int)Math.log10((double)(n));
        int product = 1, sum=0;
        for(int i=0; i<=no ; i++)
        {
            product *= n%10;
            sum += n%10;
            n /= 10;
        }
        return product-sum;
    }
    public static void main(String[] args) 
    {
        System.out.println(subtractProductAndSum(4421));
    }    
}
