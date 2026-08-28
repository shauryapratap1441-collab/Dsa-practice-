import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        map1.put(magazine.charAt(i),map1.getOrDefault(magazine.charAt(i),0)+1);
        for(int i=0;i<ransomNote.length();i++)
        map2.put(ransomNote.charAt(i),map2.getOrDefault(ransomNote.charAt(i),0)+1);
        for(Map.Entry<Character,Integer> entry: map2.entrySet()){
            if(!map1.containsKey(entry.getKey()))
            return false;
            else{
                if(map1.get(entry.getKey())<entry.getValue())
                return false;
            }
        }
        return true;
    }
}