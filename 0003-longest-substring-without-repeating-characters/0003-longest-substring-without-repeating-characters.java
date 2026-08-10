class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,cl=0,max=0;
        boolean seen[]=new boolean[128];
        while(right<s.length())
        {
                while(seen[s.charAt(right)])
                {
                    seen[s.charAt(left)]=false;
                    left++;
                }
                seen[s.charAt(right)]=true;
                cl=right-left+1;
                max=Math.max(max,cl);
                right++;
            }
        return (max);
    }
}