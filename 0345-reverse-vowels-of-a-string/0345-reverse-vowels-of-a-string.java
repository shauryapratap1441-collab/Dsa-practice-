import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
            sb.append(ch);
        }
        sb.reverse();
        StringBuilder S=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
            if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
            S.append(sb.charAt(j++));
            else
            S.append(ch);
        }
        return S.toString();
    }
}