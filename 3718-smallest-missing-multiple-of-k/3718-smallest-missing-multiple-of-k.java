import java.util.*;
class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums)
        set.add(num);
        int target=0;
        for(int i=k;;i+=k){
            if(set.contains(i)==false)
            {
              target=i;
              break;
            }
        }
        return target;
    }
}