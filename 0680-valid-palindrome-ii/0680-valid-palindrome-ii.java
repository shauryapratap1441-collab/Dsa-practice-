class Solution {
    public boolean validPalindrome(String s) {
        int left=0,right=s.length()-1;
        while(left<right){
           if(s.charAt(left)!=s.charAt(right))
           return helper(s,left+1,right)||helper(s,left,right-1);
           left++;
           right--;
        }
        return true;
    }
    public boolean helper(String S,int left,int right){
        int count=0;
        while(left<right){
           if(S.charAt(left)!=S.charAt(right))
           count++;
           left++;
           right--;
        }
        return count==0;
    }
}