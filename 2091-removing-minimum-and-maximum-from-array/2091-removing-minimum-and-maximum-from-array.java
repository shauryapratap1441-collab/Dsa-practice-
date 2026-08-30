class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int mini=-1,maxi=-1;
        for(int i=0;i<nums.length;i++){
           if(nums[i]<min){
            min=nums[i];
            mini=i;
           }
            if(nums[i]>max){
            max=nums[i];
            maxi=i;
           }
        }
        int front=Math.max(maxi,mini)+1;
        int back=nums.length-Math.min(maxi,mini);
        int mix=Math.min(maxi,mini)+1+(nums.length-Math.max(maxi,mini));
        return Math.min(front,Math.min(back,mix));
    }
}