import java.util.*;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int a=0,b=0;
        while(a<word1.length()&&b<word2.length()){
            sb.append(word1.charAt(a++));
            sb.append(word2.charAt(b++));
        }
        if(a<word1.length())
        sb=sb.append(word1.substring(a));
        else if(b<word2.length())
        sb=sb.append(word2.substring(b));
        return sb.toString();
    }
}