import java.util.*;
class Solution {
    public List<String> partitionString(String s) {
        List<String> list=new ArrayList<>();
        if(s.length()==0) return list;
        Set<String> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sb.append(ch);
            if(!set.contains(sb.toString())){
            set.add(sb.toString());   
            list.add(sb.toString());
            sb.setLength(0);
            }
        }
        return list;
    }
}