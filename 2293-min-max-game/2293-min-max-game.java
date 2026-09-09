class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int n=nums.length;
        while(n!=1){
            int a[]=new int[n/2];
            for(int i=0;i<a.length;i++){
               if(i%2==0)
               a[i]=Math.min(nums[2 * i], nums[2 * i + 1]);
               else
               a[i]=Math.max(nums[2 * i], nums[2 * i + 1]);
            }
            n=a.length;
            nums=a;
        }
        return nums[0];
    }
}