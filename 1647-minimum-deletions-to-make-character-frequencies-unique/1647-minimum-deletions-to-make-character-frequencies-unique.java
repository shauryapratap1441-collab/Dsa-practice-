import java.util.*;
class Solution {
    public int minDeletions(String s) {
       Map<Character,Integer> map=new HashMap<>();
       for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       }
       int count=0;
       Set<Integer> set=new HashSet<>();
       for(Map.Entry<Character,Integer> entry : map.entrySet()){
        int val=entry.getValue();
            while(set.contains(val)){
                val--;
                count++;
            }
            if(val>0)
            set.add(val);
       }
       return count;
    }
}