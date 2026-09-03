class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int a[]=new int[2*n];
        int j=0;
        for(int i=0;i<2;i++){
        for(int num:nums)
        a[j++]=num;
        }
        return a;
    }
}