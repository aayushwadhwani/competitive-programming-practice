class Solution {
    public boolean check(int citu, int[] count, int[] citations) {
        int len = count.length;
        // 3 0 6 1 5 ======= 1 1 0 1 0 1 1
        int sum = 0;
        for(int j = citu+1; j < len; j++) {
            sum += count[j];
        }
        if(sum > citu) {
            return false;
        }else if(sum == citu) {
            return true;
        }else {
            if(count[citu] >= citu-sum) {
                return true;
            }else{
                return false;
            }
        }
        
    }
    
    public int hIndex(int[] citations) {
        int len = citations.length, max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++) {
            max = Math.max(max, citations[i]);
        }
        int[] count = new int[max+1];
        
        for(int i = 0; i < len; i++) {
            count[citations[i]]++;
        }
        
        for(int i = 0; i <= max; i++) {
            if(check(i, count, citations)){
                return i;
            }
        }
        return 0;
    }
}