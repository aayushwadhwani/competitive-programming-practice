class Solutionn {
    public int climb(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        
        int n_1 = climb(n-1);
        int n_2 = climb(n-2);
        
        return n_1+n_2;
    }
    public int climbStairs(int n) {
        return climb(n);
    }
}

class Solution{
    public static void main(String[] args) 
    {
        Solutionn obj = new Solutionn();
        System.out.println(obj.climbStairs(44)); // time limit excedded. 
        //memoize it
    }
}