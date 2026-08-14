import java.util.*;
class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();
        int count=0;
        for(String word:words1)
        map1.put(word,map1.getOrDefault(word,0)+1);
        for(String word:words2)
        map2.put(word,map2.getOrDefault(word,0)+1);
        for(Map.Entry<String,Integer> entry:map1.entrySet()){
        if(map2.containsKey(entry.getKey())){
            if(map2.get(entry.getKey())==1&&entry.getValue()==1)
               count++;
        }
        }
        return count;
    }
}