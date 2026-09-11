import java.util.*;
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set=new HashSet<>();
        for(int num:banned)
        set.add(num);
        int count=0,csum=0;
        for(int i=1;i<=n;i++){
            if(!set.contains(i))
            {
               if(csum+i>maxSum)
               break;
               csum+=i;
               count++;
            }
        }
        return count;
    }
}