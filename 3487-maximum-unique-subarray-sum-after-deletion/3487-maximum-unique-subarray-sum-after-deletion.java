import java.util.*;
class Solution {
    public int maxSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int num:nums)
        max=Math.max(num,max);
        if(max<=0)
        return max;
        Set<Integer> set=new HashSet<>();
        for(int num:nums)
        set.add(num);
        int maxsum=0;
        for(int num:set){
            if(num>0)
            maxsum+=num;
        }
        return maxsum;
    }
}