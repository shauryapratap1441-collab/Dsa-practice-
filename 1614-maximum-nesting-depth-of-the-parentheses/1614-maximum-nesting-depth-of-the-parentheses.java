class Solution {
    public int maxDepth(String s) {
        int cc=0,maxcount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')
            cc++;
            else if(ch==')'){
                maxcount=Math.max(cc,maxcount);
                cc--;
            }
        }
        return maxcount;
    }
}