import java.util.*;

class Solution {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> to_return = new ArrayList<>();
        int len = pattern.length();
        int ans = 0;
        int ans_to_check = 0;
        byte current = 1;
        HashMap<Character,Byte> map = new HashMap<>();
        for(int i=len-1; i>=0; i--)
        {
            if(!map.containsKey(pattern.charAt(i)))
            {
                map.put(pattern.charAt(i),current);
                current++;
            }
            ans += map.get(pattern.charAt(i)) * ((int)Math.pow(10,(int)i));
        }
        ans_to_check = ans;
        for(int word=0; word<words.length; word++)
        {
            current = 1;
            map = new HashMap<>();
            ans = 0;
            String current_word = words[word];
            for(int i=len-1; i>=0; i--)
            {
                if(!map.containsKey(current_word.charAt(i)))
                {
                    map.put(current_word.charAt(i),current);
                    current++;
                }
                ans += map.get(current_word.charAt(i)) * ((int)Math.pow(10,(int)i));
            }
            if(ans_to_check == ans)
            {
                to_return.add(words[word]);
            }
        }
        return to_return;
    }
    public static void main(String[] args) 
    {
        System.out.println(findAndReplacePattern(new String[]{"abc","deq","mee","aqq","dkd","ccc"}, "abb"));
    }
}