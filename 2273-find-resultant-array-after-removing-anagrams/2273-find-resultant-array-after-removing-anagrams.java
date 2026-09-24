import java.util.*;
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list=new ArrayList<>();
        String prev="";
        for(String s:words){
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String k=String.valueOf(c);
            if(!k.equals(prev)){
                prev=k;
                list.add(s);
            }
        }
        return list;
    }
}