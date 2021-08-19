class Solution {
    public boolean check(int citu, int[] count, int[] citations,int max) {
        int len = count.length;
        if(max == citu){
            if(count[citu] >= citu){
                return true;
            }
        }
        if(count[citu+1] > citu) {
            return false;
        }else if(count[citu+1] == citu) {
            return true;
        }else{
            if(count[citu] >= citu && citu!=0){
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
        if(max+1 != 1){
            for(int j = max-1; j>=0; j--){
                count[j] += count[j+1];
            }
        }else{
            return 0;
        }
        for(int i = 0; i <= max; i++) {
            if(check(i, count, citations,max)){
                return i;
            }
        }
        return 0;
    }
}