class Solution {
    public int lengthOfLongestSubstring(String s) {
       int left=0,right=0,cl=0,max=Integer.MIN_VALUE;
       boolean seen[]=new boolean[128];
       while(right<s.length()){
        char ch=s.charAt(right);
        while(seen[ch]){
            seen[s.charAt(left)]=false;
            left++;
        }
        seen[ch]=true;
        cl=right-left+1;
        max=Math.max(cl,max);
        right++;
       }
       return(max==Integer.MIN_VALUE)? 0: max;
    }
}