import java.util.*;
class Solution {
    public int minDeletion(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int count=0;
        for(int num:nums)
        list.add(num);
        for(int i=0;i<list.size()-1;i++){
           if(i%2==0){
            if (!list.get(i).equals(list.get(i+1)))
            continue;
            else{
            list.remove(i);    
            count++;
            i--;
            }
           }
        }
        if(list.size()%2==0)
        return count;
        else
        return count+1;
    }
}