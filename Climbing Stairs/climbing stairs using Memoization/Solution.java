import java.util.HashMap;
class Solutionn {
    public int climb(int n, HashMap<Integer,Integer> memo){
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        memo.put(n,climb(n-1,memo)+climb(n-2,memo));
        return memo.get(n);
    }
    public int climbStairs(int n) {
        return climb(n, new HashMap<Integer,Integer>());
    }
}

class Solution{
    public static void main(String[] args) {
        Solutionn obj = new Solutionn();
        System.out.println(obj.climbStairs(44)); // done in couple of seconds.
    }
}
