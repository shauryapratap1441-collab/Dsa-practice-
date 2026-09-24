class Solution {
    public boolean sum(int k,int i){
        int sum=0;
        while(k>0){
          sum+=k%10;
          k/=10;
        }
        if(sum==i)
        return true;
        else return false;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sum(nums[i],i))
            return i;
        }
        return -1;
    }
}