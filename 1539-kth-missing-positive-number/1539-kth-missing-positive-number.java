import java.util.*;
class Solution {
    public int findKthPositive(int[] arr, int k) {
    Set<Integer> set=new HashSet<>();
    for(int num:arr)
    set.add(num);
    int count=0;
    int start=1;
    while(count!=k){
        if(!set.contains(start)){
           count++;
        }
        if(count==k)
        return start;
        start++;
    } 
     return start;
    }
}