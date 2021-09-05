class Solution {
    public HashMap<Integer,Integer> memo = new HashMap<Integer,Integer>();
    public int getVal(int lo)
    {
        if(memo.containsKey(lo)) return memo.get(lo);
        if(lo == 1) return 0;
        int temp;
        if(lo%2 == 0)
        {
            temp = lo/2;
            memo.put(temp,getVal(temp));
            return 1+memo.get(temp);
        }else{
            temp = lo*3+1;
            memo.put(temp,getVal(temp));
            return 1+memo.get(temp);
        }
    }
    public int getKth(int lo, int hi, int k) {
        TreeMap<Integer, ArrayList<Integer>> forans = new TreeMap<Integer, ArrayList<Integer>>();
        for(int i=lo; i<=hi; i++)
        {
            int ans = getVal(i);
            if(forans.containsKey(ans)){
                 forans.get(ans).add(i);   
            }
            else{
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(i);
                forans.put(ans,temp);   
            }
        }
        ArrayList<Integer> ansList = new ArrayList<Integer>();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : forans.entrySet()){
            ansList.addAll(entry.getValue());
        }
        return ansList.get(k-1);
    }
}