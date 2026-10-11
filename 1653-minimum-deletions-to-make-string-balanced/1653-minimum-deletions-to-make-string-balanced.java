class Solution {
    public int minimumDeletions(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty()&&ch=='a'&&stack.peek()=='b'){
                count++;
                stack.pop();
            }
            else 
            stack.push(ch);
        }
        return count;
    }
}