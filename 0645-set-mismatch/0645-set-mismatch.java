import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
        set.add(num);
        }
        int duplicate=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1)
            {
                duplicate = entry.getKey();
                break;
            }
        }
        int missing=1;
        while(set.contains(missing)){
            missing++;
        }
        return new int[]{duplicate,missing};
    }
}