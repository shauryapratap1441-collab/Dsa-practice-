import java.util.*;
class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        for(int i=0;i<t.length();i++)
        map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        char ch=' ';
        for(Map.Entry<Character,Integer> entry:map2.entrySet()){
             if (entry.getValue() != map1.getOrDefault(entry.getKey(), 0)) {
        ch = entry.getKey();
        break;
    }
        }
        return ch;
    }
}