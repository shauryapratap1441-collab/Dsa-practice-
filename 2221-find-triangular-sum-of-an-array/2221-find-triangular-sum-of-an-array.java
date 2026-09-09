class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int n=nums.length;
        while(n!=1){
            int a[]=new int[n-1];
            for(int i=0;i<a.length;i++)
            a[i]=(nums[i]+nums[i+1])%10;
            nums=a;
            n-=1;
        }
        return nums[0];
    }
}