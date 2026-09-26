import java.util.*;
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Deque<Long> s=new ArrayDeque<>();
        for(int x:nums){
            long num=x;
            while(!s.isEmpty()&&s.peek()==num){
                s.pop();
                num=num+num;
            }
            s.push(num);
        }
        List<Long> list=new ArrayList(s.size());
        while(!s.isEmpty())
        list.add(s.pollLast());
        return list;
    }
}