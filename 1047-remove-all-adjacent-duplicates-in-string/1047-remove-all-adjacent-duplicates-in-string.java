import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.isEmpty())
            stack.push(ch);
            else{
                if(stack.peek()==ch)
                stack.pop();
                else
                stack.push(ch);
            }
        }
        if(stack.isEmpty())
        return "";
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
           sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}