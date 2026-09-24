import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0) return new ArrayList<>();
        Map<String,List<String>> map= new HashMap<>();
        for(String s:strs){
            char a[]=s.toCharArray();
            Arrays.sort(a);
            String key=String.valueOf(a);
            map.computeIfAbsent(key,k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}