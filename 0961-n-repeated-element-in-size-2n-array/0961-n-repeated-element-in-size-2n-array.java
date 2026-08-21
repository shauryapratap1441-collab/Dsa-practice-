import java.util.*;
class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        Map<Integer,Integer> map=new HashMap<>();
        int target=0;
        for(int num:nums)
        map.put(num,map.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==n)
            target=entry.getKey();
        }
        return target;
    }
}