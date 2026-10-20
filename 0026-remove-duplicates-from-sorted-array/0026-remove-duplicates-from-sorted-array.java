class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0,k=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(k!=nums[i])
            {
                k=nums[i];
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
}
}