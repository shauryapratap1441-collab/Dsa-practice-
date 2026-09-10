import java.util.*;
class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            sb.append(ch);
        }
        sb.reverse();
        StringBuilder result=new StringBuilder();
        int k=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            result.append(sb.charAt(k++));
            else
            result.append(ch);
        }
        return result.toString();
    }
}