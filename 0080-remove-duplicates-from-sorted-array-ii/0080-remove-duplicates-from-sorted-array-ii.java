import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int num:nums)
        map.put(num,map.getOrDefault(num,0)+1);
        for(Map.Entry <Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1)
            list.add(entry.getKey());
            else
            {
                for(int i=0;i<2;i++)
                {
                    list.add(entry.getKey());
                }
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return list.size();
    }
}