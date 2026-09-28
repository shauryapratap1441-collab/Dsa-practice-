import java.util.*;
class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        map.put(num,map.getOrDefault(num,0)+1);
        int a[]=new int[2];
        int i=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1)
            a[i++]=entry.getKey();
        }
        return a;
    }
}