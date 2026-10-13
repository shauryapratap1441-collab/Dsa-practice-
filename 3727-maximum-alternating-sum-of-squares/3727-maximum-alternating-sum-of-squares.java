class Solution {
    public long maxAlternatingSum(int[] nums) {
        if(nums.length==1) return (long)(nums[0]*nums[0]);
        for(int i=0;i<nums.length;i++) {
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long result=0;
        for(int i=0;i<nums.length;i++){
           if(i<nums.length/2) result-=nums[i]*nums[i];
           else result+=nums[i]*nums[i];
        }
        return result;
    }
}