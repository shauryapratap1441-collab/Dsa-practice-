class Solution {
    public int[] sortedSquares(int[] nums) {
        int a[]=new int[nums.length];
        int l=0,r=nums.length-1,pos=nums.length-1;
        while(l<=r){
            if(Math.abs(nums[r])>Math.abs(nums[l]))
            {
                a[pos]=nums[r]*nums[r];
                r--;
            }
            else{
                a[pos]=nums[l]*nums[l];
                l++;
            }
            pos--;
        }
        return a;
    }
}